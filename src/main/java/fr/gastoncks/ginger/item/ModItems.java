package fr.gastoncks.ginger.item;

import fr.gastoncks.ginger.Ginger;
import fr.gastoncks.ginger.block.ModBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item GINGER = registerItem("ginger",
            new AliasedBlockItem(ModBlocks.GINGER_CROP, new FabricItemSettings()));
    public static final Item CANDIED_GINGER = registerItem("candied_ginger", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(GINGER);
    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Ginger.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Ginger.LOGGER.info("Registering mod items for " + Ginger.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
