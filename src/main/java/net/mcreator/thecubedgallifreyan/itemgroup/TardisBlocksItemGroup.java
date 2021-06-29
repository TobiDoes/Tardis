
package net.mcreator.thecubedgallifreyan.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.thecubedgallifreyan.block.TardisRoundelClosedBlock;
import net.mcreator.thecubedgallifreyan.TheCubedGallifreyanModElements;

@TheCubedGallifreyanModElements.ModElement.Tag
public class TardisBlocksItemGroup extends TheCubedGallifreyanModElements.ModElement {
	public TardisBlocksItemGroup(TheCubedGallifreyanModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabtardis_blocks") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(TardisRoundelClosedBlock.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
