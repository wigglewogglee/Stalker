package wiggle.stalker.entity.client;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.feature.EyesFeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.client.render.entity.model.EndermanEntityModel;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.Identifier;
import wiggle.stalker.Stalker;
import wiggle.stalker.entity.custom.StalkerEntity;

@Environment(EnvType.CLIENT)
public class StalkerEyesFeatureRenderer<T extends StalkerEntity> extends EyesFeatureRenderer<T, StalkerModel<T>> {
    private static final RenderLayer SKIN = RenderLayer.getEyes(new Identifier(Stalker.MOD_ID, "textures/entity/stalker_eyes.png"));

    public StalkerEyesFeatureRenderer(FeatureRendererContext<T, StalkerModel<T>> featureRendererContext) {
        super(featureRendererContext);
    }

    @Override
    public RenderLayer getEyesTexture() {
        return SKIN;
    }
}
