/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package grp.pkg10;



/**
 *
 * @author saval
 */



public class Grp10 {
    public static void main(String[] args) {
        Game game = new Game();
        game.addPlayer(new HumanPlayer("Fagun Miss"));
        game.addPlayer(new AIPlayer("PARTH (Bot) "));
        game.startGame(5); // Play for 5 rounds
    }
}
