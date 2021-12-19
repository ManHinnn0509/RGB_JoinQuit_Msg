package me.manhinnn0509.rgb_joinquit_msg;

import me.manhinnn0509.rgb_joinquit_msg.events.JoinQuitEvents;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class RGB_JoinQuit_Msg extends JavaPlugin {

    private static RGB_JoinQuit_Msg plugin;
    public static RGB_JoinQuit_Msg getPlugin() {
        return plugin;
    }

    @Override
    public void onEnable() {
        // Plugin startup logic
        plugin = this;

        // Config file
        getConfig().options().copyDefaults();
        saveDefaultConfig();

        // Register events, command etc
        InitPlugin.registerListeners(plugin);
        InitPlugin.registerCommands(plugin);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

}
