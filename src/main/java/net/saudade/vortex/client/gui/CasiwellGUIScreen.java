package net.saudade.vortex.client.gui;

import net.saudade.vortex.world.inventory.CasiwellGUIMenu;
import net.saudade.vortex.procedures.RopeSpriteIndexProcedure;
import net.saudade.vortex.network.CasiwellGUIButtonMessage;
import net.saudade.vortex.VortexMod;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class CasiwellGUIScreen extends AbstractContainerScreen<CasiwellGUIMenu> {
	private final static HashMap<String, Object> guistate = CasiwellGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_casino_rope;

	public CasiwellGUIScreen(CasiwellGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

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

		guiGraphics.blit(new ResourceLocation("vortex:textures/screens/casino_background.png"), this.leftPos + -16, this.topPos + -29, 0, 0, 208, 195, 208, 195);

		guiGraphics.blit(new ResourceLocation("vortex:textures/screens/casino_rope_sprite.png"), this.leftPos + 12, this.topPos + -18, 0, Mth.clamp((int) RopeSpriteIndexProcedure.execute(world, x, y, z) * 80, 0, 1280), 16, 80, 16, 1360);

		RenderSystem.disableBlend();
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
	}

	@Override
	public void init() {
		super.init();
		imagebutton_casino_rope = new ImageButton(this.leftPos + 13, this.topPos + -18, 14, 62, 0, 0, 62, new ResourceLocation("vortex:textures/screens/atlas/imagebutton_casino_rope.png"), 14, 124, e -> {
			if (true) {
				VortexMod.PACKET_HANDLER.sendToServer(new CasiwellGUIButtonMessage(0, x, y, z));
				CasiwellGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_casino_rope", imagebutton_casino_rope);
		this.addRenderableWidget(imagebutton_casino_rope);
	}
}
