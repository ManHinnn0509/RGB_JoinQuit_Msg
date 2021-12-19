package me.manhinnn0509.rgb_joinquit_msg;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Command implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, org.bukkit.command.Command command, String label, String[] args) {
        RGB_JoinQuit_Msg plugin = RGB_JoinQuit_Msg.getPlugin();

        if (command.getName().equals("rgbjqmsg")) {
            if (args == null) {
                return true;
            }

            if (args.length == 0) {
                return true;
            }

            if ("reload".equals(args[0])) {
                plugin.reloadConfig();
                sender.sendMessage(ChatColor.AQUA + "[RGB_JoinQuit_Msg] Config file reloaded");
            }
        }

        return true;
    }
}
