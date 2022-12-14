package Tiles.Buyable.tilesHouse;

import Game.Player;
import Tiles.Interface.Tile;

public class House7 extends Tile {
    private String name = "Venice";
    private int price = 225000;
    private int buildingPrice = 75000;
    private int priceHotel = 125000;
    private int numOfBuildings = 0;
    private String color = "p";
    private int[] rentPrice = {10000, 70000, 140000, 210000, 385000};
    private Player owner;
    private boolean [] playerPosition = {false, false, false ,false};

    public House7(String name, int price, int buildingPrice, int priceHotel, String color, int[] rentPrice) {
        super(name, price, buildingPrice, priceHotel, color, rentPrice);
    }
}
