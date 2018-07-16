package ua.od.hillel.game.gameitems;

/**
 * Created by ruslangramatic on 7/9/18.
 */
public enum Suit {
    HEARTS(Color.RED),
    DIAMONDS(Color.RED),
    CLUBS(Color.BLACK),
    SPADES(Color.BLACK);

    private Color color;

    Suit(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}

