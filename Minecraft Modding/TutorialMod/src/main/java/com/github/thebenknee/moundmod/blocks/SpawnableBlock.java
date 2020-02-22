package com.github.thebenknee.moundmod.blocks;

import java.util.List;
import java.util.Random;

import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;

public class SpawnableBlock extends GrassyBlock {
  public SpawnableBlock(Properties properties) {
    super(properties);
  }

  @Override
  public void onBlockAdded(BlockState state, World world, BlockPos pos, BlockState oldState, boolean isMoving) {
    world.getPendingBlockTicks().scheduleTick(pos, state.getBlock(), 50);
  }

  @Override
  public void tick(BlockState state, World world, BlockPos pos, Random random) {
    if (!world.isRemote) {
      if (!world.isAreaLoaded(pos, 3))
        return; // Forge: prevent loading unloaded chunks when checking neighbor's light and spreading
      //dont spawn in water
      if (!world.getFluidState(pos.up()).isEmpty()) return;
      world.getPendingBlockTicks().scheduleTick(pos, state.getBlock(), random.nextInt(400 - 200 + 1));
      //mobcap
      long mobcount = ((ServerWorld) world).getEntities().filter(entity -> entity instanceof AnimalEntity).count();
      if (mobcount > 15) return;
      int r = 1;
      if (world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(-r, -r, -r, r, r, r)).size() > 0) return;
      MobEntity mob = findMonsterToSpawn(world, pos, random);
      if (mob != null) {
        mob.setPosition(pos.getX() + .5, pos.getY() + 1, pos.getZ() + .5);
        if (!world.areCollisionShapesEmpty(mob) || !world.checkNoEntityCollision(mob)) return;
        world.addEntity(mob);
      }
    }
  }

  private MobEntity findMonsterToSpawn(World world, BlockPos pos, Random rand) 
  {
    List<Biome.SpawnListEntry> spawnOptions = world.getBiome(pos).getSpawns(EntityClassification.CREATURE);
    if (spawnOptions.size() == 0) {
      System.out.println("no spawns found");
      return null;
    }
    int found = rand.nextInt(spawnOptions.size());
    Biome.SpawnListEntry entry = spawnOptions.get(found);
    if (entry == null || entry.entityType == null) 
    {
      return null;
    }
    EntityType entityEntry = entry.entityType;
    MobEntity monster = null;
    Entity ent = entityEntry.create(world);
    if (ent instanceof MobEntity)
      monster = (MobEntity) ent;
    return monster;
  }
}