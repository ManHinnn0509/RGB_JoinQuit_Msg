package me.manhinnn0509.rgb_joinquit_msg;

import me.manhinnn0509.rgb_joinquit_msg.events.JoinQuitEvents;
import org.bukkit.event.Listener;

public class InitPlugin {

    public static void registerListeners(RGB_JoinQuit_Msg plugin) {
        // Listeners
        final Listener[] listeners = {
                new JoinQuitEvents()
        };

        for (Listener listener : listeners) {
            plugin.getServer().getPluginManager().registerEvents(listener, plugin);
        }
    }

    public static void registerCommands(RGB_JoinQuit_Msg plugin) {
        // Commands
        final String[] commands = {
                "rgbjqmsg"
        };

        for (String command : commands) {
            plugin.getCommand(command).setExecutor(new Command());
        }
    }
}
