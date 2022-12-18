package Game;


import Prints.Board;
import Prints.Double;
import Prints.*;

import java.util.Scanner;

public class GameRun {
    private static final NodeBoard[] nodeList = LL.createMap();
    private static Scanner scan = new Scanner(System.in);
    private static NodeBoard tempNode = nodeList[0];
    private static int totalPlayer1 = 0;
    private static int counter1 = 0;
    private static int totalPlayer2 = 0;
    private static int counter2 = 0;
    private static int totalPlayer3 = 0;
    private static int counter3 = 0;
    private static int totalPlayer4 = 0;
    private static int counter4 = 0;
    private static int totalPlayerAI2 = 0;
    private static int counterAI2 = 0;
    private static int totalPlayerAI3 = 0;
    private static int counterAI3 = 0;
    private static int totalPlayerAI4 = 0;
    private static int counterAI4 = 0;
    private static boolean temp = true;
    private static Player player1 = new Player("p1", "🚚", 1000000, 0);
    private static Player player2 = new Player("p2", "🚜", 1000000, 0);
    private static Player player3 = new Player("p3", "🚔", 1000000, 0);
    private static Player player4 = new Player("p4", "🛺", 1000000, 0);
    private static Player playerAI2 = new Player("p2BOT", "🚀", 1000000, 0);
    private static Player playerAI3 = new Player("p3BOT", "🚁", 1000000, 0);
    private static Player playerAI4 = new Player("p4BOT", "⚓️", 1000000, 0);

    public static boolean menu () {
        Name.name();
        System.out.println("Do you want to play with 1 or 4 player?");
        System.out.println("Press " + Color.RED +"1"+ Color.RESET + " to 1 player or "+ Color.RED +"4"+ Color.RESET +" to 4 players");
        stringVerification();
        System.out.println("Play again?");
        System.out.println("Press "+ Color.RED +"y"+ Color.RESET +" to play again or " + Color.RED +"n"+ Color.RESET+" to leave");
        stringVerification2();
        return false;
    }

    public static void runTest() {
        System.out.println("player 1 name");
        player1.setName(scan.next());
        while (tempNode != null) {
            if (!verification(totalPlayer1, player1)) {
                totalPlayer1 = runIndividual(player1, totalPlayer1, counter1);
                System.out.println("Location ->" + totalPlayer1);
            }
            if (verification(totalPlayer1, player1)){
                break;
            }

            tempNode = tempNode.next;
        }
    }

    public static void run() {
        System.out.println("player 1 name");
        player1.setName(scan.next());
        while (tempNode != null) {
            if (!verification(totalPlayer1, player1)) {
                totalPlayer1 = runIndividual(player1, totalPlayer1, counter1);
                System.out.println("total ->" + totalPlayer1);
            }
            if (verification(totalPlayer1, player1)){
                break;
            }
            if (!verification(totalPlayerAI2, playerAI2)) {
                totalPlayer1 = runIndividualAI(playerAI2, totalPlayerAI2, counterAI2);
                System.out.println("total ->" + totalPlayerAI2);
            }
            if (!verification(totalPlayerAI3, playerAI3)) {
                totalPlayer1 = runIndividualAI(playerAI3, totalPlayerAI3, counterAI3);
                System.out.println("total ->" + totalPlayerAI3);
            }
            if (!verification(totalPlayerAI4, playerAI4)) {
                totalPlayer1 = runIndividualAI(playerAI4, totalPlayerAI4, counterAI4);
                System.out.println("total ->" + totalPlayerAI4);
            }
            tempNode = tempNode.next;
            if (verification(totalPlayer1, player1) && verification(totalPlayerAI2, playerAI2) && verification(totalPlayerAI3, playerAI3) && verification(totalPlayerAI4, playerAI4)) {
                break;
            }
        }
    }

