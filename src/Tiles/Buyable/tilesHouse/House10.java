package Tiles.Buyable.tilesHouse;

import Game.Player;
import Tiles.Interface.Tile;

public class House10 extends Tile {
    private String name = "Hamburg";
    private int price = 300000;
    private int buildingPrice = 100000;
    private int priceHotel = 150000;
    private int numOfBuildings = 0;
    private String color = "o";
    private int[] rentPrice = {14000, 85000, 170000, 255000, 468000};
    private Player owner;
    private boolean [] playerPosition = {false, false, false ,false};

    public House10(String name, int price, int buildingPrice, int priceHotel, String color, int[] rentPrice) {
        super(name, price, buildingPrice, priceHotel, color, rentPrice);
    }
}
