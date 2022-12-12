package Tiles.Buyable.tilesHouse;

import Game.Player;

public class House2 extends Houses {
    private String name = "Seville";
    private int price = 75000;
    private int buildingPrice = 25000;
    private int priceHotel = 50000;
    private int numOfBuildings = 0;
    private String color = "br";
    private int[] rentPrice = {2000, 28000, 55000, 83000, 165000};
    private Player owner;
    private boolean [] playerPosition = {false, false, false ,false};
}
