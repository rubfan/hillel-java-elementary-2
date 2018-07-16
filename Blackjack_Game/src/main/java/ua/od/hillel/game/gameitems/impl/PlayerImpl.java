package ua.od.hillel.game.gameitems.impl;

import ua.od.hillel.game.gameitems.Hand;
import ua.od.hillel.game.gameitems.Player;

/**
 * Created by ruslangramatic on 7/9/18.
 */
public class PlayerImpl implements Player {

    private Hand hand;
    private String name;
    private boolean status;

    public PlayerImpl() {
        this.hand = new HandImpl();
    }

    public Hand getHand() {
        return hand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getInGameStatus() {
        return status;
    }

    public void setInGameStatus(boolean status) {
        this.status = status;
    }
}
