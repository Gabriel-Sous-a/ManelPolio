package Tiles.Buyable.tilesHouse;

import Game.Player;

public class House3 extends Houses {
    private String name = "Madrid";
    private int price = 100000;
    private int buildingPrice = 25000;
    private int priceHotel = 50000;
    private int numOfBuildings = 0;
    private String color = "br";
    private int[] rentPrice = {4000, 30000, 60000, 90000, 180000};
    private Player owner;
    private boolean[] playerPosition = {false, false, false, false};
}
