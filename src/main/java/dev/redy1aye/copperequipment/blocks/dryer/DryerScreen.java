package dev.redy1aye.copperequipment.blocks.dryer;

import dev.redy1aye.copperequipment.Mod;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class DryerScreen extends HandledScreen<DryerScreenHandler> {
    private static final Identifier DRYER_TEXTURE =
            new Identifier(Mod.MOD_ID, "textures/gui/dryer.png");

    public DryerScreen(DryerScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title);
    }

    @Override
    protected void drawBackground(DrawContext context, float delta, int mouseX, int mouseY) {
        int x = (width - backgroundWidth) / 2;
        int y = (height - backgroundHeight) / 2;
        context.drawTexture(DRYER_TEXTURE, x, y, 0, 0, backgroundWidth, backgroundHeight);

        /* if(handler.isLightningStorm()) {
            context.drawTexture(DRYER_TEXTURE, x + 140, y + 35, 176, 0, 14, 14);
        } */

        if(handler.isCrafting()) {
            int progress = handler.getScaledProgress();
            context.drawTexture(DRYER_TEXTURE, x + 98, y + 37, 176, 37, progress, 24);
        }
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        renderBackground(context, mouseX, mouseY, delta);
        super.render(context, mouseX, mouseY, delta);
        drawMouseoverTooltip(context, mouseX, mouseY);
    }

    @Override
    protected void init() {
        super.init();
        titleX = (backgroundWidth - textRenderer.getWidth(title)) / 2;
    }
}