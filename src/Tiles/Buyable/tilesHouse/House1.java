package Tiles.Buyable.tilesHouse;

import Game.Player;

public class House1 extends Houses {
    private String name = "Granada";
    private int price = 50000;
    private int buildingPrice = 25000;
    private int priceHotel = 50000;
    private int numOfBuildings = 0;
    private String color = "br";
    private int[] rentPrice = {2000, 25000, 50000, 75000, 150000};
    private Player owner;
    private boolean [] playerPosition = {false, false, false ,false};
}
