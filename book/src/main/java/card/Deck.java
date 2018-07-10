package card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    private List<Card> deck;

    public void createDeck(){
        deck = new ArrayList<>();
        for (Suit s: Suit.values()){
            for(Rank r: Rank.values()){
                deck.add(new Card(s, r));
            }
        }
    }

    public void shuffleDeck(){
        Collections.shuffle(deck);
    }

    public List<Card> deal(int number) {
        if(number > 0 && number <= deck.size()) {
            List<Card> dealt = new ArrayList<>();
            for (int i = 0; i < number; i++) {
                dealt.add(deck.remove(0));
            }
            return dealt;
        }
        return null;
    }

    public List<Card> orderCardsByRank(List<Card> cards) {
        List<Card> ordered = new ArrayList<>(cards);

        for(int i = 0; i < ordered.size() - 1; i++){
            for(int j = i + 1; j < ordered.size(); j++) {
                if(ordered.get(j).getRank().ordinal() < ordered.get(i).getRank().ordinal()){
                    Card card = ordered.get(i);
                    ordered.set(i, ordered.get(j));
                    ordered.set(j, card);
//                    Card card = ordered.remove(i);
//                    ordered.add(i, ordered.remove(j-1));
//                    ordered.add(j, card);
                }
            }
        }
        return ordered;
    }
}
