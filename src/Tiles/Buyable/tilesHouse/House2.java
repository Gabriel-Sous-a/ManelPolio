package Tiles.Buyable.tilesHouse;

import Game.Player;
import Tiles.Interface.Tile;

public class House2 extends Tile {
    private String name = "Seville";
    private int price = 75000;
    private int buildingPrice = 25000;
    private int priceHotel = 50000;
    private int numOfBuildings = 0;
    private String color = "br";
    private int[] rentPrice = {2000, 28000, 55000, 83000, 165000};
    private Player owner;
    private boolean [] playerPosition = {false, false, false ,false};

    public House2(String name, int price, int buildingPrice, int priceHotel, String color, int[] rentPrice) {
        super(name, price, buildingPrice, priceHotel, color, rentPrice);
    }
}
