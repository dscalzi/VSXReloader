/*
 * VSXReloader
 * Copyright (C) 2016-2017 Daniel D. Scalzi
 * See License.txt for license information.
 */
package com.dscalzi.vsxreloader;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class VSXReloader extends JavaPlugin {

	private static VSXReloader instance;
	
	@Override
	public void onEnable(){
		if (getServer().getPluginManager().getPlugin("VirtualShopX") == null) {
			this.getLogger().severe("VirtualShopX not found. Shutting down!");
            this.getServer().getPluginManager().disablePlugin(this);
        }
		instance = this;
	}
	
	public static Plugin getInstance(){
		return instance;
	}
}
