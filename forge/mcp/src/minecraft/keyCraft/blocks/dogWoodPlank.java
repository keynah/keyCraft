package keyCraft.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.World;

public class dogWoodPlank extends Block {
        public dogWoodPlank(int id, int texture, Material material) {
                super(id, material);
                setHardness(2.0F);
                setCreativeTab(CreativeTabs.tabBlock);
                setUnlocalizedName("dogWoodPlank");
        }

        public void registerIcons(IconRegister iconRegister)
        {
                 blockIcon = iconRegister.registerIcon("Keynah:dogWoodPlank");
        }

        
        //Stop End of Code
        
        
}
