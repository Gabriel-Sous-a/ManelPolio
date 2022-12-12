package Tiles.Buyable.tilesHouse;

import Game.Player;

public class House19 extends Houses{
    private String name = "Osaka";
    private int price = 525000;
    private int buildingPrice = 200000;
    private int priceHotel = 250000;
    private int numOfBuildings = 0;
    private String color = "db";
    private int[] rentPrice = {35000, 190000, 380000, 570000, 1045000};
    private Player owner;
    private boolean [] playerPosition = {false, false, false ,false};
}
