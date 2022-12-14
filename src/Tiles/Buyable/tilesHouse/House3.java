package Tiles.Buyable.tilesHouse;

import Game.Player;
import Tiles.Interface.Tile;

public class House3 extends Tile {
    private String name = "Madrid";
    private int price = 100000;
    private int buildingPrice = 25000;
    private int priceHotel = 50000;
    private int numOfBuildings = 0;
    private String color = "br";
    private int[] rentPrice = {4000, 30000, 60000, 90000, 180000};
    private Player owner;
    private boolean[] playerPosition = {false, false, false, false};

    public House3(String name, int price, int buildingPrice, int priceHotel, String color, int[] rentPrice) {
        super(name, price, buildingPrice, priceHotel, color, rentPrice);
    }
}
