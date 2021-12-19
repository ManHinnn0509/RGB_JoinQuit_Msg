package me.manhinnn0509.rgb_joinquit_msg.utils;

public class MathUtils {
    /*
    public static String formatNumber(int number) {
        return String.format("%,d", number);
    }
     */

    /*
    public static String formatNumber(long number) {
        return String.format("%,d", number);
    }
     */

    /**
     * Returns a randomly generated int. <br />
     * Example: min = 3, max = 5 <br />
     * Result range: [3, 5] <- 3 ~ 5
     * @param min Minimum value
     * @param max Maximum value
     * @return Random integer [min, max]
     */
    public static int randInt(int min, int max){
        return min + (int)(Math.random() * ((max - min) + 1));
    }
}
