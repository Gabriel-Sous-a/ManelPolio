package Game;

import Tiles.Interface.Tile;
import Tiles.Interface.Tile2;

public class NodeBoard {
    protected boolean player1 = false;
    protected boolean player2 = false;
    protected boolean player3 = false;
    protected boolean player4 = false;
    protected Tile tile = null;
    protected NodeBoard next;

    public NodeBoard() {
    }

    public NodeBoard(Tile tile) {
        this.tile = tile;
    }

    public static void square(String output) {
        System.out.println("-----\n" +
                "| " + output + " |\n" +
                "-----");

        //((Chance) tile).
    }

    public Tile getTile() {
        return tile;
    }

    public NodeBoard getNext() {
        return next;
    }

    public void setNext(NodeBoard next) {
        this.next = next;
    }

    public void setPlayer1(boolean player1) {
        this.player1 = player1;
    }

    public void setPlayer2(boolean player2) {
        this.player2 = player2;
    }

    public void setPlayer3(boolean player3) {
        this.player3 = player3;
    }

    public void setPlayer4(boolean player4) {
        this.player4 = player4;
    }
}
