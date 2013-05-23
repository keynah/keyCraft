package keyCraft.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class angelWheat extends Item {

        public angelWheat(int id) {
                super(id);
                // TODO Auto-generated constructor stub
             // Constructor Configuration
                setMaxStackSize(64);
                setCreativeTab(CreativeTabs.tabMisc);
                setUnlocalizedName("angelWheat");

        }

        public void registerIcons(IconRegister iconRegister)
        {
                 itemIcon = iconRegister.registerIcon("Keynah:angelWheat");
        }
}
