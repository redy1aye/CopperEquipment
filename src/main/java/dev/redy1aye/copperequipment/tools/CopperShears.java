package dev.redy1aye.copperequipment.tools;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.SheepEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.Items;
import net.minecraft.item.ShearsItem;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.state.property.Properties;

public class CopperShears extends ShearsItem {
    public static final int COPPER_SHEARS_DURABILITY = 119;
    public static final int WAXED_COPPER_SHEARS_DURABILITY = 179;

    private final int maxDamage;

    public CopperShears(Settings settings, boolean isWaxed) {
        super(settings.maxDamage(isWaxed ? WAXED_COPPER_SHEARS_DURABILITY : COPPER_SHEARS_DURABILITY));
        this.maxDamage = isWaxed ? WAXED_COPPER_SHEARS_DURABILITY : COPPER_SHEARS_DURABILITY;
    }

    @Override
    public boolean canMine(BlockState state, World world, BlockPos pos, PlayerEntity miner) {
        return state.isIn(BlockTags.WOOL) || state.isOf(Blocks.COBWEB) || state.isOf(Blocks.PUMPKIN) || state.isOf(Blocks.VINE) || state.isOf(Blocks.GLOW_LICHEN) || state.isIn(BlockTags.LEAVES);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        BlockPos pos = context.getBlockPos();
        BlockState state = world.getBlockState(pos);
        PlayerEntity player = context.getPlayer();
        ItemStack stack = context.getStack();

        if (state.isOf(Blocks.PUMPKIN)) {
            if (!world.isClient) {
                world.setBlockState(pos, Blocks.CARVED_PUMPKIN.getDefaultState().with(Properties.HORIZONTAL_FACING, context.getPlayer().getHorizontalFacing().getOpposite()), 11);
                world.playSound(null, pos, SoundEvents.BLOCK_PUMPKIN_CARVE, SoundCategory.BLOCKS, 1.0F, 1.0F);
                stack.damage(1, player, (p) -> p.sendToolBreakStatus(context.getHand()));
                world.spawnEntity(new ItemEntity(world, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, new ItemStack(Items.PUMPKIN_SEEDS, 4)));
                return ActionResult.SUCCESS;
            }
            return ActionResult.CONSUME;
        }

        return ActionResult.PASS;
    }

    @Override
    public ActionResult useOnEntity(ItemStack stack, PlayerEntity user, LivingEntity entity, Hand hand) {
        if (entity instanceof SheepEntity sheep) {
            if (!entity.getWorld().isClient && sheep.isShearable()) {
                sheep.sheared(SoundCategory.PLAYERS);
                stack.damage(1, user, (p) -> p.sendToolBreakStatus(hand));
                return ActionResult.SUCCESS;
            }
            return ActionResult.CONSUME;
        }
        return super.useOnEntity(stack, user, entity, hand);
    }

    @Override
    public boolean postMine(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity miner) {
        if (!world.isClient && !state.isIn(BlockTags.FIRE)) {
            stack.damage(1, miner, (e) -> e.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND));
            if (state.isIn(BlockTags.LEAVES)) {
                world.playSound(null, pos, SoundEvents.BLOCK_GRASS_BREAK, SoundCategory.BLOCKS, 1.0F, 1.0F);
                world.spawnEntity(new ItemEntity(world, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, new ItemStack(state.getBlock().asItem())));
            }
        }
        return state.isIn(BlockTags.WOOL) || state.isOf(Blocks.COBWEB) || state.isOf(Blocks.VINE) || state.isOf(Blocks.GLOW_LICHEN) || state.isIn(BlockTags.LEAVES);
    }

    @Override
    public float getMiningSpeedMultiplier(ItemStack stack, BlockState state) {
        if (state.isOf(Blocks.COBWEB) || state.isOf(Blocks.VINE) || state.isOf(Blocks.GLOW_LICHEN) || state.isIn(BlockTags.LEAVES)) {
            return 15.0F;
        }
        if (state.isIn(BlockTags.WOOL)) {
            return 5.0F;
        }
        return super.getMiningSpeedMultiplier(stack, state);
    }

    @Override
    public boolean isSuitableFor(BlockState state) {
        return state.isIn(BlockTags.WOOL) || state.isOf(Blocks.COBWEB) || state.isOf(Blocks.VINE) || state.isOf(Blocks.GLOW_LICHEN) || state.isIn(BlockTags.LEAVES);
    }
}