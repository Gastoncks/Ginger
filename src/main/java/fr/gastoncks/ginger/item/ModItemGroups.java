package fr.gastoncks.ginger.item;

import fr.gastoncks.ginger.Ginger;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup GINGER_GROUP = Registry.register(Registries.ITEM_GROUP,
        new Identifier(Ginger.MOD_ID, "ginger"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ginger"))
                .icon(()  -> new ItemStack(ModItems.GINGER)).entries((displayContext, entries) -> {
                    entries.add(ModItems.GINGER);
                    entries.add(ModItems.CANDIED_GINGER);

                    }).build());

    public static void registerItemGroups() {
        Ginger.LOGGER.info("Registering Item Group for" + Ginger.MOD_ID);
    }
}
