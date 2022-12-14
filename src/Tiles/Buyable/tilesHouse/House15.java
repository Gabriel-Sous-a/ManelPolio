package Tiles.Buyable.tilesHouse;

import Game.Player;
import Tiles.Interface.Tile;

public class House15 extends Tile {
    private String name = "Las Vegas";
    private int price = 425000;
    private int buildingPrice = 150000;
    private int priceHotel = 200000;
    private int numOfBuildings = 0;
    private String color = "y";
    private int[] rentPrice = {22000, 135000, 270000, 405000, 743000};
    private Player owner;
    private boolean [] playerPosition = {false, false, false ,false};

    public House15(String name, int price, int buildingPrice, int priceHotel, String color, int[] rentPrice) {
        super(name, price, buildingPrice, priceHotel, color, rentPrice);
    }
}
