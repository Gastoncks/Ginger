package fr.gastoncks.ginger;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import fr.gastoncks.ginger.block.ModBlocks;
import net.minecraft.client.render.RenderLayer;

public class GingerClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GINGER_CROP, RenderLayer.getCutout());
    }
}
