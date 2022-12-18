package Prints;

import Game.Player;

public class UI {
    public static void ui(Player player) {
        StringBuilder stringBuilder = new StringBuilder();

        System.out.println(stringBuilder.append(player.getName()+ "    " + player.getPiece() + "\n" + "--------------" + "\n" + "💶 " + player.getMoney() + " 💶"));
        if (player.isCardHolder()) {
            System.out.println("🛶");
        }
    }
}