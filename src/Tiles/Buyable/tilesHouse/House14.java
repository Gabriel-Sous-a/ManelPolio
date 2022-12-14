package Tiles.Buyable.tilesHouse;

import Game.Player;
import Tiles.Interface.Tile;

public class House14 extends Tile {
    private String name = "Chicago";
    private int price = 400000;
    private int buildingPrice = 150000;
    private int priceHotel = 200000;
    private int numOfBuildings = 0;
    private String color = "y";
    private int[] rentPrice = {22000, 128000, 255000, 383000, 701000};
    private Player owner;
    private boolean [] playerPosition = {false, false, false ,false};

    public House14(String name, int price, int buildingPrice, int priceHotel, String color, int[] rentPrice) {
        super(name, price, buildingPrice, priceHotel, color, rentPrice);
    }
}
