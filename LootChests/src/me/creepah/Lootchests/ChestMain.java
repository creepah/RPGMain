package me.creepah.Lootchests;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import me.creepah.Lootchests.creation.lootchest;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class ChestMain extends JavaPlugin implements Listener {
	public final Logger logger = Logger.getLogger("Minecraft");
	public static ChestMain plugin;
	public static List<Location> t1lclocations = new ArrayList<Location>();
	public static List<Location> t2lclocations = new ArrayList<Location>();
	public static List<Location> t3lclocations = new ArrayList<Location>();
	public static List<Location> t4lclocations = new ArrayList<Location>();
	public static List<Location> t5lclocations = new ArrayList<Location>();
	
	public void onEnable(){
		Bukkit.getServer().getPluginManager().registerEvents(new lootchest(this), this);
	}

	// Saving locations of Chests

	public void savet1lcLocations() {
		List<String> locations = new ArrayList<String>();
		for (Location loc : t1lclocations) {
			String strLoc = loc.getWorld().getName() + "," + loc.getX() + ","
					+ loc.getY() + "," + loc.getZ();
			locations.add(strLoc);
		}
		File file = new File(getDataFolder(), "t1lclocations.yml");
		if (file.exists()) {
			file.delete();
		}
		Object config = YamlConfiguration.loadConfiguration(file);
		((FileConfiguration) config).set("locations", locations);
		try {
			((FileConfiguration) config).save(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void savet2lcLocations() {
		List<String> locations = new ArrayList<String>();
		for (Location loc : t2lclocations) {
			String strLoc = loc.getWorld().getName() + "," + loc.getX() + ","
					+ loc.getY() + "," + loc.getZ();
			locations.add(strLoc);
		}
		File file = new File(getDataFolder(), "t2lclocations.yml");
		if (file.exists()) {
			file.delete();
		}
		Object config = YamlConfiguration.loadConfiguration(file);
		((FileConfiguration) config).set("locations", locations);
		try {
			((FileConfiguration) config).save(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void savet3lcLocations() {
		List<String> locations = new ArrayList<String>();
		for (Location loc : t3lclocations) {
			String strLoc = loc.getWorld().getName() + "," + loc.getX() + ","
					+ loc.getY() + "," + loc.getZ();
			locations.add(strLoc);
		}
		File file = new File(getDataFolder(), "t3lclocations.yml");
		if (file.exists()) {
			file.delete();
		}
		Object config = YamlConfiguration.loadConfiguration(file);
		((FileConfiguration) config).set("locations", locations);
		try {
			((FileConfiguration) config).save(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void savet4lcLocations() {
		List<String> locations = new ArrayList<String>();
		for (Location loc : t4lclocations) {
			String strLoc = loc.getWorld().getName() + "," + loc.getX() + ","
					+ loc.getY() + "," + loc.getZ();
			locations.add(strLoc);
		}
		File file = new File(getDataFolder(), "t4lclocations.yml");
		if (file.exists()) {
			file.delete();
		}
		Object config = YamlConfiguration.loadConfiguration(file);
		((FileConfiguration) config).set("locations", locations);
		try {
			((FileConfiguration) config).save(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void savet5lcLocations() {
		List<String> locations = new ArrayList<String>();
		for (Location loc : t5lclocations) {
			String strLoc = loc.getWorld().getName() + "," + loc.getX() + ","
					+ loc.getY() + "," + loc.getZ();
			locations.add(strLoc);
		}
		File file = new File(getDataFolder(), "t5lclocations.yml");
		if (file.exists()) {
			file.delete();
		}
		Object config = YamlConfiguration.loadConfiguration(file);
		((FileConfiguration) config).set("locations", locations);
		try {
			((FileConfiguration) config).save(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// Loading of Loot Chest Locations

	public void loadt1lcLocations() {
		t1lclocations.clear();
		File file = new File(getDataFolder(), "t1lclocations.yml");
		FileConfiguration config = YamlConfiguration.loadConfiguration(file);
		for (String loc : config.getStringList("locations")) {
			String[] str = loc.split(",");
			World world = Bukkit.getWorld(str[0]);
			double x = Double.valueOf(str[1]).doubleValue();
			double y = Double.valueOf(str[2]).doubleValue();
			double z = Double.valueOf(str[3]).doubleValue();
			Location location = new Location(world, x, y, z);
			t1lclocations.add(location);
		}
	}

	public void loadt2lcLocations() {
		t2lclocations.clear();
		File file = new File(getDataFolder(), "t2lclocations.yml");
		FileConfiguration config = YamlConfiguration.loadConfiguration(file);
		for (String loc : config.getStringList("locations")) {
			String[] str = loc.split(",");
			World world = Bukkit.getWorld(str[0]);
			double x = Double.valueOf(str[1]).doubleValue();
			double y = Double.valueOf(str[2]).doubleValue();
			double z = Double.valueOf(str[3]).doubleValue();
			Location location = new Location(world, x, y, z);
			t2lclocations.add(location);
		}
	}

	public void loadt3lcLocations() {
		t3lclocations.clear();
		File file = new File(getDataFolder(), "t3lclocations.yml");
		FileConfiguration config = YamlConfiguration.loadConfiguration(file);
		for (String loc : config.getStringList("locations")) {
			String[] str = loc.split(",");
			World world = Bukkit.getWorld(str[0]);
			double x = Double.valueOf(str[1]).doubleValue();
			double y = Double.valueOf(str[2]).doubleValue();
			double z = Double.valueOf(str[3]).doubleValue();
			Location location = new Location(world, x, y, z);
			t3lclocations.add(location);
		}
	}

	public void loadt4lcLocations() {
		t4lclocations.clear();
		File file = new File(getDataFolder(), "t4lclocations.yml");
		FileConfiguration config = YamlConfiguration.loadConfiguration(file);
		for (String loc : config.getStringList("locations")) {
			String[] str = loc.split(",");
			World world = Bukkit.getWorld(str[0]);
			double x = Double.valueOf(str[1]).doubleValue();
			double y = Double.valueOf(str[2]).doubleValue();
			double z = Double.valueOf(str[3]).doubleValue();
			Location location = new Location(world, x, y, z);
			t4lclocations.add(location);
		}
	}

	public void loadt5lcLocations() {
		t1lclocations.clear();
		File file = new File(getDataFolder(), "t5lclocations.yml");
		FileConfiguration config = YamlConfiguration.loadConfiguration(file);
		for (String loc : config.getStringList("locations")) {
			String[] str = loc.split(",");
			World world = Bukkit.getWorld(str[0]);
			double x = Double.valueOf(str[1]).doubleValue();
			double y = Double.valueOf(str[2]).doubleValue();
			double z = Double.valueOf(str[3]).doubleValue();
			Location location = new Location(world, x, y, z);
			t5lclocations.add(location);
		}
	}

}
