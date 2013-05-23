package keyCraft.items;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class pleomSpade extends ItemSpade{
	
    public pleomSpade(int id, EnumToolMaterial enumToolMaterial) {
        super(id, enumToolMaterial);
        setMaxStackSize(1);
        setCreativeTab(CreativeTabs.tabBlock);
        setUnlocalizedName("pleomSpade");

    }
 

    public void registerIcons(IconRegister iconRegister)
    {
             itemIcon = iconRegister.registerIcon("Keynah:pleomSpade");
    }
}