package com.takoage.fluidpowergen.screen;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.Text;

public class FluidPowerGeneratorScreen extends Screen {
    protected FluidPowerGeneratorScreen(Text title) {
        super(title);
    }

    @Override
    protected void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {
        this.renderBackground(matrices);
        super.render(matrices, mouseX, mouseY, delta);
        drawFluidFlowRate(matrices);
        drawFETGeneration(matrices);
    }

    private void drawFluidFlowRate(MatrixStack matrices) {
        // Logic to display fluid flow rate
        drawString(matrices, this.textRenderer, "Fluid Flow Rate: \u2026", 10, 10);
    }

    private void drawFETGeneration(MatrixStack matrices) {
        // Logic to display FE/t generation
        drawString(matrices, this.textRenderer, "FE/t Generation: \u2026", 10, 30);
    }
}