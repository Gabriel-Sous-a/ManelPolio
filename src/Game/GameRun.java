package Game;


import Prints.Board;
import Prints.Double;
import Prints.UI;
import org.w3c.dom.Node;

import java.util.Scanner;

public class GameRun {
    private static final NodeBoard[] nodeList = LL.createMap();
    private static Scanner scan = new Scanner(System.in);
    private static NodeBoard tempNode = nodeList[0];

    public static void run() {
        int counter = 0;
        Player player1 = new Player("ze", "🚚", 1000000,0);
        while (tempNode != null) {
            Board.boardPrint();
            counter += runIndividual(player1);
            System.out.println("counter ->" + counter);
            tempNode = tempNode.next;
            System.out.println(player1.getHousesList());
            System.out.println(player1.getBeachList());
        }

    }

    public static int runIndividual(Player player) {
        UI.ui(player);
        int num1 = Dice.dice1();
        int num2 = Dice.dice1();
        int sum = num1 + num2;
        int counter  = 0;
        System.out.println(sum);
        for (int i = 0; i < sum; i++) {
            tempNode = tempNode.next;
            counter ++;
        }
        System.out.println(tempNode.tile.getName());
        buyChoice(counter, player);
        if (num1 == num2) {
            Double.print();
            Board.boardPrint();
            return runIndividual(player);
        }
        return counter;
    }
    public static boolean buyChoice (int index, Player player) {
        String choice = scan.next();
        if (choice.equals("y")){
            finder(index, player);
            return false;
        }
        if (choice.equals("n")){
            return false;
        }
        System.out.println("Ups try again");
        return buyChoice(index, player);
    }

    public static void finder (int index, Player player) {
        if (nodeList[index].tile.getRentPrice().length > 0 || nodeList[index].tile.getRentPrice().length < 3){
            nodeList[index].tile.setOwner(player);
            nodeList[index].tile.buy(player, nodeList[index].tile);
            player.getBeachList().add(nodeList[index].tile);
            return;
        }
        if (nodeList[index].tile.getRentPrice().length > 0){
            nodeList[index].tile.setOwner(player);
            nodeList[index].tile.buy(player, nodeList[index].tile);
            player.getHousesList().add(nodeList[index].tile);
        }
    }
}
