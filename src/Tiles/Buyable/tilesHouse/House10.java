package Tiles.Buyable.tilesHouse;

import Game.Player;

public class House10 extends Houses{
    private String name = "Hamburg";
    private int price = 300000;
    private int buildingPrice = 100000;
    private int priceHotel = 150000;
    private int numOfBuildings = 0;
    private String color = "o";
    private int[] rentPrice = {14000, 85000, 170000, 255000, 468000};
    private Player owner;
    private boolean [] playerPosition = {false, false, false ,false};
}
