package ua.od.hillel.game.gameitems.impl;

import ua.od.hillel.game.gameitems.Player;
import ua.od.hillel.game.gameitems.Table;

/**
 * Created by ruslangramatic on 7/9/18.
 */
public class TableImpl implements Table {
    private Player[] players;
    private Player currentPlayer;

    public TableImpl(Player[] players) {
        this.players = players;
        currentPlayer = players[0];
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    public Player[] getListOfPlayers() {
        return players;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public void switchToNextPlayer() {
        for (int i = 0; i < players.length; i++){
            if(players[i].equals(currentPlayer)) {
                if(i == players.length - 1) {
                    currentPlayer = players[0];
                } else {
                    currentPlayer = players[++i];
                }
                break;
            }
        }
    }

    public void setListOfPlayer(Player[] players) {
        this.players = players;
    }
}
