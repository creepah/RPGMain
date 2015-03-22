package me.creepah.Lootchests.creation;

import java.util.List;

import me.creepah.Lootchests.ChestMain;

import org.bukkit.ChatColor;
import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class lootchest extends JavaPlugin implements Listener {

	public ChestMain plugin;

	public lootchest(ChestMain plugin) {
		this.plugin = plugin;
	}

	@EventHandler
	public void onChestCreate(PlayerInteractEvent e) {
		Player p = e.getPlayer();
		if (p.isOp()) {
			if ((e.getAction() == Action.RIGHT_CLICK_BLOCK)
					&& (e.getClickedBlock().getType() == Material.CHEST)
					&& (p.getItemInHand() != null)
					&& (p.getItemInHand().getType() == Material.STICK)
					&& (p.getItemInHand().getItemMeta().hasDisplayName())) {
				if ((p.getItemInHand().getItemMeta().getDisplayName()
						.equals(ChatColor.AQUA + "" + ChatColor.BOLD
								+ "Phyria " + ChatColor.WHITE
								+ "Chest Creation Tool"))
						&& (p.getItemInHand().getItemMeta().hasLore())) {
					List<?> lore = p.getItemInHand().getItemMeta().getLore();
					if (((String) lore.get(3)).equals(ChatColor.YELLOW
							+ "Currently: " + ChatColor.AQUA
							+ "T1 Loot Chest Tool")) {
						e.setCancelled(true);
						p.sendMessage(ChatColor.BLUE + "You have created a "
								+ ChatColor.GREEN + ChatColor.UNDERLINE
								+ "T1 Loot Chest");
						ChestMain.t1lclocations.add(e.getClickedBlock()
								.getLocation());
						e.getClickedBlock()
								.getWorld()
								.playEffect(e.getClickedBlock().getLocation(),
										Effect.STEP_SOUND,
										Material.JACK_O_LANTERN);
					}
					if (((String) lore.get(3)).equals(ChatColor.YELLOW
							+ "Currently: " + ChatColor.AQUA
							+ "T2 Loot Chest Tool")) {
						e.setCancelled(true);
						p.sendMessage(ChatColor.BLUE + "You have created a "
								+ ChatColor.GREEN + ChatColor.UNDERLINE
								+ "T2 Loot Chest");
						ChestMain.t2lclocations.add(e.getClickedBlock()
								.getLocation());
						e.getClickedBlock()
								.getWorld()
								.playEffect(e.getClickedBlock().getLocation(),
										Effect.STEP_SOUND,
										Material.JACK_O_LANTERN);
					}
					if (((String) lore.get(3)).equals(ChatColor.YELLOW
							+ "Currently: " + ChatColor.AQUA
							+ "T3 Loot Chest Tool")) {
						e.setCancelled(true);
						p.sendMessage(ChatColor.BLUE + "You have created a "
								+ ChatColor.GREEN + ChatColor.UNDERLINE
								+ "T3 Loot Chest");
						ChestMain.t3lclocations.add(e.getClickedBlock()
								.getLocation());
						e.getClickedBlock()
								.getWorld()
								.playEffect(e.getClickedBlock().getLocation(),
										Effect.STEP_SOUND,
										Material.JACK_O_LANTERN);
					}
					if (((String) lore.get(3)).equals(ChatColor.YELLOW
							+ "Currently: " + ChatColor.AQUA
							+ "T4 Loot Chest Tool")) {
						e.setCancelled(true);
						p.sendMessage(ChatColor.BLUE + "You have created a "
								+ ChatColor.GREEN + ChatColor.UNDERLINE
								+ "T4 Loot Chest");
						ChestMain.t4lclocations.add(e.getClickedBlock()
								.getLocation());
						e.getClickedBlock()
								.getWorld()
								.playEffect(e.getClickedBlock().getLocation(),
										Effect.STEP_SOUND,
										Material.JACK_O_LANTERN);
					}
					if (((String) lore.get(3)).equals(ChatColor.YELLOW
							+ "Currently: " + ChatColor.AQUA
							+ "T5 Loot Chest Tool")) {
						e.setCancelled(true);
						p.sendMessage(ChatColor.BLUE + "You have created a "
								+ ChatColor.GREEN + ChatColor.UNDERLINE
								+ "T5 Loot Chest");
						ChestMain.t5lclocations.add(e.getClickedBlock()
								.getLocation());
						e.getClickedBlock()
								.getWorld()
								.playEffect(e.getClickedBlock().getLocation(),
										Effect.STEP_SOUND,
										Material.JACK_O_LANTERN);
					}
				}
			}
		}

		if ((e.getAction() == Action.LEFT_CLICK_BLOCK)
				&& (e.getClickedBlock().getType() == Material.CHEST)
				&& (p.getItemInHand() != null)
				&& (p.getItemInHand().getType() == Material.STICK)
				&& (p.getItemInHand().getItemMeta().hasDisplayName())) {
			if (p.getItemInHand()
					.getItemMeta()
					.getDisplayName()
					.equals(ChatColor.AQUA + "" + ChatColor.BOLD + "Phyria "
							+ ChatColor.WHITE + "Chest Creation Tool")) {
				for (int i = 0; i < 100; i++) {
					ChestMain.t1lclocations.remove(e.getClickedBlock()
							.getLocation());
				}
				for (int i = 0; i < 100; i++) {
					ChestMain.t2lclocations.remove(e.getClickedBlock()
							.getLocation());
				}
				for (int i = 0; i < 100; i++) {
					ChestMain.t3lclocations.remove(e.getClickedBlock()
							.getLocation());
				}
				for (int i = 0; i < 100; i++) {
					ChestMain.t4lclocations.remove(e.getClickedBlock()
							.getLocation());
				}
				for (int i = 0; i < 100; i++) {
					ChestMain.t5lclocations.remove(e.getClickedBlock()
							.getLocation());
				}
				p.sendMessage(ChatColor.GRAY
						+ "You have removed a loot chest at "
						+ e.getClickedBlock().getLocation().toVector());
			}
		}
	}
}
