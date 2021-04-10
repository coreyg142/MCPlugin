package io.github.coreyg142.MCPlugin;

import io.github.coreyg142.MCPlugin.commands.CommandFuck;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public class MCPlugin extends JavaPlugin {

	@Override
	public void onEnable(){
		getLogger().info("Plugin is initialized!");

		Objects.requireNonNull(this.getCommand("fuck")).setExecutor(new CommandFuck());
	}

	@Override
	public void onDisable(){
		getLogger().info("onDisable is called!");
	}
}
