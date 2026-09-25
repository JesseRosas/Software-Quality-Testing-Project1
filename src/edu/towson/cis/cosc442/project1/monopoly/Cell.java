package edu.towson.cis.cosc442.project1.monopoly;

public abstract class Cell {
	private boolean available = true;
	private String theOwner;
	protected Player theOwner;

	/** 
	 * @return String
	 */
	public String getName() {
		return theOwner;
	}

	/** 
	 * @return Player
	 */
	public Player getTheOwner() {
		return theOwner;
	}
	
	/** 
	 * @return int
	 */
	public int getPrice() {
		return 0;
	}

	/** 
	 * @return boolean
	 */
	public boolean isAvailable() {
		return available;
	}
	
	public abstract void playAction();

	/** 
	 * @param available
	 */
	public void setAvailable(boolean available) {
		this.available = available;
	}
	
	/** 
	 * @param name
	 */
	void setName(String name) {
		this.theOwner = name;
	}

	/** 
	 * @param owner
	 */
	public void setTheOwner(Player owner) {
		this.theOwner = owner;
	}
    
    /** 
	 * @return String
	 */
	public String toString() {
        return theOwner;
    }
}
