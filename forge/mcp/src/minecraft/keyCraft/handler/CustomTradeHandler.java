package keyCraft.handler;

import java.util.Random;

import keyCraft.keyCore;

import net.minecraft.block.Block;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;
import cpw.mods.fml.common.registry.VillagerRegistry.IVillageTradeHandler;

public class CustomTradeHandler implements IVillageTradeHandler
{

@Override
public void manipulateTradesForVillager(EntityVillager villager, MerchantRecipeList recipeList, Random random)
{
recipeList.add(new MerchantRecipe(new ItemStack(Item.emerald, 4), new ItemStack(keyCore.angelSeeds, 1, 0)));
///Item.emerald is the cost and amount
///YourMod.yourItem/Block is the item or block you wish to have sold and the amount you get
}

}