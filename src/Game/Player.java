package Game;
import Tiles.*;
import Tiles.Buyable.beach.Beach;
import Tiles.Buyable.tilesHouse.Houses;

import java.util.ArrayList;

public class Player {
    private String name;
    private String piece;
    private int money = 0;
    private int numProperties = 0;
    private ArrayList<Houses> housesList = new ArrayList();
    private ArrayList<Beach> beachList = new ArrayList();
    private boolean cardHolder = false;




    public Player(String name, String piece, int money, int numProperties) {
        this.name = name;
        this.piece = piece;
        this.money = money;
        this.numProperties = numProperties;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPiece() {
        return piece;
    }

    public void setPiece(String piece) {
        this.piece = piece;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getNumProperties() {
        return numProperties;
    }

    public void setNumProperties(int numProperties) {
        this.numProperties = numProperties;
    }

    public ArrayList<Houses> getHousesList() {
        return housesList;
    }

    public void setHousesList(ArrayList<Houses> housesList) {
        this.housesList = housesList;
    }

    public ArrayList<Beach> getBeachList() {
        return beachList;
    }

    public void setBeachList(ArrayList<Beach> beachList) {
        this.beachList = beachList;
    }

    public boolean isCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(boolean cardHolder) {
        this.cardHolder = cardHolder;
    }
}
