package grp.pkg10;

import java.util.ArrayList; // Required for List implementation
import java.util.List;
import java.util.Collections;

public class GroupOfCards {
    private List<Card> cards;

    public GroupOfCards() {
        cards = new ArrayList<>(); // Properly initialize the list
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        for (String suit : suits) {
            for (String rank : ranks) {
                cards.add(new Card(rank, suit)); // Populate deck
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards); // Shuffle the deck
    }

    public Card drawCard() {
        return cards.isEmpty() ? null : cards.remove(0); // Draw a card or return null
    }

    public boolean isEmpty() {
        return cards.isEmpty();
    }
}
