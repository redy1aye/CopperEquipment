package dev.redy1aye.copperequipment.blocks.dryer;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.minecraft.inventory.CraftingInventory;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.recipe.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.JsonHelper;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.world.World;

public class DryerRecipes implements Recipe<SimpleInventory> {

    private final Identifier id;
    private final ItemStack result;
    private final DefaultedList<Ingredient> recipeItems;

    public DryerRecipes(Identifier id, ItemStack result,
                                    DefaultedList<Ingredient> recipeItems) {
        this.id = id;
        this.recipeItems = recipeItems;
        this.result = result;
    }

    public boolean matches(SimpleInventory inventory, World world) {
        recipeItems.get(0).test(inventory.getStack(0));
        return false;
    }

    @Override
    public ItemStack getOutput() {
        return result.copy();
    }

    @Override
    public Identifier getId() {
        return id;
    }

    @Override
    public ItemStack craft(SimpleInventory inventory) {
        return this.getOutput().copy();
    }

    @Override
    public boolean fits(int width, int height) {
        return true;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return Serializer.INSTANCE;
    }

    @Override
    public RecipeType<?> getType() {
        return Type.INSTANCE;
    }

    public static class Type implements RecipeType<DryerRecipes> {
        private Type() { }
        public static final Type INSTANCE = new Type();
        public static final String ID = "drying";
    }

    public static class Serializer implements RecipeSerializer<DryerRecipes> {
        public static final Serializer INSTANCE = new Serializer();
        public static final String ID = "drying";

        @Override
        public DryerRecipes read(Identifier id, JsonObject json) {
            ItemStack output = ShapedRecipe.outputFromJson(JsonHelper.getObject(json, "result"));

            JsonArray ingredients = JsonHelper.getArray(json, "ingredients");
            DefaultedList<Ingredient> inputs = DefaultedList.ofSize(1, Ingredient.EMPTY);

            for (int i = 0; i < inputs.size(); i++) {
                inputs.set(i, Ingredient.fromJson(ingredients.get(i)));
            }

            return new DryerRecipes(id, output, inputs);
        }

        @Override
        public DryerRecipes read(Identifier id, PacketByteBuf buf) {
            DefaultedList<Ingredient> inputs = DefaultedList.ofSize(buf.readInt(), Ingredient.EMPTY);

            for (int i = 0; i < inputs.size(); i++) {
                inputs.set(i, Ingredient.fromPacket(buf));
            }

            ItemStack output = buf.readItemStack();
            return new DryerRecipes(id, output, inputs);
        }

        @Override
        public void write(PacketByteBuf buf, DryerRecipes recipe) {
            buf.writeInt(recipe.getIngredients().size());
            for (Ingredient ing : recipe.getIngredients()) {
                ing.write(buf);
            }

            buf.writeItemStack(recipe.getOutput());
        }
    }
}