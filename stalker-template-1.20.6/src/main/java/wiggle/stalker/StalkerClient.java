package wiggle.stalker;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.minecraft.entity.passive.CamelEntity;
import wiggle.stalker.entity.client.ModModelLayers;
import wiggle.stalker.entity.client.StalkerModel;

public class StalkerClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.STALKER, StalkerModel::getTexturedModelData);
    }
}
