package dev.redy1aye.copperequipment.mixin;

/*import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.predicate.item.ItemPredicate;

import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

import java.util.Set;

@Mixin(ItemPredicate.class)
public class ItemPredicateMixin
{
    @Shadow @Final @Nullable private Set<Item> items;

    @ModifyVariable(method = "test", at = @At("HEAD"))
    public ItemStack copperShears(ItemStack stack)
    {
        if (items != null)
        {
            if(!items.isEmpty() && FabricToolTags.SHEARS.contains(stack.getItem()))
            {
                ItemStack itemStack = new ItemStack(Items.SHEARS);
                itemStack.setCount(stack.getCount());
                itemStack.setNbt(stack.getOrCreateNbt());
                return itemStack;
            }
        }
        return stack;
    }
} */