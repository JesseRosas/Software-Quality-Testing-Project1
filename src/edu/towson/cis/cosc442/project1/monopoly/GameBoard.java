package edu.towson.cis.cosc442.project1.monopoly;

import java.util.ArrayList;
import java.util.Hashtable;

/**
 * Stores the cells and action cards that make up a Monopoly game board.
 */
public class GameBoard {

	private ArrayList<Cell> cells = new ArrayList<Cell>();
    private ArrayList<Card> chanceCards = new ArrayList<Card>();
	//the key of colorGroups is the name of the color group.
	private Hashtable<String, Integer> colorGroups = new Hashtable<String, Integer>();
	private ArrayList<Card> communityChestCards = new ArrayList<Card>();

	/** Creates a board containing the starting Go cell. */
	public GameBoard() {
		Cell go = new GoCell();
		addCell(go);
	}

	/**
	 * Adds a card to the deck associated with its card type.
	 *
	 * @param card card to add to the board
	 */
	public void addCard(Card card) {
        if(card.getCardType() == Card.TYPE_CC) {
            communityChestCards.add(card);
        } else {
            chanceCards.add(card);
        }
    }
	
	/**
	 * Adds a non-property cell to the board.
	 *
	 * @param cell cell to add
	 */
	public void addCell(Cell cell) {
		cells.add(cell);
	}
	
	/**
	 * Adds a property cell and updates its color-group count.
	 *
	 * @param cell property cell to add
	 */
	public void addCell(PropertyCell cell) {
		String colorGroup = cell.getColorGroup();
		int propertyNumber = getPropertyNumberForColor(colorGroup);
		colorGroups.put(colorGroup, propertyNumber + 1);
        cells.add(cell);
	}

	/**
	 * Draws the next Community Chest card and returns it to that deck.
	 *
	 * @return the drawn Community Chest card
	 */
	public Card drawCCCard() {
        Card card = (Card)communityChestCards.get(0);
        communityChestCards.remove(0);
        addCard(card);
        return card;
    }

	/**
	 * Draws the next Chance card and returns it to that deck.
	 *
	 * @return the drawn Chance card
	 */
	public Card drawChanceCard() {
        Card card = (Card)chanceCards.get(0);
        chanceCards.remove(0);
        addCard(card);
        return card;
    }

	/**
	 * Returns the cell at the supplied board index.
	 *
	 * @param newIndex zero-based index of the cell
	 * @return the cell at {@code newIndex}
	 */
	public Cell getCell(int newIndex) {
		return (Cell)cells.get(newIndex);
	}
	
	/**
	 * Returns the number of cells on the board.
	 *
	 * @return the number of cells
	 */
	public int getCellNumber() {
		return cells.size();
	}
	
	/**
	 * Returns all properties belonging to the specified color group.
	 *
	 * @param color color-group name to search for
	 * @return the properties in the color group
	 */
	public PropertyCell[] getPropertiesInMonopoly(String color) {
		PropertyCell[] monopolyCells = 
			new PropertyCell[getPropertyNumberForColor(color)];
		int counter = 0;
		for (int i = 0; i < getCellNumber(); i++) {
			Cell c = getCell(i);
			if(c instanceof PropertyCell) {
				PropertyCell pc = (PropertyCell)c;
				if(pc.getColorGroup().equals(color)) {
					monopolyCells[counter] = pc;
					counter++;
				}
			}
		}
		return monopolyCells;
	}
	
	/**
	 * Returns the number of properties registered for a color group.
	 *
	 * @param name color-group name to look up
	 * @return the number of properties in the group, or {@code 0} if unknown
	 */
	public int getPropertyNumberForColor(String name) {
		Integer number = (Integer)colorGroups.get(name);
		if(number != null) {
			return number.intValue();
		}
		return 0;
	}

	/**
	 * Finds a cell by its name.
	 *
	 * @param string name of the cell to find
	 * @return the matching cell, or {@code null} if no cell has that name
	 */
	public Cell queryCell(String string) {
		for(int i = 0; i < cells.size(); i++){
			Cell temp = (Cell)cells.get(i); 
			if(temp.getName().equals(string)) {
				return temp;
			}
		}
		return null;
	}
	
	/**
	 * Finds the index of a cell by its name.
	 *
	 * @param string name of the cell to find
	 * @return the zero-based cell index, or {@code -1} if no cell has that name
	 */
	public int queryCellIndex(String string){
		for(int i = 0; i < cells.size(); i++){
			Cell temp = (Cell)cells.get(i); 
			if(temp.getName().equals(string)) {
				return i;
			}
		}
		return -1;
	}
	/** Removes all Community Chest cards from the board. */
    public void removeCards() {
        communityChestCards.clear();
    }
}
