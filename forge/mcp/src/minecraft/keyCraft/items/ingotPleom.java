package keyCraft.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ingotPleom extends Item {

        public ingotPleom(int id) {
                super(id);
                // TODO Auto-generated constructor stub
             // Constructor Configuration
                setMaxStackSize(64);
                setCreativeTab(CreativeTabs.tabMisc);
                setUnlocalizedName("ingotPleom");

        }

        public void registerIcons(IconRegister iconRegister)
        {
                 itemIcon = iconRegister.registerIcon("Keynah:ingotPleom");
        }

}