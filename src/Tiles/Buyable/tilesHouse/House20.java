package Tiles.Buyable.tilesHouse;

import Game.Player;
import Tiles.Interface.Tile;

public class House20 extends Tile {
    private String name = "Tokyo";
    private int price = 550000;
    private int buildingPrice = 200000;
    private int priceHotel = 250000;
    private int numOfBuildings = 0;
    private String color = "db";
    private int[] rentPrice = {50000, 200000, 400000, 600000, 1100000};
    private Player owner;
    private boolean [] playerPosition = {false, false, false ,false};


    public House20(String name, int price, int buildingPrice, int priceHotel, String color, int[] rentPrice) {
        super(name, price, buildingPrice, priceHotel, color, rentPrice);
    }
}
