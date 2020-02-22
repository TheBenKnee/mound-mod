package com.github.thebenknee.moundmod.entities;

import javax.annotation.Nullable;

import com.github.thebenknee.moundmod.init.MoundItems;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.ai.goal.NearestAttackableTargetGoal;
import net.minecraft.entity.ai.goal.RandomWalkingGoal;
import net.minecraft.entity.ai.goal.RangedAttackGoal;
import net.minecraft.entity.merchant.villager.AbstractVillagerEntity;
import net.minecraft.entity.monster.DrownedEntity;
import net.minecraft.entity.passive.IronGolemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.TridentEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

public class Minion extends DrownedEntity implements IRangedAttackMob
{

	public Minion(EntityType<? extends DrownedEntity> p_i50212_1_, World p_i50212_2_) 
	{
		super(p_i50212_1_, p_i50212_2_);
	}
	
	@Override
	   protected boolean shouldBurnInDay() {
	      return false;
	   }
	
	@Override
	   protected void registerAttributes() {
	      super.registerAttributes();

	      this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue((double)0.23F);
	      this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(3.0D);
	      this.getAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(2.0D);
	   }
	
	@Override
	   protected boolean canBreakDoors() {
	      return true;
	   }
	
	@Override
	   protected void setEquipmentBasedOnDifficulty(DifficultyInstance difficulty) 
		{
			this.setItemStackToSlot(EquipmentSlotType.MAINHAND, new ItemStack(MoundItems.spear));	   
		}

	@Override
	   protected boolean shouldDrown() {
	      return true;
	   }
	
	@Override
	   protected SoundEvent getStepSound() {
	      return SoundEvents.BLOCK_BAMBOO_BREAK;
	   }
	
	@Override
	   protected SoundEvent getAmbientSound() {
	      return this.isInWater() ? SoundEvents.ENTITY_BOAT_PADDLE_WATER : SoundEvents.ENTITY_TURTLE_SHAMBLE;
	   }
	
	@Override
	   public ILivingEntityData onInitialSpawn(IWorld worldIn, DifficultyInstance difficultyIn, SpawnReason reason, @Nullable ILivingEntityData spawnDataIn, @Nullable CompoundNBT dataTag) {
	      spawnDataIn = super.onInitialSpawn(worldIn, difficultyIn, reason, spawnDataIn, dataTag);
	      return spawnDataIn;
	   }
	
	@Override
	   protected void applyEntityAI() {
	      this.goalSelector.addGoal(2, new Minion.TestMe(this, 1.0D, 40, 10.0F));
	      this.goalSelector.addGoal(7, new RandomWalkingGoal(this, 1.0D));
	      this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, PlayerEntity.class, true));
	      this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, AbstractVillagerEntity.class, false));
	      this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, IronGolemEntity.class, true));
	   }
	
	
	//TRIDENT TO SPEAR
	   static class TestMe extends RangedAttackGoal {
	      private final DrownedEntity field_204728_a;

	      public TestMe(IRangedAttackMob p_i48907_1_, double p_i48907_2_, int p_i48907_4_, float p_i48907_5_) {
	         super(p_i48907_1_, p_i48907_2_, p_i48907_4_, p_i48907_5_);
	         this.field_204728_a = (DrownedEntity)p_i48907_1_;
	      }

	      /**
	       * Returns whether the EntityAIBase should begin execution.
	       */
	      public boolean shouldExecute() {
	         return super.shouldExecute() && this.field_204728_a.getHeldItemMainhand().getItem() == MoundItems.spear;
	      }

	      /**
	       * Execute a one shot task or start executing a continuous task
	       */
	      public void startExecuting() {
	         super.startExecuting();
	         this.field_204728_a.setAggroed(true);
	         this.field_204728_a.setActiveHand(Hand.MAIN_HAND);
	      }

	      /**
	       * Reset the task's internal state. Called when this task is interrupted by another one
	       */
	      public void resetTask() {
	         super.resetTask();
	         this.field_204728_a.resetActiveHand();
	         this.field_204728_a.setAggroed(false);
	      }
	   }
	   
	   @Override
	   public void attackEntityWithRangedAttack(LivingEntity target, float distanceFactor) {
		      TridentEntity tridententity = new TridentEntity(this.world, this, new ItemStack(MoundItems.spear));
		      double d0 = target.posX - this.posX;
		      double d1 = target.getBoundingBox().minY + (double)(target.getHeight() / 3.0F) - tridententity.posY;
		      double d2 = target.posZ - this.posZ;
		      double d3 = (double)MathHelper.sqrt(d0 * d0 + d2 * d2);
		      tridententity.shoot(d0, d1 + d3 * (double)0.2F, d2, 1.6F, (float)(14 - this.world.getDifficulty().getId() * 4));
		      this.playSound(SoundEvents.ENTITY_DROWNED_SHOOT, 1.0F, 1.0F / (this.getRNG().nextFloat() * 0.4F + 0.8F));
		      this.world.addEntity(tridententity);
		   }
}
