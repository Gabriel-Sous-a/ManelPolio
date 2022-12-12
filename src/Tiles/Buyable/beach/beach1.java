package Tiles.Buyable.beach;

import Game.Player;

public class beach1 extends Beach {
    private String name;
    private int price = 200000;
    private int buildingPrice = 50000;
    private int numOfBuildings = 0;
    private int[] rentPrice = {25000, 50000};
    private Player owner;
    private boolean [] playerPosition = {false, false, false ,false};
}
