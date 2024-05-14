package mod.crend.dynamiccrosshair.api;

import net.minecraft.entity.EntityType;

public interface DynamicCrosshairApiEntityType {
	default boolean isAlwaysInteractable(EntityType<?> entityType) { return false; }

	default boolean isInteractable(EntityType<?> entityType) { return false; }
}
