package mod.crend.dynamiccrosshairapi.internal.datagen;

import mod.crend.dynamiccrosshairapi.registry.DynamicCrosshairItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

class ItemTagGenerator extends FabricTagProvider.ItemTagProvider {
	public ItemTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
		super(output, completableFuture);
	}

	@Override
	protected void configure(RegistryWrapper.WrapperLookup arg) {
		getOrCreateTagBuilder(DynamicCrosshairItemTags.TOOLS)
				.addOptionalTag(ConventionalItemTags.MINING_TOOL_TOOLS)
				.addOptionalTag(ConventionalItemTags.SHEAR_TOOLS)
				.addOptionalTag(ItemTags.PICKAXES)
				.addOptionalTag(ItemTags.SHOVELS)
				.addOptionalTag(ItemTags.AXES)
				.addOptionalTag(ItemTags.HOES)
				.add(Items.FLINT_AND_STEEL)
		;

		getOrCreateTagBuilder(DynamicCrosshairItemTags.THROWABLES)
				.add(Items.EGG)
				.add(Items.SNOWBALL)
				.add(Items.SPLASH_POTION)
				.add(Items.LINGERING_POTION)
				.add(Items.EXPERIENCE_BOTTLE)
				.add(Items.ENDER_PEARL)
				.add(Items.WIND_CHARGE)
		;

		getOrCreateTagBuilder(DynamicCrosshairItemTags.SHIELDS)
				.add(Items.SHIELD)
				.addOptionalTag(ConventionalItemTags.SHIELD_TOOLS)
		;

		getOrCreateTagBuilder(DynamicCrosshairItemTags.MELEE_WEAPONS)
				.addOptionalTag(ItemTags.SWORDS)
				.addOptionalTag(ConventionalItemTags.MELEE_WEAPON_TOOLS)
				.add(Items.MACE)
		;

		getOrCreateTagBuilder(DynamicCrosshairItemTags.RANGED_WEAPONS)
				.add(Items.FISHING_ROD)
				.add(Items.BOW)
				.add(Items.CROSSBOW)
				.add(Items.TRIDENT)
				.addOptionalTag(ConventionalItemTags.SPEAR_TOOLS)
				.addOptionalTag(ConventionalItemTags.BOW_TOOLS)
				.addOptionalTag(ConventionalItemTags.CROSSBOW_TOOLS)
				.addOptionalTag(ConventionalItemTags.FISHING_ROD_TOOLS)
				.addOptionalTag(ConventionalItemTags.RANGED_WEAPON_TOOLS)
		;

		// NOTE BlockItem is missing here
		getOrCreateTagBuilder(DynamicCrosshairItemTags.BLOCKS)
				.add(Items.SWEET_BERRIES)
				.add(Items.GLOW_BERRIES)
				.add(Items.ARMOR_STAND)
				.add(Items.MINECART)
				.addOptionalTag(ItemTags.BOATS)
				.add(Items.END_CRYSTAL)
				.addOptionalTag(ConventionalItemTags.WATER_BUCKETS)
				.addOptionalTag(ConventionalItemTags.ENTITY_WATER_BUCKETS)
				.addOptionalTag(ConventionalItemTags.LAVA_BUCKETS)
		;

		getOrCreateTagBuilder(DynamicCrosshairItemTags.ALWAYS_USABLE)
				.add(Items.POTION)
				.addOptionalTag(ConventionalItemTags.POTIONS)
				.add(Items.HONEY_BOTTLE)
				.add(Items.GOLDEN_APPLE)
				.add(Items.ENCHANTED_GOLDEN_APPLE)
				.add(Items.MILK_BUCKET)
				.addOptionalTag(ConventionalItemTags.MILK_BUCKETS)
				.add(Items.OMINOUS_BOTTLE)
				.add(Items.GOAT_HORN)
				.add(Items.WRITABLE_BOOK)
				.add(Items.WRITTEN_BOOK)
		;

		getOrCreateTagBuilder(DynamicCrosshairItemTags.ALWAYS_USABLE_ON_BLOCK)
				.add(Items.BRUSH)
		;

		getOrCreateTagBuilder(DynamicCrosshairItemTags.ALWAYS_USABLE_ON_ENTITY)
		;

		getOrCreateTagBuilder(DynamicCrosshairItemTags.ALWAYS_USABLE_ON_MISS)
		;

		getOrCreateTagBuilder(DynamicCrosshairItemTags.USABLE)
				.addOptionalTag(ConventionalItemTags.FOODS)
				.addOptionalTag(ConventionalItemTags.ARMORS)
				.add(Items.ELYTRA)
				.add(Items.FIREWORK_ROCKET)
				// TODO spawn eggs
				.add(Items.FIRE_CHARGE)
				.addOptionalTag(ConventionalItemTags.MUSIC_DISCS)
				.add(Items.HONEYCOMB)
				.add(Items.ENDER_EYE)
				.add(Items.GLASS_BOTTLE)
				.add(Items.BUCKET)
				.addOptionalTag(ConventionalItemTags.EMPTY_BUCKETS)
				.add(Items.BONE_MEAL)
				.add(Items.BUNDLE)
		;
	}
}
