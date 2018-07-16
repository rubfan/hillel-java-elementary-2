package ua.od.hillel.game.gameitems.impl;

import ua.od.hillel.game.gameitems.Card;
import ua.od.hillel.game.gameitems.Hand;

/**
 * Created by ruslangramatic on 7/9/18.
 */
public class HandImpl implements Hand {
    private Card[] cards;

    public HandImpl() {
        this.cards = new Card[0];
    }

    public int calculateSum() {
        int sum = 0;
        for (Card card : cards) {
            sum += card.getCost();
        }
        return sum;
    }

    public Card[] checkCards() {
        return cards;
    }

    public void putCard(Card card) {
        Card[] updatedCards = new Card[cards.length + 1];
        System.arraycopy(cards, 0, updatedCards, 0, cards.length);
        updatedCards[cards.length] = card;
        cards = updatedCards;
    }
}
