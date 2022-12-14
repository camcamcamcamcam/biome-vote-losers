package com.minecraftabnormals.biome_vote_losers.client;

import com.minecraftabnormals.biome_vote_losers.BiomeVoteLosers;
import com.minecraftabnormals.biome_vote_losers.client.model.MeerkatModel;
import com.minecraftabnormals.biome_vote_losers.client.model.OstrichModel;
import com.minecraftabnormals.biome_vote_losers.client.model.TumbleweedModel;
import com.minecraftabnormals.biome_vote_losers.client.model.VultureModel;
import com.minecraftabnormals.biome_vote_losers.client.particle.CalciteBubbleParticle;
import com.minecraftabnormals.biome_vote_losers.client.render.MeerkatRender;
import com.minecraftabnormals.biome_vote_losers.client.render.OstrichRender;
import com.minecraftabnormals.biome_vote_losers.client.render.TumbleweedRender;
import com.minecraftabnormals.biome_vote_losers.client.render.VultureRender;
import com.minecraftabnormals.biome_vote_losers.register.ModBlocks;
import com.minecraftabnormals.biome_vote_losers.register.ModEntities;
import com.minecraftabnormals.biome_vote_losers.register.ModParticles;
import com.minecraftabnormals.biome_vote_losers.world.level.block.SucculentBlock;
import net.minecraft.client.particle.BubblePopParticle;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.client.renderer.entity.NoopRenderer;
import net.minecraft.client.renderer.entity.ThrownItemRenderer;
import net.minecraft.world.level.FoliageColor;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@OnlyIn(Dist.CLIENT)
@Mod.EventBusSubscriber(modid = BiomeVoteLosers.MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientRegistrar {
	public static void setup(FMLCommonSetupEvent event) {

	}

	@SubscribeEvent
	public static void registerEntityRenders(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(ModEntities.MEERKAT.get(), MeerkatRender::new);
		event.registerEntityRenderer(ModEntities.OSTRICH.get(), OstrichRender::new);
		event.registerEntityRenderer(ModEntities.VULTURE.get(), VultureRender::new);
		event.registerEntityRenderer(ModEntities.TUMBLEWEED.get(), TumbleweedRender::new);
		event.registerEntityRenderer(ModEntities.CALCITE_POWDER.get(), NoopRenderer::new);
		event.registerEntityRenderer(ModEntities.COCONUT.get(), ThrownItemRenderer::new);
	}

	@SubscribeEvent
	public static void registerLayerDefinition(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModModelLayers.MEERKAT, MeerkatModel::createBodyLayer);
		event.registerLayerDefinition(ModModelLayers.OSTRICH, OstrichModel::createBodyLayer);
		event.registerLayerDefinition(ModModelLayers.VULTURE, VultureModel::createBodyLayer);
		event.registerLayerDefinition(ModModelLayers.TUMBLEWEED, TumbleweedModel::createBodyLayer);
	}

	@SubscribeEvent
	public static void registerParticleProviders(RegisterParticleProvidersEvent event) {
		event.register(ModParticles.CALCITE_POWDER_BUBBLE.get(), CalciteBubbleParticle.Provider::new);
		event.register(ModParticles.CALCITE_POWDER_BUBBLE_POP.get(), BubblePopParticle.Provider::new);
	}

	@SubscribeEvent
	public static void registerBlockColor(RegisterColorHandlersEvent.Block event) {
		event.register((state, reader, pos, color) -> {
			return reader != null && pos != null ? BiomeColors.getAverageFoliageColor(reader, pos) : FoliageColor.getDefaultColor();
		}, ModBlocks.BAOBAB_LEAVES.get());
		event.register((state, reader, pos, color) -> {
			return reader != null & pos != null ? SucculentBlock.getColor(state.getValue(SucculentBlock.COLOR)) : FoliageColor.getDefaultColor();
		}, ModBlocks.SUCCULENT.get());
	}

	@SubscribeEvent
	public static void registerItemColor(RegisterColorHandlersEvent.Item event) {
		event.register((stack, i) -> FoliageColor.getDefaultColor(), ModBlocks.BAOBAB_LEAVES.get().asItem());
	}
}
