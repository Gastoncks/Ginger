package fr.gastoncks.ginger.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import fr.gastoncks.ginger.block.ModBlocks;
import fr.gastoncks.ginger.item.ModItems;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.CANDIED_GINGER, RecipeCategory.DECORATIONS,
                ModBlocks.CANDIED_GINGER_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CANDIED_GINGER, 1)
                .pattern("SSS")
                .pattern("SRS")
                .pattern("SSS")
                .input('S', Items.SUGAR)
                .input('R', ModItems.GINGER)
                .criterion(hasItem(Items.SUGAR), conditionsFromItem(Items.SUGAR))
                .criterion(hasItem(ModItems.GINGER), conditionsFromItem(ModItems.GINGER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.GINGER)));
    }
}