package ua.od.hillel.game;

import ua.od.hillel.game.gameitems.GameFlow;
import ua.od.hillel.game.gameitems.impl.GameFlowImpl;

/**
 * Created by ruslangramatic on 7/9/18.
 */
public class Game {
    public static void main(String[] args) {
        GameFlow gameFlow = new GameFlowImpl();
        gameFlow.setup();
        gameFlow.run();
    }
}



