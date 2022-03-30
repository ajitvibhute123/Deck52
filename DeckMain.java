package deckOfCards;

public class DeckMain {
    public static void main(String[] args) {
        DeckOfCards card = new DeckOfCards();

        card.cardCreation();
        card.shuffle();
        //card.distribute();
    }
}