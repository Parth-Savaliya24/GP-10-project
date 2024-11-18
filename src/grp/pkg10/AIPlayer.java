package grp.pkg10;

import java.util.Random;

public class AIPlayer extends Player {
    public AIPlayer(String name) {
        super(name);
    }

    @Override
    public Card playCard() {
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        Random random = new Random();
        return new Card(ranks[random.nextInt(ranks.length)], suits[random.nextInt(suits.length)]);
    }
}
