package ua.od.hillel.game.gameitems;

/**
 * Created by ruslangramatic on 7/9/18.
 */
public interface Table {
    Player[] getListOfPlayers();
    void setListOfPlayer(Player[] players);
    Player getCurrentPlayer();
    void switchToNextPlayer();
}
