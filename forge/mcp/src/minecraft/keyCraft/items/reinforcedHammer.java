package keyCraft.items;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class reinforcedHammer extends Item {

        public reinforcedHammer(int id) {
                super(id);
                
                // TODO Auto-generated constructor stub
             // Constructor Configuration
                setMaxStackSize(1);
                setCreativeTab(CreativeTabs.tabMisc);
                setUnlocalizedName("reinforcedHammer");
                setMaxDamage(128);
                isDamageable();
        }


        public void registerIcons(IconRegister iconRegister)
        {
                 itemIcon = iconRegister.registerIcon("Keynah:reinforcedHammer");
        }
        public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
        {
        par3List.add("128 uses");
        }
}