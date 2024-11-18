package grp.pkg10;

import java.util.Scanner;

public class HumanPlayer extends Player {
    private Scanner scanner; // **Composition**: HumanPlayer "has a" Scanner object

    public HumanPlayer(String name) {
        super(name);
        scanner = new Scanner(System.in); // Composition
    }

    @Override
    public Card playCard() {
        // User input for card rank and suit
        System.out.println(getName() + ", enter your card rank (e.g., Ace, 2, ..., King): ");
        String rank = scanner.nextLine();
        System.out.println("Enter your card suit (e.g., Hearts, Diamonds, Clubs, Spades): ");
        String suit = scanner.nextLine();
        return new Card(rank, suit);
    }
}
