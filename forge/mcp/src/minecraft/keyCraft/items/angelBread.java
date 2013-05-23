package keyCraft.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class angelBread extends ItemFood
{
    public angelBread(int par1, int par2)
    {
        super(par1, par2, false);
        this.setMaxStackSize(1);
        this.setUnlocalizedName("angelBread");
    }
    public void registerIcons(IconRegister iconRegister)
    {
             itemIcon = iconRegister.registerIcon("Keynah:angelBread");
    }
}





