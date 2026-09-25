package edu.towson.cis.cosc442.project1.monopoly;

/**
 * Represents an action card that can be drawn and applied during the game.
 */
public abstract class Card {

    /** Identifies a Chance card. */
    public static int TYPE_CHANCE = 1;
    /** Identifies a Community Chest card. */
    public static int TYPE_CC = 2;

    /**
     * Returns the label displayed for this card.
     *
     * @return the card label
     */
    public abstract String getLabel();

    /** Applies this card's action to the game. */
    public abstract void applyAction();

    /**
     * Returns the category of this card.
     *
     * @return {@link #TYPE_CHANCE} or {@link #TYPE_CC}
     */
    public abstract int getCardType();
}
