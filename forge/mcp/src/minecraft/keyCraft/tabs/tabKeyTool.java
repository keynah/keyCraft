package keyCraft.tabs;

import keyCraft.keyCore;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class tabKeyTool extends CreativeTabs {

	public tabKeyTool(int par1, String par2Str) {
		super(par1, par2Str);
		// TODO Auto-generated constructor stub
	}

	   @SideOnly(Side.CLIENT)

	    /**
	     * the itemID for the item to be displayed on the tab
	     */
	    public int getTabIconItemIndex()
	    {
		   return keyCore.ingotPleom.itemID;
	    }
	   
	   public String getTranslatedTabLabel(){
		   return "KeyCraft Tools";
	   }
}
