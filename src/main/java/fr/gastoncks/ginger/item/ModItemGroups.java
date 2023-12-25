package fr.gastoncks.ginger.item;

import fr.gastoncks.ginger.Ginger;
import fr.gastoncks.ginger.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;

public class ModItemGroups {

    public static void registerItemGroups() {

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register((content) -> {
            content.add(ModItems.GINGER);
            content.add(ModItems.CANDIED_GINGER);

            content.add(ModBlocks.CANDIED_GINGER_BLOCK);
        });

        Ginger.LOGGER.info("Registering Item Group for" + Ginger.MOD_ID);


    }
}
