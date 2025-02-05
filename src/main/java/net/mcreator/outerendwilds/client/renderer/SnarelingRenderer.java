
package net.mcreator.outerendwilds.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.Minecraft;

import net.mcreator.outerendwilds.entity.SnarelingEntity;
import net.mcreator.outerendwilds.client.model.animations.snarelingAnimation;
import net.mcreator.outerendwilds.client.model.Modelsnareling;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class SnarelingRenderer extends MobRenderer<SnarelingEntity, Modelsnareling<SnarelingEntity>> {
	public SnarelingRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelsnareling.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<SnarelingEntity, Modelsnareling<SnarelingEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("outer_end_wilds:textures/entities/snareglow.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, SnarelingEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				EntityModel model = new Modelsnareling(Minecraft.getInstance().getEntityModels().bakeLayer(Modelsnareling.LAYER_LOCATION));
				this.getParentModel().copyPropertiesTo(model);
				model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
				model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
				model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(SnarelingEntity entity) {
		return ResourceLocation.parse("outer_end_wilds:textures/entities/snareling.png");
	}

	private static final class AnimatedModel extends Modelsnareling<SnarelingEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<SnarelingEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(SnarelingEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, snarelingAnimation.SNARELING_IDLE, ageInTicks, 1f);
				this.animateWalk(snarelingAnimation.SNARELING_WALK, limbSwing, limbSwingAmount, 1f, 1f);
				this.animate(entity.animationState2, snarelingAnimation.SNARELING_ATTACK, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(SnarelingEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}
