package com.dscalzi.vsreloader;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{

	private static Main instance;
	
	@Override
	public void onDisable(){
		
	}
	
	@Override
	public void onEnable(){
		if (getServer().getPluginManager().getPlugin("VirtualShop") == null) {
			this.getLogger().severe("VirtualShop not found. Shutting down!");
            this.getServer().getPluginManager().disablePlugin(this);
        }
		instance = this;
	}
	
	public static Plugin getInstance(){
		return instance;
	}
}
