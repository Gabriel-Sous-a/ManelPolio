package Tiles.Buyable.tilesHouse;

import Game.Player;

public class Houses {
    private String name;
    private int price = 0;
    private int buildingPrice = 0;
    private int priceHotel = 0;
    private int numOfBuildings = 0;
    private String color;
    private int rentWNBuilding = 0;
    private int rentW1Building = 0;
    private int rentW2Building = 0;
    private int rentW3Building = 0;
    private int rentWHotel = 0;
    private int[] housesColor = {0, 0, 0, 0, 0, 0, 0, 0};  //not here


    public void buy(Player player, Houses house) {
        player.setMoney(player.getMoney() - house.price);
        player.getHousesList().add(house);
    }

    public void putBuilding(Player player, Houses house) {
        if (house.numOfBuildings <= 4) {
            player.setMoney(player.getMoney() - buildingPrice);
            house.numOfBuildings++;
        }
        if (house.numOfBuildings == 5) {
            house.numOfBuildings++;
            player.setMoney(player.getMoney() - priceHotel);
        }
        System.out.println("Limit if houses reached");
    }

    public void sell(Player player, Houses house) {
        switch (house.numOfBuildings) {
            case 1 -> player.setMoney(player.getMoney() + buildingPrice);
            case 2 -> player.setMoney(player.getMoney() + (buildingPrice * 2));
            case 3 -> player.setMoney(player.getMoney() + (buildingPrice * 3));
            case 4 -> player.setMoney(player.getMoney() + priceHotel);
        }
        player.setMoney(player.getMoney() + house.price);
    }

    public boolean checkColors(Player player, Houses house) {   // not here
        if (house.housesColor[0] == 3 || house.housesColor[1] == 3 || house.housesColor[2] == 3 || house.housesColor[5] == 3) {
            return true;
        }
        return house.housesColor[3] == 2 || house.housesColor[4] == 2 || house.housesColor[6] == 2 || house.housesColor[7] == 2;
    }

    public void checkArray(Player player, Houses house) {   //not here
        for (int i = 0; i < player.getHousesList().size(); i++) {
            switch (player.getHousesList().get(i).color) {
                case "br":
                    house.housesColor[0] += 1;
                case "lb":
                    house.housesColor[1] += 1;
                case "p":
                    house.housesColor[2] += 1;
                case "o":
                    house.housesColor[3] += 1;
                case "r":
                    house.housesColor[4] += 1;
                case "y":
                    house.housesColor[5] += 1;
                case "g":
                    house.housesColor[6] += 1;
                case "db":
                    house.housesColor[7] += 1;
            }
        }
    }

    public void rent(Player player, Player player2, Houses house) {
        switch (house.numOfBuildings) {     //player2 lands on player house
            case 0 -> {
                player.setMoney(player.getMoney() + rentWNBuilding);
                player2.setMoney(player2.getMoney() - rentWNBuilding);
            }
            case 1 -> {
                player.setMoney(player.getMoney() + rentW1Building);
                player2.setMoney(player2.getMoney() - rentW1Building);
            }
            case 2 -> {
                player.setMoney(player.getMoney() + rentW2Building);
                player2.setMoney(player2.getMoney() - rentW2Building);
            }
            case 3 -> {
                player.setMoney(player.getMoney() + rentW3Building);
                player2.setMoney(player2.getMoney() - rentW3Building);
            }
            case 4 -> {
                player.setMoney(player.getMoney() + rentWHotel);
                player2.setMoney(player2.getMoney() - rentWHotel);
            }
        }
    }
}
