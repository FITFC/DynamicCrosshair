package mod.crend.dynamiccrosshair;

import dev.architectury.injectables.annotations.ExpectPlatform;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.BucketItem;

public class PlatformUtils {
	@ExpectPlatform
	public static boolean isModLoaded(String modid) {
		throw new AssertionError();
	}

	@ExpectPlatform
	public static Fluid getFluidFromBucket(BucketItem bucket) {
		throw new AssertionError();
	}
}
