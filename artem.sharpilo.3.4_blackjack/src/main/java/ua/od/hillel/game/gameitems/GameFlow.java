package ua.od.hillel.game.gameitems;

import java.util.Scanner;

/**
 * Created by ruslangramatic on 7/12/18.
 */
public interface GameFlow {
    void setup();
    void run();

    int askNumberOfPlayers(Scanner scanner);
    Player[] askPlayerNames(Scanner scanner, int numberOfPlayers);
    Table prepareTable(Player[] players);
    Сroupier prepareСroupier(Table table);
}
