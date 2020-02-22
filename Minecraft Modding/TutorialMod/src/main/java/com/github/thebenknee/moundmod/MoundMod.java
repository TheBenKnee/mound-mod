package com.github.thebenknee.moundmod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.github.thebenknee.moundmod.client.render.MoundRenderRegistry;
import com.github.thebenknee.moundmod.config.Config;
import com.github.thebenknee.moundmod.init.MoundBlocks;
import com.github.thebenknee.moundmod.world.MoundWorldType;
import com.github.thebenknee.moundmod.world.OreGeneration;

import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;

@Mod("moundmod")
public class MoundMod 
{
	
	public static MoundMod instance;
	public static final String MODID = "moundmod";
	public static final Logger LOGGER = LogManager.getLogger(MODID);
	public static final ItemGroup MOUND = new MoundItemGroup();
	public static final WorldType MOUND_TYPE = new MoundWorldType();
	
	public MoundMod()
	{
		instance = this;
		
		ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, Config.SERVER, "moundmod-server.toml");
		ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, Config.CLIENT, "moundmod-client.toml");
		
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegistries);
		
		Config.loadConfig(Config.CLIENT, FMLPaths.CONFIGDIR.get().resolve("moundmod-client.toml").toString());
		Config.loadConfig(Config.SERVER, FMLPaths.CONFIGDIR.get().resolve("moundmod-server.toml").toString());
		
		MinecraftForge.EVENT_BUS.register(this);
	}

	private void setup(final FMLCommonSetupEvent event)
	{
		OreGeneration.setupOreGeneration();
		LOGGER.info("Setup method registered.");
	}

	private void clientRegistries(final FMLClientSetupEvent event)
	{
		MoundRenderRegistry.registryEntityRenders();
		LOGGER.info("ClientRegistries method registered.");
	}
	
	  @Mod.EventBusSubscriber
	  public static class rose {
	    @SubscribeEvent
	    public static void ros(PlayerInteractEvent.RightClickBlock e){
	      PlayerEntity p = e.getEntityPlayer();
	      World w = p.world;
	      BlockPos pos = e.getPos();
	      if (p.isSneaking() && !w.isRemote && e.getItemStack().getItem() == Items.WITHER_ROSE && w.getBlockState(pos).getBlock() == Blocks.DIRT){
	        w.setBlockState(pos,MoundBlocks.goblin_grass.getDefaultState());
	      }
	    }
	  }
}
