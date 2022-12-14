package Tiles.Buyable.tilesHouse;

import Game.Player;
import Tiles.Interface.Tile;

public class House1 extends Tile {
    private String name = "Granada";
    private int price = 50000;
    private int buildingPrice = 25000;
    private int priceHotel = 50000;
    private int numOfBuildings = 0;
    private String color = "br";
    private int[] rentPrice = {2000, 25000, 50000, 75000, 150000};
    private Player owner;
    private boolean [] playerPosition = {false, false, false ,false};


    public House1(String name, int price, int buildingPrice, int priceHotel, String color, int[] rentPrice) {
        super(name, price, buildingPrice, priceHotel, color, rentPrice);
    }
}
