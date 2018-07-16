package ua.od.hillel.game.gameitems.impl;

import ua.od.hillel.game.gameitems.Card;
import ua.od.hillel.game.gameitems.Deck;

/**
 * Created by ruslangramatic on 7/9/18.
 */
public class DeckImpl implements Deck {
    private Card[] cards;
    private int topCardIndex;

    public DeckImpl() {
        create();
    }

    private void create() {
        topCardIndex = Deck.CARDS_NUMBER;
        cards = new Card[Deck.CARDS_NUMBER];
        for (int s = 0; s < Deck.SUITS.length; s++) {
            for (int r = 0; r < Deck.RANKS.length; r++) {
                Card card = new CardImpl();
                card.setSuit(SUITS[s]);
                card.setRank(RANKS[r]);
                card.setColor(SUITS[s].getColor());
                card.setCost(RANKS[r].getCost());
                cards[s * Deck.RANKS.length + r] = card;
            }
        }
    }

    public void shuffle() {
        topCardIndex = Deck.CARDS_NUMBER;
        for (int i = 0; i < Deck.CARDS_NUMBER; i++) {
            int randIndex = (int) Math.floor(Math.random() * Deck.CARDS_NUMBER);
            Card tempCard = cards[i];
            cards[i] = cards[randIndex];
            cards[randIndex] = tempCard;
        }
    }

    public Card takeTopCard() {
        return cards[--topCardIndex];
    }
}
