package Tiles.Buyable.tilesHouse;

import Game.Player;

public class House13 extends Houses{
    private String name = "Sydney";
    private int price = 375000;
    private int buildingPrice = 125000;
    private int priceHotel = 175000;
    private int numOfBuildings = 0;
    private String color = "r";
    private int[] rentPrice = {20000, 120000, 240000, 360000, 660000};
    private Player owner;
    private boolean [] playerPosition = {false, false, false ,false};
}
