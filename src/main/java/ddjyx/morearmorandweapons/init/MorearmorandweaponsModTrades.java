
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package ddjyx.morearmorandweapons.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerProfession;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class MorearmorandweaponsModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.TOOLSMITH) {
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 17),

					new ItemStack(MorearmorandweaponsModItems.EMERALD_SWORD.get()), 1, 50, 0.05f));
		}
		if (event.getType() == VillagerProfession.TOOLSMITH) {
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 10), new ItemStack(Blocks.OBSIDIAN), new ItemStack(MorearmorandweaponsModItems.OBSIDIAN_SWORD.get()), 1, 50, 0.05f));
		}
	}
}
