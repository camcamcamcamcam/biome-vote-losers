package com.minecraftabnormals.biome_vote_losers.client.render;

import com.minecraftabnormals.biome_vote_losers.BiomeVoteLosers;
import com.minecraftabnormals.biome_vote_losers.client.ModModelLayers;
import com.minecraftabnormals.biome_vote_losers.client.model.MeerkatModel;
import com.minecraftabnormals.biome_vote_losers.world.level.entity.Meerkat;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class MeerkatRender<T extends Meerkat> extends MobRenderer<T, MeerkatModel<T>> {
	private static final ResourceLocation TEXTURE = new ResourceLocation(BiomeVoteLosers.MODID, "textures/entity/meerkat.png");

	public MeerkatRender(EntityRendererProvider.Context p_173952_) {
		super(p_173952_, new MeerkatModel<>(p_173952_.bakeLayer(ModModelLayers.MEERKAT)), 0.35F);
	}


	@Override
	public ResourceLocation getTextureLocation(T p_110775_1_) {
		return TEXTURE;
	}

	@Override
	protected void scale(T p_115314_, PoseStack p_115315_, float p_115316_) {
		super.scale(p_115314_, p_115315_, p_115316_);
		p_115315_.scale(p_115314_.getScale(), p_115314_.getScale(), p_115314_.getScale());
	}
}