package ua.od.hillel.game.gameitems;

/**
 * Created by ruslangramatic on 7/9/18.
 */
public interface Player {
    Hand getHand();
    String getName();
    void setName(String name);
    boolean getInGameStatus();
    void setInGameStatus(boolean status);
}
