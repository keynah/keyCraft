package keyCraft;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.common.registry.VillagerRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.oredict.OreDictionary;
import keyCraft.CommonProxy;
import keyCraft.items.*;
import keyCraft.blocks.*;
import keyCraft.entity.*;
import keyCraft.events.*;
import keyCraft.handler.*;
import keyCraft.render.*;
import keyCraft.tabs.*;
import keyCraft.worldgen.*;





@Mod(modid="KeyCraft", name="KeyCraft", version="1.5.2")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class keyCore {

        // The instance of your mod that Forge uses.
        @Instance("KeyCraft")
        public static keyCore instance;
        
        
        // Says where the client and server 'proxy' code is loaded.
        @SidedProxy(clientSide="keyCraft.client.ClientProxy", serverSide="keyCraft.CommonProxy")
        public static CommonProxy proxy;
        
        
        
        
        //KeyCraft items
        public static Item itemPleom;
        public static Item ingotPleom;
        public static Item reinforcedStick;
        public static Item angelSeeds;
        public static Item angelWheat;
        public static Item angelBread;
        public static Item pleomArrow;
        public static Item pleomBow;
        public static Item itemDogWoodDoor;
        public static Item pleomNugget;
        public static Item nuggetMold;
        public static Item reinforcedHammer;
        
        public static Item pleomSword;
        public static Item pleomPickaxe;
        public static Item pleomSpade;
        public static Item pleomAxe;

        //KeyCraft Blocks
        public static Block orePleom;
        public static Block pleomBlock;
        public static Block dogWoodLog;
        public static Block dogWoodLeaves;
        public static Block dogWoodSapling;
        public static Block angelCrop;
        public static Block dogWoodPlank;
        public static Block doorDogWood;
        
        //KeyCraft ItemIDs
        public static int itemPleomID;
        public static int ingotPleomID;
        public static int reinforcedStickID;
        public static int angelSeedsID;
        public static int angelWheatID;
        public static int angelBreadID;
        public static int pleomArrowID;
        public static int pleomBowID;
        public static int itemDogWoodDoorID;
        public static int pleomNuggetID;
        public static int nuggetMoldID; 
        public static int reinforcedHammerID;
        
        public static int pleomSwordID;
        public static int pleomPickaxeID;
        public static int pleomSpadeID;
        public static int pleomAxeID;
        
        //KeyCraft BlockIDs
        public static int orePleomID;
        public static int pleomBlockID;
        public static int dogWoodLogID;
        public static int dogWoodLeavesID;
        public static int dogWoodSaplingID;
        public static int angelCropID;
        public static int dogWoodPlankID;
        public static int doorDogWoodID;
        
        public static CreativeTabs tabKey = new tabKey(CreativeTabs.getNextID(), "tabNetherCraft");
        public static CreativeTabs tabKeyTool = new tabKeyTool(CreativeTabs.getNextID(), "tabNetherCraftTool");
        
        //Gui Handler
        
  
        public static EnumToolMaterial PLEOM = EnumHelper.addToolMaterial("PLEOM", 2, 532, 9F, 1, 22);
        public static EnumToolMaterial PYRIDIUM = EnumHelper.addToolMaterial("PYRIDIUM", 3, 1280, 18F, 1, 22);
        
   
        
    	
        
        
        
        
        
        
        
        
        //End of SidedProxy
        @PreInit
        public void preInit(FMLPreInitializationEvent event) {
                // Stub Method
        	MinecraftForge.EVENT_BUS.register(new keyCraft_EventBonemeal());
        	 
    		RenderingRegistry.registerEntityRenderingHandler(EntityPleomArrow.class, new RenderPleomArrow());
    		EntityRegistry.registerModEntity(EntityPleomArrow.class, "pleomArrow", 0, this, 128, 1, true);
        	EntityRegistry.registerGlobalEntityID(EntityPleomArrow.class, "pleomArrow", EntityRegistry.findGlobalUniqueEntityId());
        	VillagerRegistry.instance().registerVillageTradeHandler(0, new CustomTradeHandler());
        	GameRegistry.registerCraftingHandler(new CustomCraftingHandler());
        	
        	
        	Configuration config = new Configuration(event.getSuggestedConfigurationFile());
            config.load();
            
            //Config Block
            orePleomID = config.get("Block IDs:", "Pleom Ore", 804).getInt();
            pleomBlockID = config.get("Block IDs:", "Pleom Block", 805).getInt();
        	dogWoodLogID = config.get("Block IDs", "Dogwood Log", 806).getInt();
        	dogWoodLeavesID = config.get("Block IDs", "Dogwood Leaves", 807).getInt();
        	dogWoodSaplingID = config.get("Block IDs", "Dogwood Sapling", 808).getInt();
        	angelCropID = config.get("Block IDs", "Angel Crop", 809).getInt();
        	dogWoodPlankID = config.get("Block IDs", "Dogwood Plank", 910).getInt();
        	doorDogWoodID = config.get("Block IDs", "Dogwood Door Block", 911).getInt();
        	
        	//Config Item
        	itemPleomID = config.get("Item IDs", "Pleom", 5050).getInt();
        	ingotPleomID = config.get("Item IDs", "Pleom Ingot", 5051).getInt();
        	
        	pleomSwordID = config.get("Item IDs", "Pleom Sword", 5052).getInt();
        	pleomPickaxeID = config.get("Item IDs", "Pleom Pickaxe", 5053).getInt();
        	pleomSpadeID = config.get("Item IDs", "Pleom Spade", 5054).getInt();
        	pleomAxeID = config.get("Item IDs", "Pleom Axe", 5055).getInt();
        	
        	reinforcedStickID = config.get("Item IDs", "Reinforced Stick", 5057).getInt();
        	angelSeedsID = config.get("Item IDs", "Angel Seeds", 5058).getInt();
        	angelWheatID = config.get("Item IDs", "Angel Wheat", 5059).getInt();
        	angelBreadID = config.get("Item IDs", "Angel Bread", 5060).getInt();
        	
        	pleomArrowID = config.get("Item IDs", "Pleom Arrow", 5062).getInt();
        	pleomBowID = config.get("Item IDs", "Pleom Bow", 5063).getInt();
        	
        	itemDogWoodDoorID = config.get("Item IDs", "Dogwood Door Item", 5064).getInt();
        	
        	pleomNuggetID = config.get("Item IDs", "Pleom Nugget", 5086).getInt();
        	nuggetMoldID = config.get("Item IDs", "Nugget Mold", 5087).getInt();
        	reinforcedHammerID = config.get("Item IDs", "Reinforced Hammer", 5088).getInt();
        	
        	//GuiHandler Insert Here
        	
        	
        	
        	//Ore Generation
        	GameRegistry.registerWorldGenerator(new WorldGenPleom());
        	
        	config.save();
            

        	
            loadItems();
            loadBlocks();
            registerBlocks();
            registerItems();
            setNames();
            addRecipes();
            setHarvestLevels();
            setToolClass();
        	oreDictionary();
        	
        	proxy.registerRenderers();
        	
        	
        	//End of PreINT
        }
        
        @Init
        public void load(FMLInitializationEvent event) {
                proxy.registerRenderers();
                
                proxy.registerRenderers();

        }
        @PostInit
        public void postInit(FMLPostInitializationEvent event) {
        		
        	//End Of PostInt
        }
        
        
        private void loadBlocks() {
        	
        	orePleom = new orePleom(orePleomID, 1, Material.iron).setCreativeTab(tabKey);
        	pleomBlock = new pleomBlock(pleomBlockID, 1, Material.iron).setCreativeTab(tabKey);
        	dogWoodLog = new dogWoodLog(dogWoodLogID).setCreativeTab(tabKey);
        	dogWoodLeaves = new dogWoodLeaves(dogWoodLeavesID).setCreativeTab(tabKey);
        	dogWoodSapling = new dogWoodSapling(dogWoodSaplingID).setCreativeTab(tabKey);
        	angelCrop = new angelCrop(angelCropID);
        	dogWoodPlank = new dogWoodPlank(dogWoodPlankID, 1, Material.wood).setCreativeTab(tabKey);
        	doorDogWood = new doorDogWood(doorDogWoodID, Material.wood);
        	//End of LoadBlocks
        }
        
        private void loadItems() {
        	
        	//tools
        	pleomSword = new pleomSword(pleomSwordID, PLEOM).setCreativeTab(tabKeyTool);
        	pleomPickaxe = new pleomPickaxe(pleomPickaxeID, PLEOM).setCreativeTab(tabKeyTool);
        	pleomSpade = new pleomSpade(pleomSpadeID, PLEOM).setCreativeTab(tabKeyTool);
        	pleomAxe = new pleomAxe(pleomAxeID, PLEOM).setCreativeTab(tabKeyTool);
        	
        	//Items
        	itemPleom = new itemPleom(itemPleomID).setCreativeTab(tabKey);
        	ingotPleom = new ingotPleom(ingotPleomID).setCreativeTab(tabKey);
        	reinforcedStick = new reinforcedStick(reinforcedStickID).setCreativeTab(tabKey);
        	angelSeeds = new angelSeeds(angelSeedsID, angelCropID, Block.dirt.blockID).setCreativeTab(tabKey);
        	angelWheat = new angelWheat(angelWheatID).setCreativeTab(tabKey);
        	angelBread = new angelBread(angelBreadID, 5).setCreativeTab(tabKey);
        	pleomArrow = new pleomArrow(pleomArrowID).setCreativeTab(tabKey);
        	pleomBow = new pleomBow(pleomBowID).setCreativeTab(tabKey);
        	itemDogWoodDoor = new itemDogWoodDoor(itemDogWoodDoorID, Material.wood).setCreativeTab(tabKey);
        	
        	//Custom
        	pleomNugget = new pleomNugget(pleomNuggetID).setCreativeTab(tabKey);
        	nuggetMold = new nuggetMold(nuggetMoldID).setCreativeTab(tabKey);
        	reinforcedHammer = new reinforcedHammer(reinforcedHammerID).setCreativeTab(tabKey);
        	
        	//End of loadItems
        }
        
        private void registerBlocks() {
        	
        	//Blocks
        	GameRegistry.registerBlock(orePleom, "orePleom");
        	GameRegistry.registerBlock(pleomBlock, "pleomBlock");
        	GameRegistry.registerBlock(dogWoodLog, "dogWoodLog");
        	GameRegistry.registerBlock(dogWoodLeaves, "dogWoodLeaves");
        	GameRegistry.registerBlock(dogWoodSapling, "dogWoodSapling");
        	GameRegistry.registerBlock(angelCrop, "angelCrop");
        	GameRegistry.registerBlock(dogWoodPlank, "dogWoodPlanks");
        	GameRegistry.registerBlock(doorDogWood, "doorDogWood");
        	
        	//End of RegBlocks
        }
        
        private void registerItems() {
        	GameRegistry.registerItem(itemPleom, "itemPleom");
        	GameRegistry.registerItem(ingotPleom, "ingotPleom");
        	GameRegistry.registerItem(reinforcedStick, "reinforcedStick");
        	GameRegistry.registerItem(angelWheat, "angelWheat");
        	GameRegistry.registerItem(angelBread, "angelBread");
        	GameRegistry.registerItem(angelSeeds, "angelSeeds");
        	GameRegistry.registerItem(pleomSword, "pleomSword");
        	GameRegistry.registerItem(pleomPickaxe, "pleomPickaxe");
        	GameRegistry.registerItem(pleomSpade, "pleomSpade");
        	GameRegistry.registerItem(pleomAxe, "pleomAxe");
        	GameRegistry.registerItem(pleomArrow, "pleomArrow");
        	GameRegistry.registerItem(pleomBow, "pleomBow");
        	GameRegistry.registerItem(itemDogWoodDoor, "itemDogWoodDoor");
        	GameRegistry.registerItem(pleomNugget, "pleomNugget");
        	GameRegistry.registerItem(nuggetMold,"nuggetMold");
        	GameRegistry.registerItem(reinforcedHammer, "reinforcedHammer");
        	
        	//End of RegItems
        }
        
        private void setNames() {
        	
        	//Items
        	LanguageRegistry.addName(itemPleom, "Pleom");
            LanguageRegistry.addName(ingotPleom, "Pleom Ingot");
            LanguageRegistry.addName(reinforcedStick, "Reinforced Stick");
            LanguageRegistry.addName(pleomSword, "Pleom Sword");
            LanguageRegistry.addName(pleomPickaxe, "Pleom Pickaxe");
            LanguageRegistry.addName(pleomSpade, "Pleom Spade");
            LanguageRegistry.addName(pleomAxe, "Pleom Axe");
            LanguageRegistry.addName(angelWheat, "Angel Wheat");
            LanguageRegistry.addName(angelBread, "Angel Bread");
            LanguageRegistry.addName(angelSeeds, "Angel Seeds");
            LanguageRegistry.addName(pleomArrow, "Pleom Arrow");
            LanguageRegistry.addName(pleomBow, "Pleom Bow");
            LanguageRegistry.addName(itemDogWoodDoor, "Dogwood Door");
            LanguageRegistry.addName(pleomNugget, "Pleom Nugget");
            LanguageRegistry.addName(nuggetMold, "Wooden Nugget Mold");
            LanguageRegistry.addName(reinforcedHammer, "Reinforced Hammer");
            
        	
            //Blocks
            LanguageRegistry.addName(orePleom, "Pleom Ore");
            LanguageRegistry.addName(pleomBlock, "Pleom Block");
            LanguageRegistry.addName(dogWoodLeaves, "White Dogwood Leaves");
            LanguageRegistry.addName(dogWoodLog, "White Dogwood Log");
            LanguageRegistry.addName(dogWoodSapling, "White Dogwood Sapling");
            LanguageRegistry.addName(angelCrop, "Angel Crop");
            LanguageRegistry.addName(dogWoodPlank, "White Dogwood Plank");
            LanguageRegistry.addName(doorDogWood, "White Dogwood Door");
            
            
            
            //Tabs
            LanguageRegistry.instance().addStringLocalization("itemGroup.tabKey", "en_US", "KeyCraft Blocks");
            LanguageRegistry.instance().addStringLocalization("itemGroup.tabKeyTool", "en_US", "KeyCraft Tools");
            
            
            //Arrow
            LanguageRegistry.instance().addStringLocalization("entity.keyCraft.PleomArrow.name", "Pleom Arrow");
            
            
        	//End of setNames
        }
        
        private void addRecipes() {
        	
        	ItemStack pleomStack = new ItemStack(itemPleom);
            ItemStack pleomIngotStack = new ItemStack(ingotPleom);
            ItemStack pleomOre = new  ItemStack(orePleom);
            ItemStack reStickStack = new ItemStack(reinforcedStick);
            ItemStack StickStack = new ItemStack(Item.stick);
            ItemStack CobbleStack = new ItemStack(Block.cobblestone);
            ItemStack AWStack = new ItemStack(angelWheat);
            ItemStack featherStack = new ItemStack(Item.feather);
            ItemStack stringStack = new ItemStack(Item.silk);
            ItemStack dWPStack = new ItemStack(dogWoodPlank);
            ItemStack dWLStack = new ItemStack(dogWoodLog);
            ItemStack HStack = new ItemStack(reinforcedHammer, 1, OreDictionary.WILDCARD_VALUE);
            ItemStack MStack = new ItemStack(nuggetMold, 1, OreDictionary.WILDCARD_VALUE);
            ItemStack NStack = new ItemStack(pleomNugget);
            ItemStack PlankStack = new ItemStack(Block.planks);
            ItemStack GNStack = new ItemStack(Item.goldNugget);
            
            
            GameRegistry.addRecipe(new ItemStack(pleomBlock), "xyx", "xxx", "xxx",
                    'x', pleomIngotStack, 'y', pleomIngotStack);
            GameRegistry.addRecipe(new ItemStack(itemPleom), "xy", "yx", 
                    'x', pleomIngotStack, 'y', pleomIngotStack);
            GameRegistry.addRecipe(new ItemStack(reinforcedStick), "x", "y", "x", 
                    'x', CobbleStack, 'y', StickStack);
            GameRegistry.addRecipe(new ItemStack(angelBread),"xxx",
                    'x', AWStack);
            
            //Pleom Tools
            GameRegistry.addRecipe(new ItemStack(pleomSpade), "x", "y", "y" ,
                    'x', pleomIngotStack, 'y', reStickStack);
            GameRegistry.addRecipe(new ItemStack(pleomPickaxe), "xxx", "y", "y" ,
                    'x', pleomIngotStack, 'y', reStickStack);
            GameRegistry.addRecipe(new ItemStack(pleomAxe), "xx ", "xy", "y" ,
                    'x', pleomIngotStack, 'y', reStickStack);
            GameRegistry.addRecipe(new ItemStack(pleomAxe), "xx ", "yx", "y" ,
                    'x', pleomIngotStack, 'y', reStickStack);
            GameRegistry.addRecipe(new ItemStack(pleomSword), "x", "x", "y" ,
                    'x', pleomIngotStack, 'y', reStickStack);
           
            //Pleom Bow
            GameRegistry.addRecipe(new ItemStack(pleomArrow), "x", "y", "z" ,
                    'x', NStack, 'y', reStickStack, 'z', featherStack);
            GameRegistry.addRecipe(new ItemStack(pleomBow), " xz", "y z", " xz" ,
                    'x', pleomIngotStack, 'y', reStickStack, 'z', stringStack);
           
            //Dogwood Planks
            GameRegistry.addShapelessRecipe(new ItemStack(dogWoodPlank, 4), new ItemStack(dogWoodLog));
            
            GameRegistry.addRecipe(new ItemStack(itemDogWoodDoor), "xx", "xx", "xx" ,
                    'x', dWPStack, 'y', reStickStack);
            GameRegistry.addRecipe(new ItemStack(pleomNugget, 4), "zx",
                    'x', pleomIngotStack, 'y', HStack, 'z', MStack);
            GameRegistry.addRecipe(new ItemStack(nuggetMold), "xxx", "xyx", "xxx" ,
                    'x', PlankStack, 'y', GNStack);
            
            
            
            
            GameRegistry.addSmelting(orePleomID, new ItemStack(ingotPleom), 0.1f);
        	
        	
        	
        	
        	
        	
        	
        	
        	//End of AddRecipes
        }
        
        private void setHarvestLevels() {
        	
        	MinecraftForge.setBlockHarvestLevel(orePleom, "pickaxe", 2);
        	MinecraftForge.setBlockHarvestLevel(pleomBlock, "pickaxe", 1);
        	
        	
        	
        	//end of setHarvestLevels
        }
    
        
        private void setToolClass () {
        	MinecraftForge.setToolClass(pleomSpade, "shovel", 2);
            MinecraftForge.setToolClass(pleomPickaxe, "pickaxe", 2);
            MinecraftForge.setToolClass(pleomAxe, "axe", 2);
        	
        	
        	
        	
        	
        	
        	//end of setToolClass
        }
        
        private void oreDictionary () {
        	
        	int k = OreDictionary.getOreID(new ItemStack(Block.planks));
        	
        	OreDictionary.registerOre(k, new ItemStack(keyCore.dogWoodPlank));
        }
        

}
