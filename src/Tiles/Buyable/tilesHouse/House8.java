package Tiles.Buyable.tilesHouse;

import Game.Player;

public class House8 extends Houses{
    private String name = "Milan";
    private int price = 250000;
    private int buildingPrice = 75000;
    private int priceHotel = 125000;
    private int numOfBuildings = 0;
    private String color = "p";
    private int[] rentPrice = {10000, 75000, 150000, 225000, 413000};
    private Player owner;
    private boolean [] playerPosition = {false, false, false ,false};
}
