package keyCraft.handler;

import cpw.mods.fml.common.ICraftingHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import keyCraft.keyCore;

public class CustomCraftingHandler implements ICraftingHandler {
	@Override
	public void onCrafting(EntityPlayer player, ItemStack item, IInventory craftMatrix) {
		for (int i = 0; i < craftMatrix.getSizeInventory(); i++) // Checks all
																	// the slots
		{
			if (craftMatrix.getStackInSlot(i) != null) // If there is an item
			{
				ItemStack j = craftMatrix.getStackInSlot(i); // Gets the item
				if (j.getItem() != null && j.getItem() == keyCore.reinforcedStick) 
				{
					ItemStack k = new ItemStack(keyCore.reinforcedStick, 2, (j.getItemDamage() + 1)); 
					if (k.getItemDamage() >= k.getMaxDamage()) { 
						k.stackSize--; 

						
						
						
					}
					craftMatrix.setInventorySlotContents(i, k);
				}
			}
		}
		
		//HAMMER	
		for (int i = 0; i < craftMatrix.getSizeInventory(); i++) // Checks all
			// the slots
		{
			if (craftMatrix.getStackInSlot(i) != null) // If there is an item
			{
				ItemStack j = craftMatrix.getStackInSlot(i); // Gets the item
				if (j.getItem() != null && j.getItem() == keyCore.reinforcedHammer) 
				{
					ItemStack k = new ItemStack(keyCore.reinforcedHammer, 2, (j.getItemDamage() + 1)); 
					if (k.getItemDamage() >= k.getMaxDamage()) { 
						k.stackSize--; 
					}
					craftMatrix.setInventorySlotContents(i, k);
				}
			}
		}
		
		//MOLD
		for (int i = 0; i < craftMatrix.getSizeInventory(); i++) // Checks all
			// the slots
		{
			if (craftMatrix.getStackInSlot(i) != null) // If there is an item
			{
				ItemStack j = craftMatrix.getStackInSlot(i); // Gets the item
				if (j.getItem() != null && j.getItem() == keyCore.nuggetMold) 
				{
					ItemStack k = new ItemStack(keyCore.nuggetMold, 2, (j.getItemDamage() + 1)); 
					if (k.getItemDamage() >= k.getMaxDamage()) { 
						k.stackSize--; 

					}
					craftMatrix.setInventorySlotContents(i, k);
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
	}

	@Override
	public void onSmelting(EntityPlayer player, ItemStack item) {
		// TODO Auto-generated method stub
		
	}
}
