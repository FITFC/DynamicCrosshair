package mod.crend.dynamiccrosshair.mixin.item;

import mod.crend.dynamiccrosshair.api.CrosshairContext;
import mod.crend.dynamiccrosshair.api.DynamicCrosshairItem;
import mod.crend.dynamiccrosshair.api.InteractionType;
import mod.crend.dynamiccrosshair.component.Crosshair;
import net.minecraft.block.BeehiveBlock;
import net.minecraft.entity.AreaEffectCloudEntity;
import net.minecraft.item.GlassBottleItem;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.world.RaycastContext;
import org.spongepowered.asm.mixin.Mixin;

import java.util.List;

@Mixin(GlassBottleItem.class)
public class GlassBottleItemMixin implements DynamicCrosshairItem {
	@Override
	public InteractionType dynamiccrosshair$compute(CrosshairContext context) {
		if (context.isWithBlock()) {
			if (context.getBlock() instanceof BeehiveBlock && context.getBlockState().get(BeehiveBlock.HONEY_LEVEL) >= 5 && !context.player.shouldCancelInteraction()) {
				return InteractionType.FILL_ITEM_FROM_BLOCK;
			}
		}

		// Dragon's breath
		List<AreaEffectCloudEntity> list = context.world.getEntitiesByClass(
				AreaEffectCloudEntity.class,
				context.player.getBoundingBox().expand(2.0),
				entity -> entity != null
						&& entity.isAlive()
						&& entity.getParticleType().getType() == ParticleTypes.DRAGON_BREATH
		);
		if (!list.isEmpty()) {
			return InteractionType.FILL_ITEM_FROM_ENTITY;
		}

		// Liquid interactions ignore block hit, cast extra rays
		// This getting called for entity hits is on purpose, as liquid interactions overwrite entity interactions
		BlockHitResult blockHitResult = context.raycastWithFluid(RaycastContext.FluidHandling.ANY);
		if (context.world.getFluidState(blockHitResult.getBlockPos()).isIn(FluidTags.WATER)) {
			return InteractionType.FILL_ITEM_FROM_BLOCK;
		}

		return InteractionType.NO_ACTION;
	}
}
