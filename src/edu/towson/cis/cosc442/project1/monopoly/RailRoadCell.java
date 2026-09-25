package edu.towson.cis.cosc442.project1.monopoly;

/**
 * Represents the RailRoadCell component of the Monopoly application.
 */
public class RailRoadCell extends Cell {
	private static int baseRent;
	static public String COLOR_GROUP = "RAILROAD";
	static private int price;

	/** 
	 * @param baseRent
	 */
	public static void setBaseRent(int baseRent) {
		RailRoadCell.baseRent = baseRent;
	}

	/** 
	 * @param price
	 */
	public static void setPrice(int price) {
		RailRoadCell.price = price;
	}
	
	/** 
	 * @return int
	 */
	@Override
	public int getPrice() {
		return RailRoadCell.price;
	}

	/** 
	 * @return int
	 */
	public int getRent() {
		return RailRoadCell.baseRent * (int)Math.pow(2, theOwner.numberOfRR() - 1);
	}
	
	public void playAction() {
		Player currentPlayer = null;
		if(!isAvailable()) {
			currentPlayer = GameMaster.instance().getCurrentPlayer();
			if(theOwner != currentPlayer) {
				currentPlayer.payRentTo(theOwner, getRent());
			}
		}
	}
}
