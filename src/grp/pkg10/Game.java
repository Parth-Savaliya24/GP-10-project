package grp.pkg10;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Player> players;

    public Game() {
        players = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void startGame(int rounds) {
        for (int round = 1; round <= rounds; round++) {
            System.out.println("Round " + round);
            for (Player player : players) {
                player.makeMove();
            }
        }
    }
}