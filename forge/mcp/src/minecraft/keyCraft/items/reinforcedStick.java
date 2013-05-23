package keyCraft.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class reinforcedStick extends Item {

        public reinforcedStick(int id) {
                super(id);
                
                // TODO Auto-generated constructor stub
             // Constructor Configuration
                setMaxStackSize(1);
                setCreativeTab(CreativeTabs.tabMisc);
                setUnlocalizedName("reinforcedStick");
                setMaxDamage(9000);
                isDamageable();
        }


        public void registerIcons(IconRegister iconRegister)
        {
                 itemIcon = iconRegister.registerIcon("Keynah:reinforcedStick");
        }

}