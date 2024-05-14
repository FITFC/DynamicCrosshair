package mod.crend.dynamiccrosshair.datagen;

import mod.crend.dynamiccrosshair.registry.DynamicCrosshairBlockTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalBlockTags;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

class BlockTagGenerator extends FabricTagProvider.BlockTagProvider {
	public BlockTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
		super(output, completableFuture);
	}

	@Override
	protected void configure(RegistryWrapper.WrapperLookup arg) {
		getOrCreateTagBuilder(DynamicCrosshairBlockTags.IS_ALWAYS_INTERACTABLE)
				.addOptionalTag(ConventionalBlockTags.CHESTS)
				.addOptionalTag(ConventionalBlockTags.PLAYER_WORKSTATIONS_FURNACES)
				.addOptionalTag(ConventionalBlockTags.PLAYER_WORKSTATIONS_CRAFTING_TABLES)
				.addOptionalTag(ConventionalBlockTags.BARRELS)
				.add(Blocks.BEACON)
				.add(Blocks.BELL)
				.add(Blocks.BREWING_STAND)
				.add(Blocks.DAYLIGHT_DETECTOR)
				.add(Blocks.DISPENSER)
				.add(Blocks.DROPPER)
				.add(Blocks.ENCHANTING_TABLE)
				.add(Blocks.HOPPER)
				.addOptionalTag(ConventionalBlockTags.SHULKER_BOXES)
				.add(Blocks.SMOKER)
				.add(Blocks.BLAST_FURNACE)
				.add(Blocks.STONECUTTER)
				.add(Blocks.GRINDSTONE)
				.add(Blocks.CARTOGRAPHY_TABLE)
				.add(Blocks.LOOM)
				.addOptionalTag(BlockTags.BEDS)
				.addOptionalTag(BlockTags.WOODEN_TRAPDOORS)
				.addOptionalTag(BlockTags.WOODEN_DOORS)
				.addOptionalTag(BlockTags.FENCE_GATES)
				.addOptionalTag(BlockTags.BUTTONS)
				.add(Blocks.NOTE_BLOCK)
				.add(Blocks.LEVER)
				.add(Blocks.COMPARATOR)
				.add(Blocks.REPEATER)
				.addOptionalTag(BlockTags.ANVIL)
				.add(Blocks.SMITHING_TABLE)
		;

		getOrCreateTagBuilder(DynamicCrosshairBlockTags.IS_ALWAYS_INTERACTABLE_IN_CREATIVE_MODE)
				.add(Blocks.COMMAND_BLOCK)
				.add(Blocks.CHAIN_COMMAND_BLOCK)
				.add(Blocks.REPEATING_COMMAND_BLOCK)
				.add(Blocks.STRUCTURE_BLOCK)
				.add(Blocks.STRUCTURE_VOID)
		;

		getOrCreateTagBuilder(DynamicCrosshairBlockTags.IS_INTERACTABLE)
				.addTag(DynamicCrosshairBlockTags.IS_ALWAYS_INTERACTABLE)
				.addTag(DynamicCrosshairBlockTags.IS_ALWAYS_INTERACTABLE_IN_CREATIVE_MODE)
				.add(Blocks.COMMAND_BLOCK)
				.add(Blocks.JUKEBOX)
				.add(Blocks.LECTERN)
				.add(Blocks.COMPOSTER)
				.add(Blocks.FLOWER_POT)
				.add(Blocks.CAKE)
				.add(Blocks.SWEET_BERRY_BUSH)
				.addOptionalTag(BlockTags.CANDLES)
				.addOptionalTag(BlockTags.CAMPFIRES)
				.add(Blocks.CHISELED_BOOKSHELF)
				.add(Blocks.DECORATED_POT)
		;
	}
}
