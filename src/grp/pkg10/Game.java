package grp.pkg10;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Player> players = new ArrayList<>(); // **Aggregation**: Game "has a" list of players

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void startGame(int rounds) {
        System.out.println("Starting the game with " + rounds + " rounds.");
        for (int i = 1; i <= rounds; i++) {
            System.out.println("\nRound " + i);
            Player winner = playRound();
            System.out.println("Winner of round " + i + ": " + winner.getName());
        }
    }

    private Player playRound() {
        Player winner = null;
        Card highestCard = null;

        for (Player player : players) {
            Card card = player.playCard();
            System.out.println(player.getName() + " played " + card);

            if (highestCard == null || compareCards(card, highestCard) > 0) {
                highestCard = card;
                winner = player;
            }
        }

        return winner;
    }

    private int compareCards(Card card1, Card card2) {
        String[] rankOrder = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        List<String> rankList = List.of(rankOrder);

        int rank1 = rankList.indexOf(card1.getRank());
        int rank2 = rankList.indexOf(card2.getRank());

        return Integer.compare(rank1, rank2);
    }
}
