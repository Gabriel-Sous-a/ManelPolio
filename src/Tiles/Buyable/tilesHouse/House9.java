package Tiles.Buyable.tilesHouse;

import Game.Player;
import Tiles.Interface.Tile;

public class House9 extends Tile {
    private String name = "Rome";
    private int price = 275000;
    private int buildingPrice = 75000;
    private int priceHotel = 125000;
    private int numOfBuildings = 0;
    private String color = "p";
    private int[] rentPrice = {12000, 80000, 160000, 240000, 440000};
    private Player owner;
    private boolean [] playerPosition = {false, false, false ,false};

    public House9(String name, int price, int buildingPrice, int priceHotel, String color, int[] rentPrice) {
        super(name, price, buildingPrice, priceHotel, color, rentPrice);
    }
}
