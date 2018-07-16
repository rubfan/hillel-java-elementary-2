package ua.od.hillel.game.gameitems;

/**
 * Created by ruslangramatic on 7/9/18.
 */
public interface Deck {
    int CARDS_NUMBER = 52;

    Suit[] SUITS = {
        Suit.CLUBS,
        Suit.SPADES,
        Suit.DIAMONDS,
        Suit.HEARTS
    };

    Rank[] RANKS = {
        Rank.Ace,
        Rank.R2,
        Rank.R3,
        Rank.R4,
        Rank.R5,
        Rank.R6,
        Rank.R7,
        Rank.R8,
        Rank.R9,
        Rank.R10,
        Rank.Jack,
        Rank.Queen,
        Rank.King
    };

    void shuffle();
    Card takeTopCard();
}
