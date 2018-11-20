package com.leterio.minecraftmods.meteorsmod.items;

import java.util.ArrayList;
import java.util.List;

public final class Items {
	private Items() {}

	public static final List<ItemBase> ITEMS = new ArrayList<>();

	// @formatter:off
	public static final ItemBase itemMeteorChips      = new ItemMeteorGems("meteor_chips"     );
	public static final ItemBase itemRedMeteorGem     = new ItemMeteorGems("red_meteor_gem"   );
	public static final ItemBase itemFrezariteCrystal = new ItemMeteorGems("frezarite_crystal");
	public static final ItemBase itemKreknoriteChip   = new ItemMeteorGems("kreknorite_chip"  );
	// @formatter:on
}
