package Tiles.Tax;

import Game.Player;
import Tiles.Interface.Tile;
import Tiles.Interface.Tile2;

public class IncomeTax extends Tile {

    private int fee = 200000;
    private boolean[] playerPosition = {false, false, false, false};

    public IncomeTax(String name, int price, int buildingPrice, int priceHotel, String color, int[] rentPrice) {
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

    public void taxFee (Player[] players) {
        int temp = checkPlayerLanding();
        if (temp > 0){
            players[temp].setMoney(players[temp].getMoney() - fee);
        }
    }
}
