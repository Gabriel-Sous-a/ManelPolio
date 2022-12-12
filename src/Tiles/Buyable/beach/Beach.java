package Tiles.Buyable.beach;
import Game.Player;

public class Beach {
    private String name;
    private int price = 0;
    private int buildingPrice = 0;
    private int numOfBuildings = 0;
    private int[] rentPrice = {0, 0};
    private Player owner;
    private boolean [] playerPosition = {false, false, false ,false};

    public void buy(Player player, Beach beach) {
        player.setMoney(player.getMoney() - beach.price);
        player.getBeachList().add(beach);
    }

    public void putBuilding(Player player, Beach beach) {
        if (beach.numOfBuildings == 0) {
            player.setMoney(player.getMoney() - buildingPrice);
            beach.numOfBuildings++;
        }
        System.out.println("Limit if houses reached");
    }

    public void sell(Player player, Beach beach) {
        if (beach.numOfBuildings == 1) {
            player.setMoney(player.getMoney() + buildingPrice);
        }
        player.setMoney(player.getMoney() + beach.price);
    }
}
