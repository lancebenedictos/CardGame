/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cardgame;

/**
 *
 * @author lancebenedictos
 * January 28, 2022
 */
public class Card {
    public static String[] SUITS = {"heart", "club", "diamond", "spade"};
    private String suit;
    private int value;

    public Card(int value, String suit) {
        this.suit = suit;
        this.value = value;
    }

    public String getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }
    
 

}
