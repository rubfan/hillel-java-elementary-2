package ua.od.hillel.game.gameitems.impl;

import ua.od.hillel.game.gameitems.Card;
import ua.od.hillel.game.gameitems.Color;
import ua.od.hillel.game.gameitems.Rank;
import ua.od.hillel.game.gameitems.Suit;

/**
 * Created by ruslangramatic on 7/9/18.
 */
public class CardImpl implements Card {
    private Suit suit;
    private Rank rank;
    private Color color;
    private Integer cost;

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }
}
