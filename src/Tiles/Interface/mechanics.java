package Tiles.Interface;

import Game.Player;

public interface mechanics {
    String name = null;
    int price = 0;
    int buildingPrice = 0;
    int priceHotel = 0;
    int numOfBuildings = 0;
    int[] rentPrice = {0, 0, 0, 0, 0};
    Player owner = null;
    boolean[] playerPosition = {false, false, false, false};
}
