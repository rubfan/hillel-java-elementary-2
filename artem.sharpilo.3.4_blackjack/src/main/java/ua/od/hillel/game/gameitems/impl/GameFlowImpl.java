package ua.od.hillel.game.gameitems.impl;

import ua.od.hillel.game.gameitems.*;

import java.util.Scanner;

/**
 * Created by ruslangramatic on 7/12/18.
 */
public class GameFlowImpl implements GameFlow {
    private int numberOfPlayers;
    private Player[] players;
    private Table table;
    private Сroupier croupier;

    public void setup() {
        Scanner scanner = new Scanner(System.in);

        //step 1
        numberOfPlayers = askNumberOfPlayers(scanner);

        //step 2
        players = askPlayerNames(scanner, numberOfPlayers);

        //step 3
        table = prepareTable(players);

        //step 4
        croupier = prepareСroupier(table);

        //step 5 раздать карты
        croupier.prepareDeck();
        croupier.giveOutCardsAtStart();

        scanner.close();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        //Game Cycle
        boolean endGameFlag = false;
        do {
            Player currPlayer  = table.getCurrentPlayer();
            if(currPlayer.getInGameStatus()) {
                System.out.println("Would you like to take one card more?");
                String yn = scanner.next();
                switch (yn) {
                    case "y":
                        Card topCard = croupier.getTopCard();
                        currPlayer.getHand().putCard(topCard);
                        break;
                    case "n":
                        currPlayer.setInGameStatus(false);
                        break;
                }
            }
            table.switchToNextPlayer();

            endGameFlag = checkEndGame();
        } while (!endGameFlag);

        scanner.close();
    }


    private boolean checkEndGame() {
        int notInGameStatusNumber = 0;
        for (Player p : table.getListOfPlayers()) {
            notInGameStatusNumber += p.getInGameStatus() ? 0 : 1;
        }
        return notInGameStatusNumber >= table.getListOfPlayers().length;
    }

    public int askNumberOfPlayers(Scanner scanner) {
        System.out.println("Please enter the number of players:");
        int numberOfPlayers = scanner.nextInt();
        return numberOfPlayers;
    }

    public Player[] askPlayerNames(Scanner scanner, int numberOfPlayers) {
        Player[] players = new Player[numberOfPlayers];
        for (int p = 0; p < numberOfPlayers; p++) {
            System.out.println("Please enter " + p + " player name:");
            String name = scanner.next();
            Player player = new PlayerImpl();
            player.setName(name);
            players[p] = player;
        }
        return players;
    }

    public Table prepareTable(Player[] players) {
        Table table = new TableImpl(players);
        return table;
    }

    public Сroupier prepareСroupier(Table table) {
        Сroupier croupier = new СroupierImpl(table);
        return croupier;
    }
}
