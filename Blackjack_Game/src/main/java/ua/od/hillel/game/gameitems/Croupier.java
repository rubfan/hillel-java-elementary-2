package ua.od.hillel.game.gameitems;

/**
 * Created by ruslangramatic on 7/9/18.
 */
public interface Сroupier {
    void prepareDeck();
    void giveOutCardsAtStart();
    Card getTopCard();
    void setTable(Table table);
    Table getTable();
}
