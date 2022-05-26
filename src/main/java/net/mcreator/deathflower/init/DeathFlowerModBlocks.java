
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.deathflower.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.deathflower.block.DeathFlowerBlock;
import net.mcreator.deathflower.DeathFlowerMod;

public class DeathFlowerModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, DeathFlowerMod.MODID);
	public static final RegistryObject<Block> DEATH_FLOWER = REGISTRY.register("death_flower", () -> new DeathFlowerBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			DeathFlowerBlock.registerRenderLayer();
		}
	}
}