    public static void run4Pl() {
        System.out.println("player 1 name");
        player1.setName(scan.next());
        System.out.println("player 2 name");
        player2.setName(scan.next());
        System.out.println("player 3 name");
        player3.setName(scan.next());
        System.out.println("player 4 name");
        player4.setName(scan.next());
        while (tempNode != null) {
            if (!verification(totalPlayer1, player1)) {
                totalPlayer1 = runIndividual(player1, totalPlayer1, counter1);
                System.out.println("Location ->" + totalPlayer1);
            }
            if (!verification(totalPlayer2, player2)) {
                totalPlayer1 = runIndividual(player2, totalPlayer2, counter2);
                System.out.println("Location ->" + totalPlayer2);
            }
            if (!verification(totalPlayer3, player3)) {
                totalPlayer1 = runIndividual(player3, totalPlayer3, counter3);
                System.out.println("Location ->" + totalPlayer3);
            }
            if (!verification(totalPlayer4, player4)) {
                totalPlayer1 = runIndividual(player4, totalPlayer4, counter4);
                System.out.println("Location ->" + totalPlayer4);
            }
            tempNode = tempNode.next;
            if (verification(totalPlayer1, player1) && verification(totalPlayer2, player2) && verification(totalPlayer3, player3) && verification(totalPlayer4, player4)) {
                break;
            }
        }
    }

    public static int runIndividualAI(Player player, int total, int counter) {
        if (verificationPrison(total, player) || temp) {
            Board.boardPrint();
            UI.ui(player);
            int num1 = Dice.dice1();    //temporary
            int num2 = Dice.dice1();    //temporary
            int sum = num1 + num2;
            sum = verificationWorldTour(sum, player);
            total += sum;
            for (int i = 0; i < sum; i++) {
                tempNode = tempNode.next;
            }
            total = startMoney(total, player, total);
            System.out.println("Price -> " + nodeList[total].tile.price);
            System.out.println("total ->" + total);
            verificationTax(total, player);
            verificationWorldCup(total, player);
            verificationChance(total, player);
            if (nodeList[total].tile.getOwner() == player) {
                playerBuilding(total, player);
            } else if (nodeList[total].tile.getOwner() != player && nodeList[total].tile.getOwner() != null) {
                nodeList[total].tile.rent(nodeList[total].tile.getOwner(), player, nodeList[total].tile);
            } else {
                buyChoiceAI(total, player);
            }
            if (num1 == num2) {
                System.out.println("total ->" + total);
                Double.print();
                Board.boardPrint();
                for (int i = 0; i < 15; i++) {
                    System.out.println();
                }
                return runIndividual(player, total, counter);
            }
            temp = false;
            return total;
        }
        return total;
    }

    public static int runIndividual(Player player, int total, int counter) {
        if (verificationPrison(total, player) || temp) {
            Board.boardPrint();
            UI.ui(player);
            int num1 = Dice.dice1();    //temporary
            int num2 = Dice.dice1();    //temporary
            int sum = num1 + num2;
            sum = verificationWorldTour(sum, player);
            total += sum;
            for (int i = 0; i < sum; i++) {
                tempNode = tempNode.next;
            }
            total = startMoney(total, player, total);
            System.out.println("Price -> " + nodeList[total].tile.price);
            System.out.println("total ->" + total);
            verificationTax(total, player);
            verificationWorldCup(total, player);
            verificationChance(total, player);
            if (nodeList[total].tile.getOwner() == player) {
                playerBuilding(total, player);
            } else if (nodeList[total].tile.getOwner() != player && nodeList[total].tile.getOwner() != null) {
                nodeList[total].tile.rent(nodeList[total].tile.getOwner(), player, nodeList[total].tile);
            } else {
                buyChoice(total, player);
            }
            if (num1 == num2) {
                System.out.println("total ->" + total);
                Double.print();
                Board.boardPrint();
                for (int i = 0; i < 15; i++) {
                    System.out.println();
                }
                return runIndividual(player, total, counter);
            }
            temp = false;
            return total;
        }
        return total;
    }

    public static boolean buyChoice(int index, Player player) {
        System.out.println("Do you want to buy it?");
        System.out.println("Press "+ Color.RED +"y"+ Color.RESET +" to buy it or " + Color.RED +"n"+ Color.RESET+" to skip");
        String choice = scan.next();
        if (choice.equals("y") && nodeList[index].tile.price < player.getMoney()) {
            finder(index, player);
            return false;
        }
        if (choice.equals("n")) {
            return false;
        }
        System.out.println("Ups try again");
        return buyChoice(index, player);
    }

    public static boolean buyChoiceAI(int index, Player player) {
        int rand = (int) (Math.random() * (2 - 1)) + 1;
        if (rand == 1 && nodeList[index].tile.price < player.getMoney()) {
            finder(index, player);
            return false;
        }
        if (rand == 0) {
            return false;
        }
        System.out.println("Ups try again");
        return buyChoiceAI(index, player);
    }

