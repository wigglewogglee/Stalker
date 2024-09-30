package wiggle.stalker.entity.client;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import wiggle.stalker.Stalker;
import wiggle.stalker.entity.custom.StalkerEntity;

@Environment(EnvType.CLIENT)
public class StalkerRenderer extends MobEntityRenderer<StalkerEntity, StalkerModel<StalkerEntity>> {

    private static final Identifier TEXTURE = new Identifier(Stalker.MOD_ID, "textures/entity/stalker.png");

    public StalkerRenderer(EntityRendererFactory.Context context) {
        super(context, new StalkerModel<>(context.getPart(ModModelLayers.STALKER)), 0.6f);
        this.addFeature(new StalkerEyesFeatureRenderer<>(this));
    }

    @Override
    public Identifier getTexture(StalkerEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(StalkerEntity mobEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {

        matrixStack.scale(1.5f, 1.5f, 1.5f);

        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
