package com.github.thebenknee.moundmod;

import org.apache.logging.log4j.Logger;

import com.github.thebenknee.moundmod.blocks.GDoorBlock;
import com.github.thebenknee.moundmod.blocks.GSaplingBlock;
import com.github.thebenknee.moundmod.blocks.GoblinButton;
import com.github.thebenknee.moundmod.blocks.GoblinLadder;
import com.github.thebenknee.moundmod.blocks.GoblinPressureBlock;
import com.github.thebenknee.moundmod.blocks.GoblinStair;
import com.github.thebenknee.moundmod.blocks.GrassyBlock;
import com.github.thebenknee.moundmod.blocks.TurnipBlock;
import com.github.thebenknee.moundmod.blocks.trees.GoblinTree;
import com.github.thebenknee.moundmod.init.MoundArmorMaterials;
import com.github.thebenknee.moundmod.init.MoundBiomes;
import com.github.thebenknee.moundmod.init.MoundBlocks;
import com.github.thebenknee.moundmod.init.MoundEntities;
import com.github.thebenknee.moundmod.init.MoundFood;
import com.github.thebenknee.moundmod.init.MoundItems;
import com.github.thebenknee.moundmod.init.MoundToolMaterials;
import com.github.thebenknee.moundmod.items.CustomAxeItem;
import com.github.thebenknee.moundmod.items.CustomBowItem;
import com.github.thebenknee.moundmod.items.CustomPickaxeItem;
import com.github.thebenknee.moundmod.items.GobarArmor;
import com.github.thebenknee.moundmod.util.ArmorUtil;
import com.github.thebenknee.moundmod.world.biomes.DiseasedBiome;
import com.github.thebenknee.moundmod.world.biomes.GoblinForestBiome;

