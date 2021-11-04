package dev.redy1aye.copperequipment.mixin;

import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.SheepEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.function.Consumer;

@Mixin(SheepEntity.class)
public abstract class SheepEntityMixin extends LivingEntity
{
    protected SheepEntityMixin(EntityType<? extends LivingEntity> entityType, World world)
    {
        super(entityType, world);
    }

    @Shadow abstract boolean isShearable();

    @Shadow abstract void sheared(SoundCategory cat);

    @Inject(at = @At(value = "HEAD"), method = "interactMob", cancellable = true)
    private void useCopperShears(final PlayerEntity player, final Hand hand, final CallbackInfoReturnable<ActionResult> cir)
    {
        ItemStack itemStack = player.getStackInHand(hand);

        if (FabricToolTags.SHEARS.contains(itemStack.getItem()))
        {
            if (!this.world.isClient && isShearable())
            {
                this.sheared(SoundCategory.PLAYERS);
                itemStack.damage(1, (LivingEntity) player, (Consumer<LivingEntity>) ((playerEntity) -> {
                    playerEntity.sendToolBreakStatus(hand);
                }));
                cir.setReturnValue(ActionResult.SUCCESS);
            }
            else
            {
                cir.setReturnValue(ActionResult.CONSUME);
            }
        }
    }
}