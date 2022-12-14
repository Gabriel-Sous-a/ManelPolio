package Tiles.Buyable.tilesHouse;

import Game.Player;
import Tiles.Interface.Tile;

public class House8 extends Tile {
    private String name = "Milan";
    private int price = 250000;
    private int buildingPrice = 75000;
    private int priceHotel = 125000;
    private int numOfBuildings = 0;
    private String color = "p";
    private int[] rentPrice = {10000, 75000, 150000, 225000, 413000};
    private Player owner;
    private boolean [] playerPosition = {false, false, false ,false};

    public House8(String name, int price, int buildingPrice, int priceHotel, String color, int[] rentPrice) {
        super(name, price, buildingPrice, priceHotel, color, rentPrice);
    }
}
