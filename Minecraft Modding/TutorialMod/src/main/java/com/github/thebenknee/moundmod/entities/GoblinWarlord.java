package com.github.thebenknee.moundmod.entities;

import com.github.thebenknee.moundmod.init.MoundEntities;

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
import net.minecraft.world.World;

public class GoblinWarlord extends MonsterEntity
{
	@SuppressWarnings("unchecked")
	public GoblinWarlord(EntityType<? extends MonsterEntity> type, World worldIn)
	{
		super((EntityType<? extends MonsterEntity>) MoundEntities.GOBLINWARLORD, worldIn);
	}
	
	@Override
	protected void registerGoals()
	{
		this.goalSelector.addGoal(0, new SwimGoal(this));
		this.goalSelector.addGoal(0, new RandomWalkingGoal(this, 1.0d));
		this.goalSelector.addGoal(0, new LookRandomlyGoal(this));
	    this.goalSelector.addGoal(0, new PanicGoal(this, 2.0D));
	    this.targetSelector.addGoal(0, new NearestAttackableTargetGoal<>(this, PlayerEntity.class, true));
	    this.goalSelector.addGoal(0, new LookAtGoal(this, PlayerEntity.class, 8.0F));
	    this.goalSelector.addGoal(0, new WaterAvoidingRandomWalkingGoal(this, 1.0D));
	    this.goalSelector.addGoal(1, new AvoidEntityGoal<>(this, GolemEntity.class, 6.0F, 1.0D, 1.2D));
	    this.goalSelector.addGoal(0,  new MeleeAttackGoal(this, 1.0d, true));
	}
	
	@Override
	protected void registerAttributes()
	{ 
		super.registerAttributes();
		this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20.0d);
		this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.2d);
		this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(2.0d);
	}	
}
