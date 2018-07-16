package ua.od.hillel.game.gameitems;

/**
 * Created by ruslangramatic on 7/9/18.
 */
public interface Card {
    Suit getSuit();
    Rank getRank();
    Color getColor();
    Integer getCost();

    void setSuit(Suit val);
    void setRank(Rank val);
    void setColor(Color val);
    void setCost(Integer val);
}
