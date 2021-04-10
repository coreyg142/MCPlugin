package io.github.coreyg142.MCPlugin;

import org.bukkit.plugin.java.JavaPlugin;

public class MCPlugin extends JavaPlugin {

	@Override
	public void onEnable(){
		getLogger().info("onEnable is called!");
	}

	@Override
	public void onDisable(){
		getLogger().info("onDisable is called!");
	}
}
