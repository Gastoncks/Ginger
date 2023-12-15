package fr.gastoncks.ginger.datagen;

import fr.gastoncks.ginger.block.custom.GingerCropBlock;
import fr.gastoncks.ginger.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import fr.gastoncks.ginger.block.ModBlocks;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.predicate.StatePredicate;



public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.CANDIED_GINGER_BLOCK);

        BlockStatePropertyLootCondition.Builder builder3 = BlockStatePropertyLootCondition.builder(ModBlocks.GINGER_CROP).properties(StatePredicate.Builder.create()
                .exactMatch(GingerCropBlock.AGE, 5));
        addDrop(ModBlocks.GINGER_CROP, cropDrops(ModBlocks.GINGER_CROP, ModItems.GINGER, ModItems.GINGER, builder3));
    }
}