package Game;

public class Dice {

    public static int dice1 () {
        return (int) (Math.random() * (6 - 1)) + 1;
    }

    public static int dice2 () {
        return (int) (Math.random() * (12 - 2)) + 2;
    }
}
