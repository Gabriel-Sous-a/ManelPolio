package Tiles.Buyable.tilesHouse;

import Game.Player;

public class House11 extends Houses{
    private String name = "Berlin";
    private int price = 325000;
    private int buildingPrice = 100000;
    private int priceHotel = 150000;
    private int numOfBuildings = 0;
    private String color = "o";
    private int[] rentPrice = {16000, 90000, 180000, 270000, 495000};
    private Player owner;
    private boolean [] playerPosition = {false, false, false ,false};
}
