
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package ddjyx.morearmorandweapons.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import ddjyx.morearmorandweapons.MorearmorandweaponsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MorearmorandweaponsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MorearmorandweaponsMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(MorearmorandweaponsModItems.EMERALD_SWORD.get());
			tabData.accept(MorearmorandweaponsModItems.OBSIDIAN_SWORD.get());
			tabData.accept(MorearmorandweaponsModItems.OBSIDIAN_ARMOR_HELMET.get());
			tabData.accept(MorearmorandweaponsModItems.OBSIDIAN_ARMOR_CHESTPLATE.get());
			tabData.accept(MorearmorandweaponsModItems.OBSIDIAN_ARMOR_LEGGINGS.get());
			tabData.accept(MorearmorandweaponsModItems.OBSIDIAN_ARMOR_BOOTS.get());
			tabData.accept(MorearmorandweaponsModItems.EEMERALD_ARMOR_HELMET.get());
			tabData.accept(MorearmorandweaponsModItems.EEMERALD_ARMOR_CHESTPLATE.get());
			tabData.accept(MorearmorandweaponsModItems.EEMERALD_ARMOR_LEGGINGS.get());
			tabData.accept(MorearmorandweaponsModItems.EEMERALD_ARMOR_BOOTS.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(MorearmorandweaponsModItems.EMERALDTOOLS_PICKAXE.get());
			tabData.accept(MorearmorandweaponsModItems.EMERALDTOOLS_AXE.get());
			tabData.accept(MorearmorandweaponsModItems.EMERALDTOOLS_SHOVEL.get());
			tabData.accept(MorearmorandweaponsModItems.EMERALDTOOLS_HOE.get());
		}
	}
}
