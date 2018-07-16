package ua.od.hillel.game.gameitems;

import org.junit.Before;
import org.junit.Test;
import ua.od.hillel.game.gameitems.impl.DeckImpl;

import static org.junit.Assert.*;

/**
 * Created by ruslangramatic on 7/9/18.
 */
public class DeckTest {
    Deck deck;

    @Before
    public void init() {
        deck = new DeckImpl();
    }

    @Test()
    public void createCardsTest() {
        for (int i = 0; i < Deck.CARDS_NUMBER; i ++) {
            Card card = deck.takeTopCard();
            System.out.println(
                    " color: " + card.getColor() +
                    " cost: " + card.getCost() +
                    " rank: " + card.getRank() +
                    " suit: " + card.getSuit()
            );
            assertNotNull(card);
        }
    }

    @Test()
    public void cardsAreDifferentTest() {
        deck.shuffle();
        Card[] cards = new Card[Deck.CARDS_NUMBER];
        for (int i = 0; i < Deck.CARDS_NUMBER; i ++) {
            Card card = deck.takeTopCard();
            cards[i] = card;
            System.out.println(
                    " color: " + card.getColor() +
                    " cost: " + card.getCost() +
                    " rank: " + card.getRank() +
                    " suit: " + card.getSuit()
            );
        }
        for (int i = 0; i < Deck.CARDS_NUMBER; i ++) {
            for (int j = i + 1; j < Deck.CARDS_NUMBER; j ++) {
                assertFalse(
                        cards[i].getColor().equals(cards[j].getColor()) &&
                                cards[i].getCost().equals(cards[j].getCost()) &&
                                cards[i].getRank().equals(cards[j].getRank()) &&
                                cards[i].getSuit().equals(cards[j].getSuit())
                );
            }
        }
    }
}
