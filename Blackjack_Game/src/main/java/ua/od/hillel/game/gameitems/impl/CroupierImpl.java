package ua.od.hillel.game.gameitems.impl;

import ua.od.hillel.game.gameitems.*;

/**
 * Created by ruslangramatic on 7/9/18.
 */
public class СroupierImpl implements Сroupier {
    private Table table;
    private Deck deck;

    public СroupierImpl(Table table) {
        this.table = table;
    }

    public void prepareDeck() {
        deck = new DeckImpl();
        deck.shuffle();
    }

    public void giveOutCardsAtStart() {
        for (Player player : table.getListOfPlayers()){
            Card card1 = deck.takeTopCard();
            Card card2 = deck.takeTopCard();
            player.getHand().putCard(card1);
            player.getHand().putCard(card2);
        }
    }

    public Card getTopCard() {
        return deck.takeTopCard();
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public Table getTable() {
        return table;
    }
}
