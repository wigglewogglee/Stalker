// Made with Blockbench 4.11.1
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports

package wiggle.stalker.entity.client;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import wiggle.stalker.entity.animation.ModAnimations;
import wiggle.stalker.entity.custom.StalkerEntity;

public class StalkerModel<T extends StalkerEntity> extends SinglePartEntityModel<T> {

	private final ModelPart stalker;
	private final ModelPart head;

	public StalkerModel(ModelPart root) {
		this.stalker = root.getChild("stalker");
		this.head = stalker.getChild("head");
	}

	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData stalker = modelPartData.addChild("stalker", ModelPartBuilder.create().uv(0, 0).cuboid(-3.0F, -8.0F, 0.0F, 6.0F, 4.0F, 12.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 20.0F, -5.0F));

		ModelPartData right_arm = stalker.addChild("right_arm", ModelPartBuilder.create().uv(8, 26).cuboid(-2.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-3.0F, -8.0F, 1.0F));

		ModelPartData right_leg = stalker.addChild("right_leg", ModelPartBuilder.create().uv(0, 26).cuboid(-2.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-3.0F, -8.0F, 11.0F));

		ModelPartData left_leg = stalker.addChild("left_leg", ModelPartBuilder.create().uv(24, 26).cuboid(0.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(3.0F, -8.0F, 11.0F));

		ModelPartData left_arm = stalker.addChild("left_arm", ModelPartBuilder.create().uv(16, 26).cuboid(0.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(3.0F, -8.0F, 1.0F));

		ModelPartData head = stalker.addChild("head", ModelPartBuilder.create().uv(24, 0).cuboid(-3.0F, 0.0F, -4.0F, 6.0F, 8.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 16).cuboid(-5.0F, -6.0F, -4.0F, 10.0F, 6.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -8.0F, 2.0F));
		return TexturedModelData.of(modelData, 64, 64);
	}
	@Override
	public void setAngles(StalkerEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.getPart().traverse().forEach(ModelPart::resetTransform);
		this.setHeadAngles(netHeadYaw, headPitch);

		this.animateMovement(ModAnimations.STALKER_RUN, limbSwing, limbSwingAmount, 2f, 2.5f);
		this.updateAnimation(entity.idleAnimationState, ModAnimations.STALKER_IDLE, ageInTicks, 1f);
	}

	private void setHeadAngles(float headYaw, float headPitch) {

		headYaw = MathHelper.clamp(headYaw, -30.0F, 30.0F);
		headPitch = MathHelper.clamp(headPitch, -25.0F, 25.0F);

		this.head.yaw = headYaw * 0.017453292F;
		this.head.pitch = headPitch * 0.017453292F;
	}

	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		stalker.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getPart() {
		return stalker;
	}
}