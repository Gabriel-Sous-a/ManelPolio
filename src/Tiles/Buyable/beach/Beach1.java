package Tiles.Buyable.beach;

import Game.Player;
import Tiles.Interface.Tile;

public class Beach1 extends Tile {
    private String name;
    private int price = 200000;
    private int buildingPrice = 50000;
    private int numOfBuildings = 0;
    private int[] rentPrice = {25000, 50000};
    private Player owner;
    private boolean [] playerPosition = {false, false, false ,false};

    public Beach1(String name, int price, int buildingPrice, int priceHotel, String color, int[] rentPrice) {
        super(name, price, buildingPrice, priceHotel, color, rentPrice);
    }


    @Override
    public void putBuilding(Player player, Tile beach) {
        if (beach.numOfBuildings == 0) {
            player.setMoney(player.getMoney() - buildingPrice);
            beach.numOfBuildings++;
        }
        System.out.println("Limit if houses reached");
    }
    @Override
    public void sell(Player player, Tile beach) {
        if (beach.numOfBuildings == 1) {
            player.setMoney(player.getMoney() + buildingPrice);
        }
        player.setMoney(player.getMoney() + beach.price);
    }
}
