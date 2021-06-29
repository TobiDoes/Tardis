
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
public class TardisBuildingBlockBlock extends TheCubedGallifreyanModElements.ModElement {
	@ObjectHolder("the_cubed_gallifreyan:tardis_building_block")
	public static final Block block = null;
	public TardisBuildingBlockBlock(TheCubedGallifreyanModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(TardisBlocksItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.IRON).sound(SoundType.STONE).hardnessAndResistance(-1, 3600000).setLightLevel(s -> 0));
			setRegistryName("tardis_building_block");
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
