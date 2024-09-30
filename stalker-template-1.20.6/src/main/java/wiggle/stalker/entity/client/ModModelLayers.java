package wiggle.stalker.entity.client;

import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;
import wiggle.stalker.Stalker;

public class ModModelLayers {

    public static final EntityModelLayer STALKER =
            new EntityModelLayer(new Identifier(Stalker.MOD_ID, "stalker"), "main");
}
