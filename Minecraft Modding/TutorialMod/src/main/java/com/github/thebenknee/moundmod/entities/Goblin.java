package com.github.thebenknee.moundmod.entities;

import com.github.thebenknee.moundmod.init.MoundEntities;

import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.goal.AvoidEntityGoal;
import net.minecraft.entity.ai.goal.LookAtGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.ai.goal.NearestAttackableTargetGoal;
import net.minecraft.entity.ai.goal.PanicGoal;
import net.minecraft.entity.ai.goal.RandomWalkingGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.ai.goal.WaterAvoidingRandomWalkingGoal;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.passive.GolemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Goblin extends MonsterEntity
{
	@SuppressWarnings("unchecked")
	public Goblin(EntityType<? extends MonsterEntity> type, World worldIn)
	{
		super((EntityType<? extends MonsterEntity>) MoundEntities.GOBLIN, worldIn);
	}
	
	
	
	@Override
	protected void registerGoals()
	{
		this.goalSelector.addGoal(3, new SwimGoal(this));
		this.goalSelector.addGoal(2, new RandomWalkingGoal(this, 1.0d));
		this.goalSelector.addGoal(2, new LookRandomlyGoal(this));
	    this.goalSelector.addGoal(1, new PanicGoal(this, 2.0D));
	    this.targetSelector.addGoal(5, new NearestAttackableTargetGoal<>(this, PlayerEntity.class, true));
	    this.goalSelector.addGoal(5, new LookAtGoal(this, PlayerEntity.class, 8.0F));
	    this.goalSelector.addGoal(0, new WaterAvoidingRandomWalkingGoal(this, 1.0D));
	    this.goalSelector.addGoal(6, new AvoidEntityGoal<>(this, GolemEntity.class, 6.0F, 1.0D, 1.2D));
	    this.goalSelector.addGoal(4,  new MeleeAttackGoal(this, 1.0d, true));
	}
	
	@Override
	protected void registerAttributes()
	{ 
		super.registerAttributes();
		this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(15.0d);
		this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3d);
		this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(1.5d);
	}
	
	protected SoundEvent getStepSound() {
	      return SoundEvents.BLOCK_WET_GRASS_STEP;
	   }
	
	   protected void playStepSound(BlockPos pos, BlockState blockIn) {
		      this.playSound(this.getStepSound(), 0.15F, 1.0F);
		   }
	
	@Override
	   protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
	      return SoundEvents.ENTITY_WITCH_AMBIENT;
	   }

}
