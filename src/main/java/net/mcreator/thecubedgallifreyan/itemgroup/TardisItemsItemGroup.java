
package net.mcreator.thecubedgallifreyan.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.thecubedgallifreyan.item.TardisKeyItem;
import net.mcreator.thecubedgallifreyan.TheCubedGallifreyanModElements;

@TheCubedGallifreyanModElements.ModElement.Tag
public class TardisItemsItemGroup extends TheCubedGallifreyanModElements.ModElement {
	public TardisItemsItemGroup(TheCubedGallifreyanModElements instance) {
		super(instance, 7);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabtardis_items") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(TardisKeyItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
