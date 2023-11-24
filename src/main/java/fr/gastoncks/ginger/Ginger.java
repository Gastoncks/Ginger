package fr.gastoncks.ginger;

import fr.gastoncks.ginger.block.ModBlocks;
import fr.gastoncks.ginger.item.ModItemGroups;
import fr.gastoncks.ginger.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Ginger implements ModInitializer {
	public static final String MOD_ID = "ginger";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

        ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();
	}
}