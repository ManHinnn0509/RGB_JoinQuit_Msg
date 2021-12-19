package me.manhinnn0509.rgb_joinquit_msg.utils;

import net.md_5.bungee.api.ChatColor;

public class ColorUtils {
    public static final String[] rgbColors = {
            "§x§0§0§8§7§F§F", "§x§0§0§A§F§F§F", "§x§0§0§D§7§D§7", "§x§0§0§F§F§A§F", "§x§5§F§F§F§5§F",
            "§x§8§7§F§F§0§0", "§x§D§F§D§7§0§0", "§x§F§F§A§F§0§0", "§x§F§F§8§7§0§0", "§x§F§F§5§F§5§F",
            "§x§F§F§0§0§8§7", "§x§D§7§0§0§D§7", "§x§A§F§0§0§F§F", "§x§8§7§0§0§F§F", "§x§5§F§5§F§F§F"
    };

    public static String createRGB_Text(String message, int startingIndex) {
        if (startingIndex < 0) {
            startingIndex = MathUtils.randInt(0, rgbColors.length);
        }
        char[] chars = message.toCharArray();

        final int colorAmount = rgbColors.length;
        StringBuilder stringBuilder = new StringBuilder();
        for (char aChar : chars) {
            stringBuilder.append(rgbColors[startingIndex % colorAmount]).append(aChar);
            startingIndex++;
        }

        return stringBuilder.toString();
    }

    /*
    public static final String[] rgbColorsHex = {
            "#0087FF", "#00AFFF", "#00D7D7", "#00FFAF", "#5FFF5F",
            "#87FF00", "#DFD700", "#FFAF00", "#FF8700", "#FF5F5F",
            "#FF0087", "#D700D7", "#AF00FF", "#8700FF", "#5F5FFF"
    };

    public static String colorizeString(String text, String hexColorCode) {
        return ChatColor.of(hexColorCode) + text;
    }
     */
}