
package net.mcreator.thecubedgallifreyan.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.thecubedgallifreyan.itemgroup.TardisItemsItemGroup;
import net.mcreator.thecubedgallifreyan.TheCubedGallifreyanModElements;

@TheCubedGallifreyanModElements.ModElement.Tag
public class TardisKeyItem extends TheCubedGallifreyanModElements.ModElement {
	@ObjectHolder("the_cubed_gallifreyan:tardis_key")
	public static final Item block = null;
	public TardisKeyItem(TheCubedGallifreyanModElements instance) {
		super(instance, 6);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(TardisItemsItemGroup.tab).maxStackSize(64).isImmuneToFire().rarity(Rarity.COMMON));
			setRegistryName("tardis_key");
		}

		@Override
		public boolean hasContainerItem() {
			return true;
		}

		@Override
		public ItemStack getContainerItem(ItemStack itemstack) {
			return new ItemStack(this);
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
