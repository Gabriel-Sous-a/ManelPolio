package Game;

import Tiles.Buyable.beach.Beach1;
import Tiles.Buyable.beach.Beach2;
import Tiles.Buyable.beach.Beach3;
import Tiles.Buyable.beach.Beach4;
import Tiles.Buyable.tilesHouse.*;
import Tiles.Cards.Chance;
import Tiles.Jail.LostIsland;
import Tiles.Special.Start;
import Tiles.Special.WorldCup;
import Tiles.Special.WorldTour;
import Tiles.Tax.IncomeTax;

public class LL {

    public static NodeBoard[] createMap() {
        NodeBoard tile1 = new NodeBoard(new Start("Start", 0, 0, 0, " ", new int[]{}));
        NodeBoard tile2 = new NodeBoard(new House1("Granada", 50000, 25000, 50000, "br", new int[]{2000, 25000, 50000, 75000, 150000}));
        tile1.setNext(tile2);
        NodeBoard tile3 = new NodeBoard(new House2("Seville", 75000, 50000, 0, "br", new int[]{2000, 28000, 55000, 83000, 165000}));
        tile2.setNext(tile3);
        NodeBoard tile4 = new NodeBoard(new House3("Madrid", 100000, 25000, 50000, "br", new int[]{4000, 30000, 60000, 90000, 180000}));
        tile3.setNext(tile4);
        NodeBoard tile5 = new NodeBoard(new Beach1("Bali", 200000, 50000, 0, " ", new int[]{25000, 50000}));
        tile4.setNext(tile5);
        NodeBoard tile6 = new NodeBoard(new House4("Hong Kong", 150000, 50000, 100000, "lb", new int[]{6000, 33000, 65000, 98000, 195000}));
        tile5.setNext(tile6);
        NodeBoard tile7 = new NodeBoard(new House5("Beinjing", 175000, 50000, 100000, "lb", new int[]{6000, 35000, 75000, 105000, 210000}));
        tile6.setNext(tile7);
        NodeBoard tile8 = new NodeBoard(new House6("Shangai", 200000, 50000, 100000, "lb", new int[]{8000, 38000, 75000, 113000, 225000}));
        tile7.setNext(tile8);
        NodeBoard tile9 = new NodeBoard(new LostIsland("Lost Island", 0, 0, 0, " ", new int[]{}));
        tile8.setNext(tile9);
        NodeBoard tile10 = new NodeBoard(new House7("Venice", 225000, 75000, 125000, "p", new int[]{10000, 70000, 140000, 210000, 385000}));
        tile9.setNext(tile10);
        NodeBoard tile11 = new NodeBoard(new House8("Milan", 250000, 75000, 125000, "p", new int[]{10000, 75000, 150000, 225000, 413000}));
        tile10.setNext(tile11);
        NodeBoard tile12 = new NodeBoard(new House9("Rome", 275000, 75000, 125000, "p", new int[]{12000, 80000, 160000, 240000, 440000}));
        tile11.setNext(tile12);
        NodeBoard tile13 = new NodeBoard(new Chance("Chance", 0, 0, 0, " ", new int[]{}));
        tile12.setNext(tile13);
        NodeBoard tile14 = new NodeBoard(new House10("Hamburg", 300000, 100000, 150000, "o", new int[]{14000, 85000, 170000, 255000, 468000}));
        tile13.setNext(tile14);
        NodeBoard tile15 = new NodeBoard(new Beach2("Cyprus", 200000, 50000, 0, " ", new int[]{25000, 50000}));
        tile14.setNext(tile15);
        NodeBoard tile16 = new NodeBoard(new House11("Berlin", 325000, 100000, 150000, "o", new int[]{16000, 90000, 180000, 270000, 495000}));
        tile15.setNext(tile16);
        NodeBoard tile17 = new NodeBoard(new WorldCup("World Cup", 0, 0, 0, " ", new int[]{}));
        tile16.setNext(tile17);
        NodeBoard tile18 = new NodeBoard(new House12("London", 350000, 125000, 175000, "r", new int[] {18000, 113000, 225000, 338000, 619000}));
        tile17.setNext(tile18);
        NodeBoard tile19 = new NodeBoard(new Beach3("Dubai", 200000, 50000, 0, " ", new int[]{25000, 50000}));
        tile18.setNext(tile19);
        NodeBoard tile20 = new NodeBoard(new House13("Sydney", 375000, 125000, 175000, "r", new int[] {20000, 120000, 240000, 360000, 660000}));
        tile19.setNext(tile20);
        NodeBoard tile21 = new NodeBoard(new Chance("Chance", 0, 0, 0, " ", new int[]{}));
        tile20.setNext(tile21);
        NodeBoard tile22 = new NodeBoard(new House14("Chicago", 400000, 150000, 200000, "y", new int[] {22000, 128000, 255000, 383000, 701000}));
        tile21.setNext(tile22);
        NodeBoard tile23 = new NodeBoard(new House15("Las Vegas", 425000, 150000, 200000, "y", new int[] {22000, 135000, 270000, 405000, 743000}));
        tile22.setNext(tile23);
        NodeBoard tile24 = new NodeBoard(new House16("New York", 450000, 150000, 200000, "y", new int[] {24000, 143000, 285000, 428000, 784000}));
        tile23.setNext(tile24);
        NodeBoard tile25 = new NodeBoard(new WorldTour("World Tour", 0, 0, 0, " ", new int[]{}));
        tile24.setNext(tile25);
        NodeBoard tile26 = new NodeBoard(new Beach4("Nice", 200000, 50000, 0, " ", new int[]{25000, 50000}));
        tile25.setNext(tile26);
        NodeBoard tile27 = new NodeBoard(new House17("Lyon", 475000, 175000, 225000, "g", new int[] {26000, 170000, 340000, 510000, 934000}));
        tile26.setNext(tile27);
        NodeBoard tile28 = new NodeBoard(new House18("Paris", 500000, 175000, 225000, "g", new int[] {28000, 180000, 360000, 540000, 990000}));
        tile27.setNext(tile28);
        NodeBoard tile29 = new NodeBoard(new Chance("Chance", 0, 0, 0, " ", new int[]{}));
        tile28.setNext(tile29);
        NodeBoard tile30 = new NodeBoard(new House19("Osaka", 525000, 200000, 250000, "db", new int[] {35000, 190000, 380000, 570000, 1045000}));
        tile29.setNext(tile30);
        NodeBoard tile31 = new NodeBoard(new IncomeTax("Income Tax", 0, 0, 0, " ", new int[]{}));
        tile30.setNext(tile31);
        NodeBoard tile32 = new NodeBoard(new House20("Tokyo", 550000, 200000, 250000, "db", new int[] {50000, 200000, 400000, 600000, 1100000}));
        tile31.setNext(tile32);
        tile32.setNext(tile1);
        return new NodeBoard[]{tile1, tile2, tile3, tile4, tile5, tile6, tile7, tile8, tile9, tile10, tile11, tile12, tile13, tile14, tile15, tile16, tile17, tile18, tile19,
                tile20, tile21, tile22, tile23, tile24, tile25, tile26, tile27, tile28, tile29, tile30, tile31, tile32};
    }

}
