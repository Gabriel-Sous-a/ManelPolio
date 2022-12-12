package Tiles.Buyable.tilesHouse;

import Game.Player;

public class House12 extends Houses{
    private String name = "London";
    private int price = 350000;
    private int buildingPrice = 125000;
    private int priceHotel = 175000;
    private int numOfBuildings = 0;
    private String color = "r";
    private int[] rentPrice = {18000, 113000, 225000, 338000, 619000};
    private Player owner;
    private boolean [] playerPosition = {false, false, false ,false};
}
