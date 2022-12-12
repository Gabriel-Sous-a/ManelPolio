package Tiles.Buyable.tilesHouse;

import Game.Player;

public class House18 extends Houses{
    private String name = "Paris";
    private int price = 500000;
    private int buildingPrice = 175000;
    private int priceHotel = 225000;
    private int numOfBuildings = 0;
    private String color = "g";
    private int[] rentPrice = {28000, 180000, 360000, 540000, 990000};
    private Player owner;
    private boolean [] playerPosition = {false, false, false ,false};
}
