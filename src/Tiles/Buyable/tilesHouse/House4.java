package Tiles.Buyable.tilesHouse;

import Game.Player;
import Tiles.Interface.Tile;

public class House4 extends Tile {
    private String name = "Hong Kong";
    private int price = 150000;
    private int buildingPrice = 50000;
    private int priceHotel = 100000;
    private int numOfBuildings = 0;
    private String color = "lb";
    private int[] rentPrice = {6000, 33000, 65000, 98000, 195000};
    private Player owner;
    private boolean[] playerPosition = {false, false, false, false};

    public House4(String name, int price, int buildingPrice, int priceHotel, String color, int[] rentPrice) {
        super(name, price, buildingPrice, priceHotel, color, rentPrice);
    }
}
