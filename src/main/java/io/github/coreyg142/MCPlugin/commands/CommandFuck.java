package io.github.coreyg142.MCPlugin.commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;
import java.util.Map;

public class CommandFuck implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
		if(commandSender instanceof Player){
			Player player = (Player) commandSender;

			ItemStack diamond = new ItemStack(Material.DIAMOND);
			ItemStack bricks = new ItemStack(Material.BRICK, 20);

			diamond.addEnchantments(getGodEnchants());

			player.getInventory().addItem(diamond, bricks);
		}

		return true;
	}

	private Map<Enchantment, Integer> getGodEnchants(){
		Map<Enchantment, Integer> enchantments = new HashMap<>();

		enchantments.put(Enchantment.DAMAGE_ALL, 5000);
		enchantments.put(Enchantment.DURABILITY, 5000);
		enchantments.put(Enchantment.DIG_SPEED, 5000);
		enchantments.put(Enchantment.LOOT_BONUS_BLOCKS, 5000);
		enchantments.put(Enchantment.LOOT_BONUS_MOBS, 5000);

		return enchantments;
	}
}
