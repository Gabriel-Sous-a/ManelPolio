package Tiles.Buyable.tilesHouse;

import Game.Player;

public class House9 extends Houses{
    private String name = "Rome";
    private int price = 275000;
    private int buildingPrice = 75000;
    private int priceHotel = 125000;
    private int numOfBuildings = 0;
    private String color = "p";
    private int[] rentPrice = {12000, 80000, 160000, 240000, 440000};
    private Player owner;
    private boolean [] playerPosition = {false, false, false ,false};
}
