package io.github.coreyg142.MCPlugin;

import io.github.coreyg142.MCPlugin.commands.*;
import io.github.coreyg142.MCPlugin.listeners.MyListener;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public class MCPlugin extends JavaPlugin {

	@Override
	public void onEnable(){
		getLogger().info("Plugin is initialized!");

		Objects.requireNonNull(this.getCommand("kit")).setExecutor(new CommandKit());
		getServer().getPluginManager().registerEvents(new MyListener(), this);
	}

	@Override
	public void onDisable(){
		getLogger().info("onDisable is called!");
	}
}
