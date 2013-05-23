package keyCraft.client;

import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraftforge.client.MinecraftForgeClient;
import keyCraft.CommonProxy;
import keyCraft.entity.EntityPleomArrow;
import keyCraft.render.RenderPleomArrow;
import keyCraft.render.RendererItemBow;
import keyCraft.keyCore;

public class ClientProxy extends CommonProxy {
        
        @Override
        public void registerRenderers() {
                MinecraftForgeClient.preloadTexture(ITEMS_PNG);
                MinecraftForgeClient.preloadTexture(BLOCK_PNG);
                
                MinecraftForgeClient.registerItemRenderer(keyCore.pleomBow.itemID, new RendererItemBow());
        }
        
    	public void registerRenderThings(){

        	
    	}
}