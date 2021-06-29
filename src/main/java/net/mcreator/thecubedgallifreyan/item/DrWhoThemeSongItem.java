
package net.mcreator.thecubedgallifreyan.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.Item;

import net.mcreator.thecubedgallifreyan.itemgroup.TardisItemsItemGroup;
import net.mcreator.thecubedgallifreyan.TheCubedGallifreyanModElements;

@TheCubedGallifreyanModElements.ModElement.Tag
public class DrWhoThemeSongItem extends TheCubedGallifreyanModElements.ModElement {
	@ObjectHolder("the_cubed_gallifreyan:dr_who_theme_song")
	public static final Item block = null;
	public DrWhoThemeSongItem(TheCubedGallifreyanModElements instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, TheCubedGallifreyanModElements.sounds.get(new ResourceLocation("the_cubed_gallifreyan:drwhotheme")),
					new Item.Properties().group(TardisItemsItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("dr_who_theme_song");
		}
	}
}
