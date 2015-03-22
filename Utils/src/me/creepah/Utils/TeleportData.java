package me.creepah.Utils;

import org.bukkit.Location;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class TeleportData extends JavaPlugin implements Listener {
	
	public void onEnable(){
		
	}

	public String player;
	public Location loc;

	public TeleportData(String player, Location loc) {
		this.player = player;
		this.loc = loc;
	}

}
