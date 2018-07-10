package card;

import java.util.List;

public class CardGame {

    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.createDeck();
        deck.shuffleDeck();
        List<Card> myCards= deck.deal(5);
        myCards = deck.orderCardsByRank(myCards);
        System.out.println(myCards);
    }
}
