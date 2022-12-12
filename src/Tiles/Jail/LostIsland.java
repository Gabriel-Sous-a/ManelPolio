package Tiles.Jail;

public class LostIsland {
    private boolean[] playerPosition = {false, false, false, false};
    public int checkPlayerLanding() {
        for (int i = 0; i < playerPosition.length; i++) {
            if (playerPosition[i]) {
                return i + 1;
            }
        }
        return 0;
    }
}
