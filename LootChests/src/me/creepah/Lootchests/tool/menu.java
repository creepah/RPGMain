package me.creepah.Lootchests.tool;

import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class menu extends JavaPlugin{
	
	private void OpenGUI(Player player)
	  {
	    Inventory inv = Bukkit.createInventory(null, 9, ChatColor.AQUA +  "" + 
	      ChatColor.BOLD + "Phyria " + ChatColor.WHITE + 
	      "Chest Creation Tool");
	    
	    ItemStack lc = new ItemStack(Material.CHEST);
	    ItemMeta lcMeta = lc.getItemMeta();
	    ItemStack mc = new ItemStack(Material.CHEST);
	    ItemMeta mcMeta = mc.getItemMeta();
	    ItemStack tc = new ItemStack(Material.CHEST);
	    ItemMeta tcMeta = tc.getItemMeta();
	    
	    lcMeta.setDisplayName(ChatColor.YELLOW + "Loot Chest Creation Tool");
	    lcMeta.setLore(Arrays.asList(new String[] {ChatColor.DARK_GRAY + 
	      "Click to set the tool to", ChatColor.DARK_GRAY + 
	      "a loot chest tool." }));
	    lc.setItemMeta(lcMeta);
	    
	    mcMeta.setDisplayName(ChatColor.AQUA + "Player Market Creation Tool");
	    mcMeta.setLore(Arrays.asList(new String[] {ChatColor.DARK_GRAY + 
	      "Click to set the tool to", ChatColor.DARK_GRAY + 
	      "a market chest tool." }));
	    mc.setItemMeta(mcMeta);
	    
	    tcMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Treasure Chest Creation Tool");
	    tcMeta.setLore(Arrays.asList(new String[] {ChatColor.DARK_GRAY + 
	      "Click to set the tool to", ChatColor.DARK_GRAY + 
	      "a treasure chest tool." }));
	    tc.setItemMeta(tcMeta);
	    
	    inv.setItem(0, lc);
	    inv.setItem(1, mc);
	    inv.setItem(2, tc);
	    
	    player.openInventory(inv);
	  }

}
