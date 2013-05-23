package keyCraft.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class pleomNugget extends Item {

        public pleomNugget(int id) {
                super(id);
                // TODO Auto-generated constructor stub
             // Constructor Configuration
                setMaxStackSize(64);
                setCreativeTab(CreativeTabs.tabMisc);
                setUnlocalizedName("pleomNugget");

        }

        public void registerIcons(IconRegister iconRegister)
        {
                 itemIcon = iconRegister.registerIcon("Keynah:pleomNugget");
        }
}