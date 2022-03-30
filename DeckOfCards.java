package deckOfCards;

import java.util.Random;

public class DeckOfCards {
    static String[] Suits = {"Clubs","Diamonds","Hearts","Speades"};
    static String[] Ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
    static String[][] deck = new String[Suits.length][Ranks.length];

    public void cardCreation() {
        for(int i=0;i<Suits.length;i++) {
            for (int j = 0; j < Ranks.length; j++) {
                deck[i][j] = Suits[i]+Ranks[j];
            }
        }
    }

    public void shuffle() {
        Random random = new Random();
        for (int i = 0; i < Suits.length; i++) {
            for (int j = 0; j < Ranks.length; j++) {
                int m = random.nextInt(i+1);
                int n = random.nextInt(j+1);
                String temp = deck[i][j];
                deck[i][j] = deck[m][n];
                deck[m][n] = temp;
            }
        }
}
}
