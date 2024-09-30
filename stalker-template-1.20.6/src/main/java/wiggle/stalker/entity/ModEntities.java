package wiggle.stalker.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import wiggle.stalker.Stalker;
import wiggle.stalker.entity.custom.StalkerEntity;

public class ModEntities {

    public static void registerModEntities() {
        Stalker.LOGGER.info("Registering Entities for " + Stalker.MOD_ID);
    }

    public static final EntityType<StalkerEntity> STALKER = Registry.register(Registries.ENTITY_TYPE, new Identifier(Stalker.MOD_ID, "stalker"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, StalkerEntity::new)
                    .dimensions(EntityDimensions.fixed(1f, 1f)).build());
}
