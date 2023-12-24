package fr.gastoncks.ginger;

import fr.gastoncks.ginger.block.ModBlocks;
import fr.gastoncks.ginger.item.ModItemGroups;
import fr.gastoncks.ginger.item.ModItems;
import net.fabricmc.api.ModInitializer;

public class Ginger implements ModInitializer {
	public static final String MOD_ID = "ginger";

	@Override
	public void onInitialize() {

        ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();

	}
}