import net.minecraft.block.AnvilBlock;
import net.minecraft.block.Block;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.block.FlowerBlock;
import net.minecraft.block.GravelBlock;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.LogBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.entity.EntityType;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.BlockNamedItem;
import net.minecraft.item.EggItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.TridentItem;
import net.minecraft.potion.Effects;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.client.event.InputUpdateEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class MoundModRegistries 
{
	public static final ItemGroup MOUND = MoundMod.MOUND;
	public static final Logger LOGGER = MoundMod.LOGGER;
	public static final String MODID = MoundMod.MODID;
	
		@SubscribeEvent
		public static void registerItems(final RegistryEvent.Register<Item> event)
		{
			event.getRegistry().registerAll
			(
					
					//Items
					MoundItems.goblin_heart = new Item(new Item.Properties().group(MOUND)).setRegistryName(location("goblin_heart")),		
					MoundItems.gobar_ingot = new Item(new Item.Properties().group(MOUND)).setRegistryName(location("gobar_ingot")),
					MoundItems.infused_gobar_ingot = new Item(new Item.Properties().group(MOUND)).setRegistryName(location("infused_gobar_ingot")),
					MoundItems.amethyst = new Item(new Item.Properties().group(MOUND)).setRegistryName(location("amethyst")),
					MoundItems.angry_egg = new EggItem(new Item.Properties().group(MOUND)).setRegistryName(location("angry_egg")),
							
							
					//Food
					MoundItems.goblin_flesh = new Item(new Item.Properties().group(MOUND).food(MoundFood.GOBLIN_FLESH)).setRegistryName(location("goblin_flesh")),
					MoundItems.goblin_jerky = new Item(new Item.Properties().group(MOUND).food(MoundFood.GOBLIN_JERKY)).setRegistryName(location("goblin_jerky")),
					MoundItems.sinister_apple = new Item(new Item.Properties().group(MOUND).food(MoundFood.SINISTER_APPLE)).setRegistryName(location("sinister_apple")),
					MoundItems.turnip = new BlockNamedItem(MoundBlocks.turnip, new Item.Properties().group(MOUND).food(MoundFood.TURNIP)).setRegistryName(location("turnip")),
					
					
					//Tools
					MoundItems.gobar_axe = new CustomAxeItem(MoundToolMaterials.gobar, 1.5F, -3.1F, new Item.Properties().group(MOUND)).setRegistryName(location("gobar_axe")),					
					MoundItems.gobar_pickaxe = new CustomPickaxeItem(MoundToolMaterials.gobar, -3, -2.8F, new Item.Properties().group(MOUND)).setRegistryName(location("gobar_pickaxe")),							
					MoundItems.gobar_sword = new SwordItem(MoundToolMaterials.gobar, -1, -2.4F, new Item.Properties().group(MOUND)).setRegistryName(location("gobar_sword")),
					MoundItems.gobar_shovel = new ShovelItem(MoundToolMaterials.gobar, -3.5F, -3.0F, new Item.Properties().group(MOUND)).setRegistryName(location("gobar_shovel")),						
					MoundItems.gobar_hoe = new HoeItem(MoundToolMaterials.gobar, -0.5F, new Item.Properties().group(MOUND)).setRegistryName(location("gobar_hoe")),
					
					MoundItems.infused_gobar_axe = new CustomAxeItem(MoundToolMaterials.infused_gobar, 1.0F, -2.9F, new Item.Properties().group(MOUND)).setRegistryName(location("infused_gobar_axe")),							
					MoundItems.infused_gobar_pickaxe = new CustomPickaxeItem(MoundToolMaterials.infused_gobar, -4, -2.8F, new Item.Properties().group(MOUND)).setRegistryName(location("infused_gobar_pickaxe")),									
					MoundItems.infused_gobar_sword = new SwordItem(MoundToolMaterials.infused_gobar, -1, -2.4F, new Item.Properties().group(MOUND)).setRegistryName(location("infused_gobar_sword")), //7 attack dmg -2
					MoundItems.infused_gobar_shovel = new ShovelItem(MoundToolMaterials.infused_gobar, -2.0F, -3.0F, new Item.Properties().group(MOUND)).setRegistryName(location("infused_gobar_shovel")),							
					MoundItems.infused_gobar_hoe = new HoeItem(MoundToolMaterials.infused_gobar, 0.5F, new Item.Properties().group(MOUND)).setRegistryName(location("infused_gobar_hoe")),
					
					MoundItems.spear = new TridentItem(new Item.Properties().group(MOUND)).setRegistryName(location("spear")),
					MoundItems.goblin_bow = new CustomBowItem(new Item.Properties().group(MOUND)).setRegistryName(location("goblin_bow")),
					
					
					//Armor
					MoundItems.gobar_helmet = new GobarArmor(MoundArmorMaterials.gobar, EquipmentSlotType.HEAD, new Item.Properties().group(MOUND)).setRegistryName(location("gobar_helmet")),
					MoundItems.gobar_chestplate = new GobarArmor(MoundArmorMaterials.gobar, EquipmentSlotType.CHEST, new Item.Properties().group(MOUND)).setRegistryName(location("gobar_chestplate")),
					MoundItems.gobar_leggings = new GobarArmor(MoundArmorMaterials.gobar, EquipmentSlotType.LEGS, new Item.Properties().group(MOUND)).setRegistryName(location("gobar_leggings")),
					MoundItems.gobar_boots = new GobarArmor(MoundArmorMaterials.gobar, EquipmentSlotType.FEET, new Item.Properties().group(MOUND)).setRegistryName(location("gobar_boots")),
					
					MoundItems.infused_gobar_helmet = new ArmorItem(MoundArmorMaterials.infused_gobar, EquipmentSlotType.HEAD, new Item.Properties().group(MOUND)).setRegistryName(location("infused_gobar_helmet")),
					MoundItems.infused_gobar_chestplate = new ArmorItem(MoundArmorMaterials.infused_gobar, EquipmentSlotType.CHEST, new Item.Properties().group(MOUND)).setRegistryName(location("infused_gobar_chestplate")),
					MoundItems.infused_gobar_leggings = new ArmorItem(MoundArmorMaterials.infused_gobar, EquipmentSlotType.LEGS, new Item.Properties().group(MOUND)).setRegistryName(location("infused_gobar_leggings")),
					MoundItems.infused_gobar_boots = new ArmorItem(MoundArmorMaterials.infused_gobar, EquipmentSlotType.FEET, new Item.Properties().group(MOUND)).setRegistryName(location("infused_gobar_boots")),
					
					MoundItems.straw_hat = new ArmorItem(MoundArmorMaterials.straw, EquipmentSlotType.HEAD, new Item.Properties().group(MOUND)).setRegistryName(location("straw_hat")),
					MoundItems.straw_tunic = new ArmorItem(MoundArmorMaterials.straw, EquipmentSlotType.CHEST, new Item.Properties().group(MOUND)).setRegistryName(location("straw_tunic")),
					MoundItems.straw_pants = new ArmorItem(MoundArmorMaterials.straw, EquipmentSlotType.LEGS, new Item.Properties().group(MOUND)).setRegistryName(location("straw_pants")),
					MoundItems.straw_boots = new ArmorItem(MoundArmorMaterials.straw, EquipmentSlotType.FEET, new Item.Properties().group(MOUND)).setRegistryName(location("straw_boots")),
					
					
					//Blocks
					MoundItems.block_heart = new BlockItem(MoundBlocks.block_heart, new Item.Properties().group(MOUND)).setRegistryName(MoundBlocks.block_heart.getRegistryName()),
					MoundItems.block_gobar = new BlockItem(MoundBlocks.block_gobar, new Item.Properties().group(MOUND)).setRegistryName(MoundBlocks.block_gobar.getRegistryName()),
					MoundItems.block_infused_gobar = new BlockItem(MoundBlocks.block_infused_gobar, new Item.Properties().group(MOUND)).setRegistryName(MoundBlocks.block_infused_gobar.getRegistryName()),
					MoundItems.block_amethyst = new BlockItem(MoundBlocks.block_amethyst, new Item.Properties().group(MOUND)).setRegistryName(MoundBlocks.block_amethyst.getRegistryName()),
					MoundItems.ore_gobar = new BlockItem(MoundBlocks.ore_gobar, new Item.Properties().group(MOUND)).setRegistryName(MoundBlocks.ore_gobar.getRegistryName()),
					MoundItems.goblin_dirt = new BlockItem(MoundBlocks.goblin_dirt, new Item.Properties().group(MOUND)).setRegistryName(MoundBlocks.goblin_dirt.getRegistryName()),
					MoundItems.goblin_grass = new BlockItem(MoundBlocks.goblin_grass, new Item.Properties().group(MOUND)).setRegistryName(MoundBlocks.goblin_grass.getRegistryName()),
					MoundItems.goblin_gravel = new BlockItem(MoundBlocks.goblin_gravel, new Item.Properties().group(MOUND)).setRegistryName(MoundBlocks.goblin_gravel.getRegistryName()),
					MoundItems.goblin_planks = new BlockItem(MoundBlocks.goblin_planks, new Item.Properties().group(MOUND)).setRegistryName(MoundBlocks.goblin_planks.getRegistryName()),
					MoundItems.goblin_leaves = new BlockItem(MoundBlocks.goblin_leaves, new Item.Properties().group(MOUND)).setRegistryName(MoundBlocks.goblin_leaves.getRegistryName()),
					MoundItems.goblin_log = new BlockItem(MoundBlocks.goblin_log, new Item.Properties().group(MOUND)).setRegistryName(MoundBlocks.goblin_log.getRegistryName()),
					MoundItems.goblin_forest_grass = new BlockItem(MoundBlocks.goblin_forest_grass, new Item.Properties().group(MOUND)).setRegistryName(MoundBlocks.goblin_forest_grass.getRegistryName()),
					MoundItems.goblin_forest_dirt = new BlockItem(MoundBlocks.goblin_forest_dirt, new Item.Properties().group(MOUND)).setRegistryName(MoundBlocks.goblin_forest_dirt.getRegistryName()),
					MoundItems.goblin_ladder = new BlockItem(MoundBlocks.goblin_ladder, new Item.Properties().group(MOUND)).setRegistryName(MoundBlocks.goblin_ladder.getRegistryName()),
					MoundItems.goblin_stairs = new BlockItem(MoundBlocks.goblin_stairs, new Item.Properties().group(MOUND)).setRegistryName(MoundBlocks.goblin_stairs.getRegistryName()),
					MoundItems.goblin_button = new BlockItem(MoundBlocks.goblin_button, new Item.Properties().group(MOUND)).setRegistryName(MoundBlocks.goblin_button.getRegistryName()),
					MoundItems.goblin_pressure_plate = new BlockItem(MoundBlocks.goblin_pressure_plate, new Item.Properties().group(MOUND)).setRegistryName(MoundBlocks.goblin_pressure_plate.getRegistryName()),
					MoundItems.goblin_fence = new BlockItem(MoundBlocks.goblin_fence, new Item.Properties().group(MOUND)).setRegistryName(MoundBlocks.goblin_fence.getRegistryName()),
					MoundItems.goblin_fence_gate = new BlockItem(MoundBlocks.goblin_fence_gate, new Item.Properties().group(MOUND)).setRegistryName(MoundBlocks.goblin_fence_gate.getRegistryName()),
					MoundItems.goblin_door = new BlockItem(MoundBlocks.goblin_door, new Item.Properties().group(MOUND)).setRegistryName(MoundBlocks.goblin_door.getRegistryName()),
					MoundItems.goblin_sapling = new BlockItem(MoundBlocks.goblin_sapling, new Item.Properties().group(MOUND)).setRegistryName(MoundBlocks.goblin_sapling.getRegistryName()),
					MoundItems.tester = new BlockItem(MoundBlocks.tester, new Item.Properties().group(MOUND)).setRegistryName(MoundBlocks.tester.getRegistryName()),
					
					
					//Flowers
					MoundItems.goblin_flower = new BlockItem(MoundBlocks.goblin_flower, new Item.Properties().group(MOUND)).setRegistryName(MoundBlocks.goblin_flower.getRegistryName()),
					MoundItems.goblin_flower2 = new BlockItem(MoundBlocks.goblin_flower2, new Item.Properties().group(MOUND)).setRegistryName(MoundBlocks.goblin_flower2.getRegistryName()),
					MoundItems.goblin_flower3 = new BlockItem(MoundBlocks.goblin_flower3, new Item.Properties().group(MOUND)).setRegistryName(MoundBlocks.goblin_flower3.getRegistryName()),
					MoundItems.goblin_flower4 = new BlockItem(MoundBlocks.goblin_flower4, new Item.Properties().group(MOUND)).setRegistryName(MoundBlocks.goblin_flower4.getRegistryName())
			);
			
			MoundEntities.registerEntitySpawnEggs(event);
			
			LOGGER.info("Items Registered");
		}
		
		@SubscribeEvent
		public static void registerBlocks(final RegistryEvent.Register<Block> event)
		{
			event.getRegistry().registerAll
			(
					MoundBlocks.block_heart = new Block(Block.Properties.create(Material.SPONGE).hardnessAndResistance(0.4F, 2.0F).slipperiness(1.0F).sound(SoundType.WET_GRASS)).setRegistryName(location("block_heart")),
					MoundBlocks.block_gobar = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5.0F, 30.0F).sound(SoundType.METAL)).setRegistryName(location("block_gobar")),
					MoundBlocks.block_infused_gobar = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5.0F, 30.0F).sound(SoundType.METAL)).setRegistryName(location("block_infused_gobar")),
					MoundBlocks.block_amethyst = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5.0F, 30.0F).sound(SoundType.METAL)).setRegistryName(location("block_amethyst")),
					MoundBlocks.ore_gobar = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 15.0F).sound(SoundType.STONE)).setRegistryName(location("ore_gobar")),
					MoundBlocks.goblin_dirt = new GrassyBlock(Block.Properties.create(Material.EARTH).hardnessAndResistance(0.6F, 3.0F).sound(SoundType.GROUND)).setRegistryName(location("goblin_dirt")),
					MoundBlocks.goblin_grass = new GrassyBlock(Block.Properties.create(Material.ORGANIC).hardnessAndResistance(0.5F, 2.5F).tickRandomly().sound(SoundType.PLANT)).setRegistryName(location("goblin_grass")),
					MoundBlocks.goblin_gravel = new GravelBlock(Block.Properties.create(Material.EARTH).hardnessAndResistance(0.5F, 2.5F).sound(SoundType.GROUND)).setRegistryName(location("goblin_gravel")),
					MoundBlocks.goblin_leaves = new LeavesBlock(Block.Properties.create(Material.ORGANIC).hardnessAndResistance(0.5F, 2.5F).sound(SoundType.PLANT)).setRegistryName(location("goblin_leaves")),
					MoundBlocks.goblin_planks = new Block(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName(location("goblin_planks")),
					MoundBlocks.goblin_log = new LogBlock(MaterialColor.WOOD, Block.Properties.create(Material.WOOD, MaterialColor.OBSIDIAN).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName(location("goblin_log")),
					MoundBlocks.goblin_forest_grass = new GrassyBlock(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT)).setRegistryName(location("goblin_forest_grass")),
					MoundBlocks.goblin_forest_dirt = new GrassyBlock(Block.Properties.create(Material.EARTH).hardnessAndResistance(0.6F, 3.0F).sound(SoundType.GROUND)).setRegistryName(location("goblin_forest_dirt")),
					MoundBlocks.goblin_ladder = new GoblinLadder(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.5F, 2.5F).sound(SoundType.LADDER)).setRegistryName(location("goblin_ladder")),
					MoundBlocks.goblin_stairs = new GoblinStair(MoundBlocks.goblin_planks.getDefaultState(), Block.Properties.from(MoundBlocks.goblin_planks)).setRegistryName(location("goblin_stairs")),
					MoundBlocks.goblin_flower = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f, 0.0f).sound(SoundType.PLANT)).setRegistryName("goblin_flower"),
					MoundBlocks.goblin_flower2 = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f, 0.0f).sound(SoundType.PLANT)).setRegistryName("goblin_flower2"),
					MoundBlocks.goblin_flower3 = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f, 0.0f).sound(SoundType.PLANT)).setRegistryName("goblin_flower3"),
					MoundBlocks.goblin_flower4 = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f, 0.0f).sound(SoundType.PLANT)).setRegistryName("goblin_flower4"),
					MoundBlocks.goblin_button = new GoblinButton(Block.Properties.create(Material.MISCELLANEOUS).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)).setRegistryName("goblin_button"),
					MoundBlocks.goblin_pressure_plate = new GoblinPressureBlock(GoblinPressureBlock.Sensitivity.EVERYTHING, Block.Properties.create(Material.WOOD).hardnessAndResistance(0.5F).doesNotBlockMovement().sound(SoundType.WOOD)).setRegistryName("goblin_pressure_plate"),
					MoundBlocks.goblin_fence = new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f, 3.0f).sound(SoundType.WOOD)).setRegistryName("goblin_fence"),
					MoundBlocks.goblin_fence_gate = new FenceGateBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f, 3.0F).sound(SoundType.WOOD)).setRegistryName("goblin_fence_gate"),
					MoundBlocks.turnip = new TurnipBlock(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.0f).sound(SoundType.CROP)).setRegistryName("turnip"),
					MoundBlocks.goblin_door = new GDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0f).sound(SoundType.WOOD)).setRegistryName("goblin_door"),
					MoundBlocks.tester = new AnvilBlock(Block.Properties.create(Material.ANVIL, MaterialColor.IRON).hardnessAndResistance(0.5F, 2.5F).sound(SoundType.ANVIL)).setRegistryName(location("tester")),
					MoundBlocks.goblin_sapling = new GSaplingBlock(new GoblinTree(), Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName("goblin_sapling")
			);
			
			LOGGER.info("Blocks Registered");
		}
		
		@SubscribeEvent
		public static void registerEntities(final RegistryEvent.Register<EntityType<?>> event)
		{
			event.getRegistry().registerAll
			(
				MoundEntities.GOBLIN,
				MoundEntities.SPEARGOBLIN,
				MoundEntities.GOBLINWARLORD,
				MoundEntities.GOBLINLEADER,
				MoundEntities.MINION
			);
			
			MoundEntities.registerEntityWorldSpawns();
		}
		
		@SubscribeEvent
		public static void registerBiomes(final RegistryEvent.Register<Biome> event)
		{
			event.getRegistry().registerAll
			(
				MoundBiomes.goblin_forest = new GoblinForestBiome(),
				MoundBiomes.diseased_biome = new DiseasedBiome()
			);
			
			MoundBiomes.registerBiomes();
		}
		
		@SubscribeEvent
		public static void playerEvents(final InputUpdateEvent event)
		{
			if(event.getMovementInput().jump && ArmorUtil.isFullSetEquipped(event.getEntityPlayer(), MoundItems.gobar_helmet, MoundItems.gobar_chestplate, MoundItems.gobar_leggings, MoundItems.gobar_boots))
					{
						event.getEntityPlayer().playSound(SoundEvents.BLOCK_GRASS_BREAK, 1.0f, 1.0f);
					}
		}
		
		public static ResourceLocation location(String name)
		{
			return new ResourceLocation(MODID, name);
		}
}
