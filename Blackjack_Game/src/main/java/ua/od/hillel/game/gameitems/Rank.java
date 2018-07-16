package ua.od.hillel.game.gameitems;

/**
 * Created by ruslangramatic on 7/9/18.
 */
public enum Rank {
    Ace(11),
    R2(2),
    R3(3),
    R4(4),
    R5(5),
    R6(6),
    R7(7),
    R8(8),
    R9(9),
    R10(10),
    Jack(2),
    Queen(3),
    King(4);

    private int cost;

    Rank(int cost) {
        this.cost = cost;
    }

    public int getCost(){
        return cost;
    }
}
