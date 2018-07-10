package card;

import java.util.List;

public class Hand {

    private List<Card> cards;

    public Hand(List<Card> cards) {
        this.cards = cards;
    }

    public List<Card> getCards() {
        return cards;
    }

    public int valueInHand() {
        int sum = 0;
        for (Card card: cards){
            sum += card.getValue();
        }
        if(sum > 21){
            int count = 0;
            for (Card card: cards){
                if(card.getRank() == Rank.ACE) {
                    count++;
                }
            }
            while(count > 0 && sum > 21) {
                sum -= 10;
                count--;
            }
        }
        return sum;
    }
}
