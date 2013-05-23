package keyCraft.blocks;


import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class orePleom extends BlockOre {
        public orePleom(int id, int texture, Material material) {
                super(id);
                
                setHardness(2.0F); // 33% harder than diamond
                setStepSound(Block.soundStoneFootstep);
                setCreativeTab(CreativeTabs.tabBlock);
                setUnlocalizedName("orePleom");
        }
        public void registerIcons(IconRegister iconRegister)
        {
                 blockIcon = iconRegister.registerIcon("Keynah:orePleom");
        }

    }
