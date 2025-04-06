package evanwae.automapupdater;

import org.bukkit.plugin.java.JavaPlugin;

public class AutoMapUpdater extends JavaPlugin {

    @Override
    public void onEnable() {
        // Called when your plugin is enabled
        getLogger().info("AutoMapUpdater has been enabled!");
        // You can register commands, events, etc. here
    }

    @Override
    public void onDisable() {
        // Called when your plugin is disabled
        getLogger().info("AutoMapUpdater has been disabled.");
    }
}
