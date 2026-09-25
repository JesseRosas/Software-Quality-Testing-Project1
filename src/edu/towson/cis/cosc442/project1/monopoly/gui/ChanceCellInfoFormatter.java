package edu.towson.cis.cosc442.project1.monopoly.gui;

import edu.towson.cis.cosc442.project1.monopoly.Cell;

/**
 * Represents the ChanceCellInfoFormatter component of the Monopoly application.
 */
public class ChanceCellInfoFormatter implements CellInfoFormatter {
    
    public static final String CHANCE_CELL_LABEL = "<html><font color='teal'><b>Chance</b></font></html>";
    
    /** 
     * @param cell
     * @return String
     */
    public String format(Cell cell) {
        return CHANCE_CELL_LABEL;
    }
}
