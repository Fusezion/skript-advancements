package io.github.fusezion.skriptadvancements;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class SkriptAdvancements extends JavaPlugin {


	@Override
	public void onLoad() {
		// Loading api comes before enabling why no clue, needed when api is added
	}

	@Override
	public void onEnable() {
		// Loading skript addon, and finalizing api initialization
	}

	public void disablePlugin(String reason) {
		getLogger().severe("Plugin ran into an issue, and will be disabling, cause of shutdown:\n" + reason);
		Bukkit.getPluginManager().disablePlugin(this);
	}

	@Override
	public void onDisable() {
		// Needed for #onLoad method when api is properly added
	}

}
