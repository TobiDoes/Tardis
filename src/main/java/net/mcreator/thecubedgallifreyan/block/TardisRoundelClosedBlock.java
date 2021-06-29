
package net.mcreator.thecubedgallifreyan.block;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.thecubedgallifreyan.itemgroup.TardisBlocksItemGroup;
import net.mcreator.thecubedgallifreyan.TheCubedGallifreyanModElements;

import java.util.List;
import java.util.Collections;

@TheCubedGallifreyanModElements.ModElement.Tag
public class TardisRoundelClosedBlock extends TheCubedGallifreyanModElements.ModElement {
	@ObjectHolder("the_cubed_gallifreyan:tardis_roundel_closed")
	public static final Block block = null;
	public TardisRoundelClosedBlock(TheCubedGallifreyanModElements instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(TardisBlocksItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(10000f, 10000f).setLightLevel(s -> 15));
			setRegistryName("tardis_roundel_closed");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}
	}
}
