package Tiles.Buyable.tilesHouse;

import Game.Player;
import Tiles.Interface.Tile;

public class House17 extends Tile {
    private String name = "Lyon";
    private int price = 475000;
    private int buildingPrice = 175000;
    private int priceHotel = 225000;
    private int numOfBuildings = 0;
    private String color = "g";
    private int[] rentPrice = {26000, 170000, 340000, 510000, 934000};
    private Player owner;
    private boolean [] playerPosition = {false, false, false ,false};

    public House17(String name, int price, int buildingPrice, int priceHotel, String color, int[] rentPrice) {
        super(name, price, buildingPrice, priceHotel, color, rentPrice);
    }
}
