package me.manhinnn0509.rgb_joinquit_msg.events;

import me.manhinnn0509.rgb_joinquit_msg.RGB_JoinQuit_Msg;
import me.manhinnn0509.rgb_joinquit_msg.utils.ColorUtils;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class JoinQuitEvents implements Listener {

    private final RGB_JoinQuit_Msg plugin = RGB_JoinQuit_Msg.getPlugin();

    private int getStartingIndex() {
        return plugin.getConfig().getInt("starting-index");
    }

    private boolean enabled() {
        return plugin.getConfig().getBoolean("enable");
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        if (!enabled()) {
            return;
        }

        Player player = event.getPlayer();
        String joinMsg = ColorUtils.createRGB_Text(
                player.getName() + " joined the game.",
                getStartingIndex()
        );

        event.setJoinMessage(joinMsg);

        // This line is no longer needed. Since the console output supports RGB code.
        // System.out.println(ChatColor.YELLOW + player.getName() + " joined the game.");
    }

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event) {
        if (!enabled()) {
            return;
        }

        Player player = event.getPlayer();
        String leftMsg = ColorUtils.createRGB_Text(
                player.getName() + " left the game.",
                getStartingIndex()
        );

        event.setQuitMessage(leftMsg);

        // This line is no longer needed. Since the console output supports RGB code.
        // System.out.println(ChatColor.YELLOW + player.getName() + " left the game.");
    }

}
