/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grp.pkg10;

/**
 *
 * @author saval
 */
public class AIMoveStrategy implements MoveStrategy {

    @Override
    public void makeMove(String playerName) {
        System.out.println(playerName + " (AI) makes a random move.");
    }
}