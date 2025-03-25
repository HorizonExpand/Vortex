package net.saudade.vortex.client.renderer;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.PostChain;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RenderLevelStageEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = "vortex", value = Dist.CLIENT)
public class ScreenEffectHandler {
    private static PostChain shader;
    private static final ResourceLocation SHADER_LOCATION = new ResourceLocation("vortex", "shaders/distortion.json");

    @SubscribeEvent
    public static void onRenderLevel(RenderLevelStageEvent event) {
        if (event.getStage() != RenderLevelStageEvent.Stage.AFTER_LEVEL) return;

        Minecraft mc = Minecraft.getInstance();
        if (mc.player != null && mc.player.getItemBySlot(EquipmentSlot.HEAD).getItem() == Vortex.DEFAMED_CRYSTAL_OUTGROWTH.get()) {
            try {
                if (shader == null) {
                    shader = new PostChain(mc.getTextureManager(), mc.getResourceManager(), 
                        mc.getMainRenderTarget(), SHADER_LOCATION);
                    shader.resize(mc.getWindow().getWidth(), mc.getWindow().getHeight());
                }
                
                shader.process(event.getPartialTick());
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            if (shader != null) {
                shader.close();
                shader = null;
            }
        }
    }
}