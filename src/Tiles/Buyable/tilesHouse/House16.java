package Tiles.Buyable.tilesHouse;

import Game.Player;
import Tiles.Interface.Tile;

public class House16 extends Tile {
    private String name = "New York";
    private int price = 450000;
    private int buildingPrice = 150000;
    private int priceHotel = 200000;
    private int numOfBuildings = 0;
    private String color = "y";
    private int[] rentPrice = {24000, 143000, 285000, 428000, 784000};
    private Player owner;
    private boolean [] playerPosition = {false, false, false ,false};

    public House16(String name, int price, int buildingPrice, int priceHotel, String color, int[] rentPrice) {
        super(name, price, buildingPrice, priceHotel, color, rentPrice);
    }
}