    public static void finder(int index, Player player) {
        //if (nodeList[index].tile.price > 0) {
        if (nodeList[index].tile.price == 200000) {
            nodeList[index].tile.setOwner(player);
            System.out.println(Color.RED_BACKGROUND_BRIGHT + nodeList[index].tile.getOwner().getName() + Color.RESET);
            nodeList[index].tile.buy(player, nodeList[index].tile);
            player.getBeachList().add(nodeList[index].tile);
            return;
        }
        if (nodeList[index].tile.price > 1 && nodeList[index].tile.price != 200000) {
            nodeList[index].tile.setOwner(player);
            System.out.println(Color.RED_BACKGROUND_BRIGHT + nodeList[index].tile.getOwner().getName() + Color.RESET);
            nodeList[index].tile.buy(player, nodeList[index].tile);
            player.getHousesList().add(nodeList[index].tile);
            return;
        }
        //}
        System.out.println(Color.RED_BACKGROUND_BRIGHT + "can't buy" + Color.RESET);
    }

    public static int startMoney(int total, Player player, int index) {
        if (total >= 32) {
            player.setMoney(player.getMoney() + 200000);
            return total = total - 32;
        }
        return total;
    }

    public static void playerBuilding(int index, Player player) {
        if (nodeList[index].tile.getOwner() == player) {
            System.out.println(nodeList[index].tile.numOfBuildings);
            nodeList[index].tile.putBuilding(player, nodeList[index].tile);
            return;
        }
    }

    public static boolean verificationPrison(int index, Player player) {
        if (player.getName().equals(player1.getName())) {
            counter1++;
            if (player.isCardHolder()){
                return true;
            }
            if (counter1 >= 3) {
                return true;
            }
        }
        if (player.getName().equals(player2.getName())) {
            counter2++;
            if (counter2 >= 3) {
                return true;
            }
        }
        if (player.getName().equals(player3.getName())) {
            counter3++;
            if (counter3 >= 3) {
                return true;
            }
        }
        if (player.getName().equals(player4.getName())) {
            counter4++;
            if (counter4 >= 3) {
                return true;
            }
        }
        return nodeList[index] != nodeList[8];
    }

    public static void verificationWorldCup(int index, Player player) {
        if (nodeList[index] == nodeList[24]) {
            System.out.println("what tile do you want to raise price?");
            int num = scan.nextInt();
            nodeList[num].tile.setPrice(nodeList[num].tile.price * 2);
        }
    }

    public static int verificationWorldTour(int index, Player player) {
        if (nodeList[index] == nodeList[24]) {
            System.out.println("what tile do you want to go?");
            return scan.nextInt();
        }
        return index;

    }

    public static void verificationTax(int index, Player player) {
        if (nodeList[index] == nodeList[30]) {
            player.setMoney(player.getMoney() - 200000);
        }
    }

    public static void verificationChance(int index, Player player) {
        if (nodeList[index] == nodeList[12] || nodeList[index] == nodeList[18] || nodeList[index] == nodeList[28]) {
            int rand = (int) (Math.random() * (10 - 1)) + 1;
            if (rand == 1) {
                player.setCardHolder(true);
            }
        }
    }

    public static boolean verification(int index, Player player) {
        if (player.getMoney() <= 0 && player.getBeachList().size() == 0 && player.getHousesList().size() == 0) {
            System.out.println("you lost " + player.getName());
            return true;
        }
        if (player.getMoney() <= 0 && player.getHousesList().size() > 0){
            for (int i = 0; i < player.getHousesList().size(); i++) {
                nodeList[index].tile.sell(player, player.getHousesList().get(i));
            }
        } else if (player.getMoney() <= 0 && player.getBeachList().size() > 0) {
            for (int i = 0; i < player.getHousesList().size(); i++) {
                nodeList[index].tile.sell(player, player.getBeachList().get(i));
            }
        }
        if (player.getMoney() > 0){
            return false;
        }
        return verification(index, player);
    }


    public static boolean stringVerification() {
        String choice = scan.next();
        if (choice.equals("1") ) {
            run();
            return false;
        }
        if (choice.equals("4")) {
            run4Pl();
            return false;
        }
        if (choice.equals("test")){
            System.out.println("Loading test");
            Bar.run();
            runTest();
        }
        System.out.println("Ups try again");
        return stringVerification();
    }
    public static boolean stringVerification2() {
        String choice = scan.next();
        if (choice.equals("y") ) {
            return menu();
        }
        if (choice.equals("n")) {
            System.out.println("bye");
            return false;
        }
        System.out.println("Ups try again");
        return stringVerification2();
    }
}
