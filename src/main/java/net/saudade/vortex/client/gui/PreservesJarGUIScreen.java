package net.saudade.vortex.client.gui;

import net.saudade.vortex.world.inventory.PreservesJarGUIMenu;
import net.saudade.vortex.procedures.InventoryDescProcedure;
import net.saudade.vortex.procedures.ContainerBlockDescProcedure;
import net.saudade.vortex.init.VortexModScreens.WidgetScreen;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class PreservesJarGUIScreen extends AbstractContainerScreen<PreservesJarGUIMenu> implements WidgetScreen {
	private final static HashMap<String, Object> guistate = PreservesJarGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private final static HashMap<String, String> textstate = new HashMap<>();

	public PreservesJarGUIScreen(PreservesJarGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("vortex:textures/screens/preserves_jar_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("vortex:textures/screens/glass_bottle_border.png"), this.leftPos + 124, this.topPos + 17, 0, 0, 16, 16, 16, 16);

		RenderSystem.disableBlend();
	}

	public HashMap<String, Object> getWidgets() {
		return guistate;
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font,

				InventoryDescProcedure.execute(), 6, 73, -12829636, false);
		guiGraphics.drawString(this.font,

				ContainerBlockDescProcedure.execute(world, x, y, z), 6, 6, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
	}
}
