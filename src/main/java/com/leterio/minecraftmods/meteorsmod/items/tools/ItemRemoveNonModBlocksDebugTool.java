package com.leterio.minecraftmods.meteorsmod.items.tools;

import java.text.MessageFormat;
import java.util.Objects;

import com.leterio.minecraftmods.meteorsmod.blocks.BlockBase;
import com.leterio.minecraftmods.meteorsmod.items.GenericItem;
import com.leterio.minecraftmods.meteorsmod.util.Logger;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemRemoveNonModBlocksDebugTool extends GenericItem {
	private static int range = 15;
	
	public ItemRemoveNonModBlocksDebugTool() {
		super("tool_rnmbdt", 1);
	}
	
	@Override
	public boolean onDroppedByPlayer(ItemStack item, EntityPlayer player) {
		return false;
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
		Objects.requireNonNull(playerIn, "Player must not be null");
		Objects.requireNonNull(worldIn, "WorldIn must not be null");

		long start = System.currentTimeMillis();
		for (int x = playerIn.getPosition().getX() - range; x < playerIn.getPosition().getX() + range; x++) {
			for (int z = playerIn.getPosition().getZ() - range; z < playerIn.getPosition().getZ() + range; z++) {
				for (int y = playerIn.getPosition().getY() + 3; y > playerIn.getPosition().getY() - range && y >= 1; y--) {
					BlockPos blockPos = new BlockPos(x, y, z);
					IBlockState blockState = worldIn.getBlockState(blockPos);
					if (!BlockBase.class.isInstance(blockState.getBlock())) {
						worldIn.setBlockToAir(blockPos);
					}
				}
			}
		}
		Logger.info(() -> MessageFormat.format("took {0}", System.currentTimeMillis() - start));

		return super.onItemRightClick(worldIn, playerIn, handIn);
	}

}
