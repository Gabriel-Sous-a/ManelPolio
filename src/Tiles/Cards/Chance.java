package Tiles.Cards;

import Game.Player;
import Tiles.Interface.Tile;
import Tiles.Interface.Tile2;

public class Chance extends Tile { //half done
    private boolean[] playerPosition = {false, false, false, false};

    public Chance(String name, int price, int buildingPrice, int priceHotel, String color, int[] rentPrice) {
        super(name, price, buildingPrice, priceHotel, color, rentPrice);
    }

    public int checkPlayerLanding() {
        for (int i = 0; i < playerPosition.length; i++) {
            if (playerPosition[i]) {
                return i + 1;
            }
        }
        return 0;
    }

    public void freeIslandCard(Player[] players) {
        int temp = checkPlayerLanding();
        if (temp > 0) {
            players[temp].setCardHolder(true);
        }
    }
}
