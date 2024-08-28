
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package ddjyx.morearmorandweapons.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import ddjyx.morearmorandweapons.item.ObsidianSwordItem;
import ddjyx.morearmorandweapons.item.EmeraldSwordItem;
import ddjyx.morearmorandweapons.MorearmorandweaponsMod;

public class MorearmorandweaponsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MorearmorandweaponsMod.MODID);
	public static final RegistryObject<Item> OBSIDIAN_SWORD = REGISTRY.register("obsidian_sword", () -> new ObsidianSwordItem());
	public static final RegistryObject<Item> EMERALD_SWORD = REGISTRY.register("emerald_sword", () -> new EmeraldSwordItem());
	// Start of user code block custom items
	// End of user code block custom items
}
