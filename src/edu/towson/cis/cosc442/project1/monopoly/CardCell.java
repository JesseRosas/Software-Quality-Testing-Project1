package edu.towson.cis.cosc442.project1.monopoly;

/**
 * Represents the CardCell component of the Monopoly application.
 */
public class CardCell extends Cell {
    private int type;
    
    public CardCell(int type, String name) {
        setName(name);
        this.type = type;
    }
    
    public void playAction() {
    }
    
    public int getType() {
        return type;
    }
}
