package Tiles.Buyable.tilesHouse;

import Game.Player;
import Tiles.Interface.Tile;

public class House5 extends Tile {
    private String name = "Beinjing";
    private int price = 175000;
    private int buildingPrice = 50000;
    private int priceHotel = 100000;
    private int numOfBuildings = 0;
    private String color = "lb";
    private int[] rentPrice = {6000, 35000, 75000, 105000, 210000};
    private Player owner;
    private boolean [] playerPosition = {false, false, false ,false};

    public House5(String name, int price, int buildingPrice, int priceHotel, String color, int[] rentPrice) {
        super(name, price, buildingPrice, priceHotel, color, rentPrice);
    }
}
