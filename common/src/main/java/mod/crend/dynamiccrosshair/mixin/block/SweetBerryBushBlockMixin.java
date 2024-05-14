package mod.crend.dynamiccrosshair.mixin.block;

import mod.crend.dynamiccrosshair.api.CrosshairContext;
import mod.crend.dynamiccrosshair.api.DynamicCrosshairBlock;
import mod.crend.dynamiccrosshair.api.InteractionType;
import net.minecraft.block.SweetBerryBushBlock;
import net.minecraft.state.property.IntProperty;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(SweetBerryBushBlock.class)
public class SweetBerryBushBlockMixin implements DynamicCrosshairBlock {
	@Shadow @Final public static IntProperty AGE;

	@Override
	public InteractionType dynamiccrosshair$compute(CrosshairContext context) {
		if (context.getBlockState().get(AGE) > 1) {
			return InteractionType.TAKE_ITEM_FROM_BLOCK;
		}
		return InteractionType.NO_ACTION;
	}
}
