package dev.redy1aye.copperequipment.blocks.dryer;

import dev.redy1aye.copperequipment.Items;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

public class DryerBlockEntity extends BlockEntity implements NamedScreenHandlerFactory, ImplementedInventory {

    private final DefaultedList<ItemStack> inventory = DefaultedList.ofSize(3, ItemStack.EMPTY);
    protected final PropertyDelegate propertyDelegate;
    private int progress = 0;
    private int maxProgress = 63;

    public DryerBlockEntity(BlockPos pos, BlockState state) {
        super(Items.DRYER_BLOCK_ENTITY, pos, state);
        this.propertyDelegate = new PropertyDelegate() {
            public int get(int index) {
                switch (index) {
                    case 0: return DryerBlockEntity.this.progress;
                    case 1: return DryerBlockEntity.this.maxProgress;
                    default: return 0;
                }
            }

            public void set(int index, int value) {
                switch (index) {
                    case 0: DryerBlockEntity.this.progress = value; break;
                    case 1: DryerBlockEntity.this.maxProgress = value; break;
                }
            }

            public int size() {
                return 2;
            }
        };
    }

    @Override
    public Text getDisplayName() {
        return Text.translatable("block.copperequipment.dryer");
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory inv, PlayerEntity player) {
        return new DryerScreenHandler(syncId, inv, this, this.propertyDelegate);
    }

    @Override
    public DefaultedList<ItemStack> getItems() {
        return inventory;
    }

    @Nullable
    @Override
    public Packet<ClientPlayPacketListener> toUpdatePacket() {
        return BlockEntityUpdateS2CPacket.create(this);
    }

    @Override
    public NbtCompound toInitialChunkDataNbt() {
        return createNbt();
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);
        Inventories.readNbt(nbt, inventory);
        progress = nbt.getInt("Progress");
        maxProgress = nbt.getInt("MaxProgress");
    }

    @Override
    public void writeNbt(NbtCompound nbt) {
        Inventories.writeNbt(nbt, inventory);
        nbt.putInt("Progress", progress);
        nbt.putInt("MaxProgress", maxProgress);
        super.writeNbt(nbt);
    }

    public static void tick(World world, BlockPos pos, BlockState state, DryerBlockEntity entity) {
        if (world.isClient) return;

        if (hasRecipe(entity, world)) {
            entity.progress++;
            if (entity.progress > entity.maxProgress) {
                craftItem(entity, world);
            }
        } else {
            entity.resetProgress();
        }
        entity.markDirty();
    }

    private static boolean hasRecipe(DryerBlockEntity entity, World world) {
        SimpleInventory inventory = new SimpleInventory(entity.inventory.size());
        for (int i = 0; i < entity.inventory.size(); i++) {
            inventory.setStack(i, entity.getStack(i));
        }

        Optional<DryerRecipes> match = world.getRecipeManager()
                .getFirstMatch(DryerRecipes.Type.INSTANCE, inventory, world);

        return match.isPresent() && canInsertAmountIntoOutputSlot(inventory) &&
                canInsertItemIntoOutputSlot(inventory, match.get().getOutput(world.getRegistryManager()));
    }

    private static void craftItem(DryerBlockEntity entity, World world) {
        SimpleInventory inventory = new SimpleInventory(entity.inventory.size());
        for (int i = 0; i < entity.inventory.size(); i++) {
            inventory.setStack(i, entity.getStack(i));
        }

        Optional<DryerRecipes> match = world.getRecipeManager()
                .getFirstMatch(DryerRecipes.Type.INSTANCE, inventory, world);

        if (match.isPresent()) {
            entity.removeStack(0, 1);
            entity.setStack(2, new ItemStack(match.get().getOutput(world.getRegistryManager()).getItem(),
                    entity.getStack(2).getCount() + 1));

            if (!world.isClient()) {
                EntityType.LIGHTNING_BOLT.spawn((ServerWorld) world, entity.pos, SpawnReason.TRIGGERED);
            }

            entity.resetProgress();
        }
    }

    private void resetProgress() {
        this.progress = 0;
    }

    private static boolean canInsertItemIntoOutputSlot(SimpleInventory inventory, ItemStack output) {
        return inventory.getStack(2).isEmpty() || inventory.getStack(2).getItem() == output.getItem();
    }

    private static boolean canInsertAmountIntoOutputSlot(SimpleInventory inventory) {
        return inventory.getStack(2).getCount() < inventory.getStack(2).getMaxCount();
    }
}