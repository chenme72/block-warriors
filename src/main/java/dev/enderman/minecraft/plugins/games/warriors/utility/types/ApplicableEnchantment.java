package dev.enderman.minecraft.plugins.games.warriors.utility.types;

import org.bukkit.enchantments.Enchantment;
import org.jetbrains.annotations.NotNull;

public final class ApplicableEnchantment {
	private final Enchantment enchantment;
	private final int level;
	private final boolean ignoreLevelRestriction;

	public ApplicableEnchantment(@NotNull final Enchantment enchantment, final int level,
	                             final boolean ignoreLevelRestriction) {
		this.enchantment = enchantment;
		this.level = level;
		this.ignoreLevelRestriction = ignoreLevelRestriction;
	}

	public Enchantment getEnchantment() {
		return enchantment;
	}

	public int getLevel() {
		return level;
	}

	public boolean ignoresLevelRestriction() {
		return ignoreLevelRestriction;
	}
}
