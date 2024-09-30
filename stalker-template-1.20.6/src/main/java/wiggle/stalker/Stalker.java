package wiggle.stalker;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.block.WearableCarvedPumpkinBlock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import wiggle.stalker.entity.ModEntities;
import wiggle.stalker.entity.client.StalkerRenderer;
import wiggle.stalker.entity.custom.StalkerEntity;
import wiggle.stalker.item.ModItems;

public class Stalker implements ModInitializer {
	public static final String MOD_ID = "stalker";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");

		ModEntities.registerModEntities();
		ModItems.registerModItems();

		EntityRendererRegistry.register(ModEntities.STALKER, StalkerRenderer::new);
		FabricDefaultAttributeRegistry.register(ModEntities.STALKER, StalkerEntity.createStalkerAttributes());
	}
}