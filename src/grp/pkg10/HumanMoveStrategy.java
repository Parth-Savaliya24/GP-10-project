/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grp.pkg10;

/**
 *
 * @author saval
 */
import java.util.Scanner;

public class HumanMoveStrategy implements MoveStrategy {
    private Scanner scanner;

    public HumanMoveStrategy() {
        scanner = new Scanner(System.in);
    }

    @Override
    public void makeMove(String playerName) {
        System.out.println(playerName + ", enter your move:");
        String move = scanner.nextLine();
        System.out.println(playerName + " chose: " + move);
    }
}