package wiggle.stalker.item;

import net.minecraft.item.Equipment;
import net.minecraft.item.Item;
import net.minecraft.item.PlayerHeadItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import wiggle.stalker.Stalker;
import wiggle.stalker.entity.custom.StalkerEntity;

public class ModItems {

    private static Item registerItem(String name, Item item) {

        return Registry.register(Registries.ITEM, new Identifier(Stalker.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Stalker.LOGGER.info("Registering items for " + Stalker.MOD_ID);
    }
}
