package Tiles.Jail;

import Tiles.Interface.Tile;
import Tiles.Interface.Tile2;

public class LostIsland extends Tile {
    private boolean[] playerPosition = {false, false, false, false};

    public LostIsland(String name, int price, int buildingPrice, int priceHotel, String color, int[] rentPrice) {
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
}
