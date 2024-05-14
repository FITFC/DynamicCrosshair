package mod.crend.dynamiccrosshair.mixin.entity;

import mod.crend.dynamiccrosshair.api.CrosshairContext;
import mod.crend.dynamiccrosshair.api.DynamicCrosshairEntity;
import mod.crend.dynamiccrosshair.api.InteractionType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.vehicle.BoatEntity;
import net.minecraft.entity.vehicle.VehicleInventory;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(BoatEntity.class)
public abstract class BoatEntityMixin implements DynamicCrosshairEntity {
	@Shadow protected abstract boolean canAddPassenger(Entity passenger);

	@Override
	public InteractionType dynamiccrosshair$compute(CrosshairContext context) {
		if (this instanceof VehicleInventory) {
			return InteractionType.INTERACT_WITH_ENTITY;
		}
		if (!context.player.shouldCancelInteraction() && this.canAddPassenger(context.player)) {
			return InteractionType.MOUNT_ENTITY;
		}
		return InteractionType.NO_ACTION;
	}
}
