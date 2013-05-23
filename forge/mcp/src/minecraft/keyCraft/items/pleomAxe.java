package keyCraft.items;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;




public class pleomAxe extends ItemAxe{
	
    public pleomAxe(int id, EnumToolMaterial enumToolMaterial) {
        super(id, enumToolMaterial);
        setMaxStackSize(1);
        setCreativeTab(CreativeTabs.tabMisc);
        setUnlocalizedName("pleomAxe");

    }
 
    public void registerIcons(IconRegister iconRegister)
    {
             itemIcon = iconRegister.registerIcon("Keynah:pleomAxe");
    }
}
