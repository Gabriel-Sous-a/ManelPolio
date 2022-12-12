package Tiles.Cards;

import Game.Player;

public class Chance { //half done
    private boolean[] playerPosition = {false, false, false, false};

    public int checkPlayerLanding() {
        for (int i = 0; i < playerPosition.length; i++) {
            if (playerPosition[i]) {
                return i + 1;
            }
        }
        return 0;
    }

    public void freeIslandCard (Player[] players) {
        int temp = checkPlayerLanding();
        if (temp > 0){
            players[temp].setCardHolder(true);
        }
    }
}
