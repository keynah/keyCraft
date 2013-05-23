package keyCraft.items;

import net.minecraft.item.ItemSword;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class pleomSword extends ItemSword{
	
    public pleomSword(int id, EnumToolMaterial enumToolMaterial) {
        super(id, enumToolMaterial);
        setMaxStackSize(1);
        setCreativeTab(CreativeTabs.tabMisc);
        setUnlocalizedName("pleomSword");

    }
 

    public void registerIcons(IconRegister iconRegister)
    {
             itemIcon = iconRegister.registerIcon("Keynah:pleomSword");
    }

}