package me.creepah.Lootchests.t3loot;

import java.util.Arrays;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class T3 extends JavaPlugin {

	public static void lct1(Player p) {
		Random rand = new Random();
		int gems = rand.nextInt(26);
		int apple = rand.nextInt(3);
		int bread = rand.nextInt(3);
		int chance = rand.nextInt(8) + 1;
		int orbchance = rand.nextInt (500) + 1;

		ItemStack t3scroll = new ItemStack(Material.EMPTY_MAP);
		ItemMeta t3scrollmeta = t3scroll.getItemMeta();
		t3scrollmeta.setDisplayName(ChatColor.WHITE + "" + ChatColor.BOLD
				+ "Scroll:" + ChatColor.AQUA + " Enchant Iron Armor");
		t3scrollmeta.setLore(Arrays.asList(new String[] {
				ChatColor.RED + "+5% HP",
				ChatColor.RED + "+5% HP REGEN",
				ChatColor.GRAY + "   - OR -",
				ChatColor.RED + "+5% VIT",
				ChatColor.GRAY + "" + ChatColor.ITALIC
						+ "Armor will VANISH if enchant above +3 FAILS." }));

		ItemStack t3wepscroll = new ItemStack(Material.EMPTY_MAP);
		ItemMeta t3wepscrollmeta = t3wepscroll.getItemMeta();
		t3wepscrollmeta.setDisplayName(ChatColor.WHITE + "" + ChatColor.BOLD
				+ "Scroll:" + ChatColor.AQUA + " Enchant Iron Weapon");
		t3wepscrollmeta.setLore(Arrays.asList(new String[] {
				ChatColor.RED + "+5% DMG",
				ChatColor.GRAY + "" + ChatColor.ITALIC
						+ "Weapon will VANISH if enchant above +3 FAILS." }));
		t3wepscroll.setItemMeta(t3wepscrollmeta);
		
		ItemStack orb = new ItemStack(Material.MAGMA_CREAM);
		ItemMeta orbmeta = orb.getItemMeta();
		orbmeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Orb of Alteration");
		orbmeta.setLore(Arrays.asList(new String[] { ChatColor.GRAY
				+ "Randomizes stats of selected equipment." }));
		orb.setItemMeta(orbmeta);

		ItemStack gc = new ItemStack(Material.EMERALD, gems);
		ItemMeta gcMeta = gc.getItemMeta();
		gcMeta.setDisplayName("Gem");
		gcMeta.setLore(Arrays.asList(new String[] { ChatColor.GRAY
				+ "The Currency of Andalucia" }));
		gc.setItemMeta(gcMeta);

		ItemStack a = new ItemStack(Material.APPLE, apple);
		ItemStack b = new ItemStack(Material.BREAD, bread);

		ItemStack c = new ItemStack(Material.COOKED_CHICKEN, 1);

		ItemStack be = new ItemStack(Material.COOKED_BEEF, 1);

		// Chest

		Inventory invlc = Bukkit.createInventory(null, 27, ChatColor.WHITE
				+ "Loot Chest");

		if (chance < 3)
			invlc.addItem(new ItemStack[] { gc });
		if (chance == 2)
			invlc.addItem(new ItemStack[] { a });
		if (chance == 1)
			invlc.addItem(new ItemStack[] { b });

		if (chance == 5)
			invlc.addItem(new ItemStack[] { c });
		if (chance == 6)
			invlc.addItem(new ItemStack[] { be });
		if (chance == 7)
			invlc.addItem(new ItemStack[] { t3scroll });
		if (chance == 8)
			invlc.addItem(new ItemStack[] { t3wepscroll });

		p.openInventory(invlc);
		p.playSound(p.getLocation(), Sound.CHEST_OPEN, 1.0F, 1.0F);
	}

}
