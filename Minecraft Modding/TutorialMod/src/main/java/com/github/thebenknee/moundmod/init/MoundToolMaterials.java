package com.github.thebenknee.moundmod.init;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;

public enum MoundToolMaterials implements IItemTier
{
	gobar(6.5F, 7.0F, 600, 2, 12, MoundItems.gobar_ingot),
	infused_gobar(8.0F, 9.0F, 1700, 3, 20, MoundItems.infused_gobar_ingot);
	
	private float attackDamage, efficiency;
	private int durability, enchantability, harvestLevel;
	private Item repairMaterial;
	
	private MoundToolMaterials(float attackDamage, float efficiency, int durability, int harvestLevel, int enchantability, Item repairMaterial) 
	{
		this.attackDamage = attackDamage;
		this.efficiency = efficiency;
		this.durability = durability;
		this.harvestLevel = harvestLevel;
		this.enchantability = enchantability;
		this.repairMaterial = repairMaterial;
	}

	@Override
	public int getMaxUses() 
	{
		return this.durability;
	}

	@Override
	public float getEfficiency() 
	{
		return this.efficiency;
	}

	@Override
	public float getAttackDamage() 
	{
		return this.attackDamage;
	}

	@Override
	public int getHarvestLevel() 
	{
		return this.harvestLevel;
	}

	@Override
	public int getEnchantability() 
	{
		return this.enchantability;
	}

	@Override
	public Ingredient getRepairMaterial() 
	{
		return Ingredient.fromItems(this.repairMaterial);
	}
}
