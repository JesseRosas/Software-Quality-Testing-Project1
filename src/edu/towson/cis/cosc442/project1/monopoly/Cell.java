package edu.towson.cis.cosc442.project1.monopoly;

/**
 * Represents the Cell component of the Monopoly application.
 */
public abstract class Cell {
	private boolean available = true;
	private String name;
	protected Player theOwner;

	/** 
	 * @return String
	 */

	// Getter for the name of the cell
	public String getName() {
		return name;
	}

	/** 
	 * @return Player
	 */

	// Getter for the owner of the cell
	public Player getTheOwner() {
		return name;
	}
	
	/** 
	 * @return int
	 */
	// Getter for the price of the cell
	public int getPrice() {
		return 0;
	}

	/** 
	 * @return boolean
	 */
	// Getter for the availability of the cell
	public boolean isAvailable() {
		return available;
	}
	
	public abstract void playAction();

	/** 
	 * @param available
	 */
	// Setter for the availability of the cell
	public void setAvailable(boolean available) {
		this.available = available;
	}
	
	/** 
	 * @param name
	 */
	// Setter for the name of the cell
	void setName(String name) {
		this.name = name;
	}

	/** 
	 * @param owner
	 */
	// Setter for the owner of the cell
	public void setTheOwner(Player owner) {
		this.name = owner;
	}
    
    /** 
	 * @return String
	 */
	public String toString() {
        return name;
    }
}
