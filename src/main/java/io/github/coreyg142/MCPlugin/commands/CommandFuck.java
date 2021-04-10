package io.github.coreyg142.MCPlugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.HashMap;
import java.util.Map;

/**
 * The command executor for the /fuck command
 * Gives the player a diamond with god enchantments.
 *
 * @author Corey Gross
 */
public class CommandFuck implements CommandExecutor {
	/**The message to send the player after execution*/
	private final static String MESSAGE = (ChatColor.DARK_PURPLE + "" + ChatColor.BOLD +
			"You have been blessed with The Diamond");
	/**The name of the Diamond*/
	private final static String DIAMOND_NAME = (ChatColor.BOLD + "" + ChatColor.AQUA + "" + ChatColor.MAGIC + "asd" +
			ChatColor.RESET + ChatColor.BOLD + ChatColor.LIGHT_PURPLE + "The Diamond" +
			ChatColor.RESET + ChatColor.BOLD + ChatColor.AQUA + ChatColor.MAGIC + "asd");

	@Override
	public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
		if(commandSender instanceof Player){
			Player player = (Player) commandSender;

			ItemStack diamond = new ItemStack(Material.DIAMOND);

			diamond.addUnsafeEnchantments(getGodEnchants());
			ItemMeta diamondMeta = diamond.getItemMeta();
			assert diamondMeta != null;
			diamondMeta.setDisplayName(DIAMOND_NAME);

			diamond.setItemMeta(diamondMeta);
			player.getInventory().addItem(diamond);
			player.sendMessage(MESSAGE);
		}

		return true;
	}

	/**
	 * Returns a Map of various god enchants
	 *
	 * @return {@link Map} of Enchantment, Integer - Enchantment, Integer=level
	 */
	private Map<Enchantment, Integer> getGodEnchants(){
		Map<Enchantment, Integer> enchantments = new HashMap<>();

		enchantments.put(Enchantment.DAMAGE_ALL, 5000);
		enchantments.put(Enchantment.DURABILITY, 5000);
		enchantments.put(Enchantment.LOOT_BONUS_MOBS, 5000);
		enchantments.put(Enchantment.FIRE_ASPECT, 5000);

		return enchantments;
	}
}
