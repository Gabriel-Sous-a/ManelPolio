package Tiles.Buyable.tilesHouse;

import Game.Player;
import Tiles.Interface.Tile;

public class House13 extends Tile {
    private String name = "Sydney";
    private int price = 375000;
    private int buildingPrice = 125000;
    private int priceHotel = 175000;
    private int numOfBuildings = 0;
    private String color = "r";
    private int[] rentPrice = {20000, 120000, 240000, 360000, 660000};
    private Player owner;
    private boolean [] playerPosition = {false, false, false ,false};

    public House13(String name, int price, int buildingPrice, int priceHotel, String color, int[] rentPrice) {
        super(name, price, buildingPrice, priceHotel, color, rentPrice);
    }
}
