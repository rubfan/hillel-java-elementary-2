package ua.od.hillel.game.gameitems;

/**
 * Created by ruslangramatic on 7/9/18.
 */
public interface Hand {
    int calculateSum();
    Card[] checkCards();
    void putCard(Card card);
}
