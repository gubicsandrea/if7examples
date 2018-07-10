package card;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class HandTest {

    @Test(expected = NullPointerException.class)
    public void testValueInHandForNull(){
        Hand hand = new Hand(null);

        int sum = hand.valueInHand();
    }

    @Test
    public void testValueInHandForEmptyList(){
        Hand hand = new Hand(Collections.emptyList());

        int sum = hand.valueInHand();

        assertThat(sum, is(0));
    }

    @Test
    public void testValueInHandForTwoCards(){
        List<Card> cards = new ArrayList<>(Arrays.asList(
            new Card(Suit.CLUB, Rank.EIGHT),
            new Card(Suit.CLUB, Rank.JACK)
        ));
        Hand hand = new Hand(cards);

        int sum = hand.valueInHand();

        assertThat(sum, is(18));
    }

    @Test
    public void testValueInHandForTwoCardsWithAce(){
        List<Card> cards = new ArrayList<>(Arrays.asList(
                new Card(Suit.CLUB, Rank.EIGHT),
                new Card(Suit.CLUB, Rank.ACE)
        ));
        Hand hand = new Hand(cards);

        int sum = hand.valueInHand();

        assertThat(sum, is(19));
    }

    @Test
    public void testValueInHandForTwoCardsWithAceMoreThan21(){
        List<Card> cards = new ArrayList<>(Arrays.asList(
                new Card(Suit.CLUB, Rank.EIGHT),
                new Card(Suit.SPADE, Rank.FIVE),
                new Card(Suit.CLUB, Rank.ACE)
        ));
        Hand hand = new Hand(cards);

        int sum = hand.valueInHand();

        assertThat(sum, is(14));
    }

    @Test
    public void testValueInHandForCardsWithTwoAces(){
        List<Card> cards = new ArrayList<>(Arrays.asList(
                new Card(Suit.CLUB, Rank.FIVE),
                new Card(Suit.SPADE, Rank.ACE),
                new Card(Suit.CLUB, Rank.ACE)
        ));
        Hand hand = new Hand(cards);

        int sum = hand.valueInHand();

        assertThat(sum, is(17));
    }

    @Test
    public void testValueInHandForCardsWithTwoAcesBothReduced(){
        List<Card> cards = new ArrayList<>(Arrays.asList(
                new Card(Suit.CLUB, Rank.FIVE),
                new Card(Suit.DIAMOND, Rank.JACK),
                new Card(Suit.SPADE, Rank.ACE),
                new Card(Suit.CLUB, Rank.ACE)
        ));
        Hand hand = new Hand(cards);

        int sum = hand.valueInHand();

        assertThat(sum, is(17));
    }
}
