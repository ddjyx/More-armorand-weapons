
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package ddjyx.morearmorandweapons.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import ddjyx.morearmorandweapons.item.ObsidianSwordItem;
import ddjyx.morearmorandweapons.item.ObsidianArmorItem;
import ddjyx.morearmorandweapons.item.EmeraldtoolsShovelItem;
import ddjyx.morearmorandweapons.item.EmeraldtoolsPickaxeItem;
import ddjyx.morearmorandweapons.item.EmeraldtoolsHoeItem;
import ddjyx.morearmorandweapons.item.EmeraldtoolsAxeItem;
import ddjyx.morearmorandweapons.item.EmeraldSwordItem;
import ddjyx.morearmorandweapons.item.EemeraldArmorItem;
import ddjyx.morearmorandweapons.MorearmorandweaponsMod;

public class MorearmorandweaponsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MorearmorandweaponsMod.MODID);
	public static final RegistryObject<Item> OBSIDIAN_SWORD = REGISTRY.register("obsidian_sword", () -> new ObsidianSwordItem());
	public static final RegistryObject<Item> EMERALD_SWORD = REGISTRY.register("emerald_sword", () -> new EmeraldSwordItem());
	public static final RegistryObject<Item> OBSIDIAN_ARMOR_HELMET = REGISTRY.register("obsidian_armor_helmet", () -> new ObsidianArmorItem.Helmet());
	public static final RegistryObject<Item> OBSIDIAN_ARMOR_CHESTPLATE = REGISTRY.register("obsidian_armor_chestplate", () -> new ObsidianArmorItem.Chestplate());
	public static final RegistryObject<Item> OBSIDIAN_ARMOR_LEGGINGS = REGISTRY.register("obsidian_armor_leggings", () -> new ObsidianArmorItem.Leggings());
	public static final RegistryObject<Item> OBSIDIAN_ARMOR_BOOTS = REGISTRY.register("obsidian_armor_boots", () -> new ObsidianArmorItem.Boots());
	public static final RegistryObject<Item> EEMERALD_ARMOR_HELMET = REGISTRY.register("eemerald_armor_helmet", () -> new EemeraldArmorItem.Helmet());
	public static final RegistryObject<Item> EEMERALD_ARMOR_CHESTPLATE = REGISTRY.register("eemerald_armor_chestplate", () -> new EemeraldArmorItem.Chestplate());
	public static final RegistryObject<Item> EEMERALD_ARMOR_LEGGINGS = REGISTRY.register("eemerald_armor_leggings", () -> new EemeraldArmorItem.Leggings());
	public static final RegistryObject<Item> EEMERALD_ARMOR_BOOTS = REGISTRY.register("eemerald_armor_boots", () -> new EemeraldArmorItem.Boots());
	public static final RegistryObject<Item> EMERALDTOOLS_PICKAXE = REGISTRY.register("emeraldtools_pickaxe", () -> new EmeraldtoolsPickaxeItem());
	public static final RegistryObject<Item> EMERALDTOOLS_AXE = REGISTRY.register("emeraldtools_axe", () -> new EmeraldtoolsAxeItem());
	public static final RegistryObject<Item> EMERALDTOOLS_SHOVEL = REGISTRY.register("emeraldtools_shovel", () -> new EmeraldtoolsShovelItem());
	public static final RegistryObject<Item> EMERALDTOOLS_HOE = REGISTRY.register("emeraldtools_hoe", () -> new EmeraldtoolsHoeItem());
	// Start of user code block custom items
	// End of user code block custom items
}
