package net.mcreator.outerendwilds.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelsnareling<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("outer_end_wilds", "modelsnareling"), "main");
	public final ModelPart nonleg;
	public final ModelPart head;
	public final ModelPart body;
	public final ModelPart top;
	public final ModelPart bottom;
	public final ModelPart back;
	public final ModelPart arms;
	public final ModelPart leftarm;
	public final ModelPart rightarm;
	public final ModelPart rightleg;
	public final ModelPart leftleg;

	public Modelsnareling(ModelPart root) {
		this.nonleg = root.getChild("nonleg");
		this.head = this.nonleg.getChild("head");
		this.body = this.nonleg.getChild("body");
		this.top = this.body.getChild("top");
		this.bottom = this.body.getChild("bottom");
		this.back = this.body.getChild("back");
		this.arms = this.nonleg.getChild("arms");
		this.leftarm = this.arms.getChild("leftarm");
		this.rightarm = this.arms.getChild("rightarm");
		this.rightleg = root.getChild("rightleg");
		this.leftleg = root.getChild("leftleg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition nonleg = partdefinition.addOrReplaceChild("nonleg", CubeListBuilder.create(), PartPose.offset(0.0F, 2.0F, 0.0F));
		PartDefinition head = nonleg.addOrReplaceChild("head", CubeListBuilder.create().texOffs(2, 17).addBox(-4.0F, -3.0F, -4.5F, 8.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -9.0F, 3.5F, -0.3054F, 0.0F, 0.0F));
		PartDefinition body = nonleg.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, -1.0F, -0.3054F, 0.0F, 0.0F));
		PartDefinition top = body.addOrReplaceChild("top", CubeListBuilder.create().texOffs(24, 9).addBox(-5.0F, -29.0F, -4.0F, 10.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition bottom = body.addOrReplaceChild("bottom", CubeListBuilder.create().texOffs(24, 23).addBox(-5.0F, 0.0F, -2.0F, 10.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -2.0F));
		PartDefinition back = body.addOrReplaceChild("back", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -5.0F, -2.0F, 10.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 4.0F));
		PartDefinition arms = nonleg.addOrReplaceChild("arms", CubeListBuilder.create(), PartPose.offset(0.0F, -1.0F, -1.0F));
		PartDefinition leftarm = arms.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offset(3.0F, 4.0F, -2.0F));
		PartDefinition leftarm_r1 = leftarm.addOrReplaceChild("leftarm_r1", CubeListBuilder.create().texOffs(16, 45).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 18.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, -0.3054F, 0.0F, 0.0F));
		PartDefinition rightarm = arms.addOrReplaceChild("rightarm", CubeListBuilder.create().texOffs(24, 47).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 18.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 4.0F, -2.0F, -0.3054F, 0.0F, 0.0F));
		PartDefinition rightleg = partdefinition.addOrReplaceChild("rightleg",
				CubeListBuilder.create().texOffs(29, 36).addBox(0.0F, 19.25F, -1.75F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(8, 29).addBox(0.0F, -4.75F, -1.75F, 2.0F, 24.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, 2.75F, -1.25F));
		PartDefinition leftleg = partdefinition.addOrReplaceChild("leftleg",
				CubeListBuilder.create().texOffs(16, 34).addBox(-2.0F, 19.25F, -1.75F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 29).addBox(-2.0F, -4.75F, -1.75F, 2.0F, 24.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.0F, 2.75F, -1.25F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		nonleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		rightleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		leftleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}
}
