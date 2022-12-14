package Tiles.Buyable.tilesHouse;

import Game.Player;
import Tiles.Interface.Tile;

public class House11 extends Tile {
    private String name = "Berlin";
    private int price = 325000;
    private int buildingPrice = 100000;
    private int priceHotel = 150000;
    private int numOfBuildings = 0;
    private String color = "o";
    private int[] rentPrice = {16000, 90000, 180000, 270000, 495000};
    private Player owner;
    private boolean [] playerPosition = {false, false, false ,false};

    public House11(String name, int price, int buildingPrice, int priceHotel, String color, int[] rentPrice) {
        super(name, price, buildingPrice, priceHotel, color, rentPrice);
    }
}
