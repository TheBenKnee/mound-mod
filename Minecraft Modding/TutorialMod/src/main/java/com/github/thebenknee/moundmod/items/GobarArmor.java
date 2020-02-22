package com.github.thebenknee.moundmod.items;

import com.github.thebenknee.moundmod.init.MoundItems;
import com.github.thebenknee.moundmod.util.ArmorUtil;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;

public class GobarArmor extends ArmorItem
{
	boolean soundPlayed = false;
	
	public GobarArmor(IArmorMaterial materialIn, EquipmentSlotType slot, Properties builder)
	{
		super(materialIn, slot, builder);
	}
	
	@Override
	public void onArmorTick(ItemStack stack, World world, PlayerEntity player)
	{
		if(ArmorUtil.isFullSetEquipped(player, MoundItems.gobar_helmet, MoundItems.gobar_chestplate, MoundItems.gobar_leggings, MoundItems.gobar_boots))
		{
			
			player.addPotionEffect(new EffectInstance(Effects.FIRE_RESISTANCE));			
		
			if(player.isSneaking() && !this.soundPlayed)
			{
				player.playSound(SoundEvents.BLOCK_GLASS_BREAK, 1.0f, 1.0f);
				soundPlayed = true;
			}
			
			if(soundPlayed && !player.isSneaking())
			{
				soundPlayed = false;
			}
		}
		
	}
}
