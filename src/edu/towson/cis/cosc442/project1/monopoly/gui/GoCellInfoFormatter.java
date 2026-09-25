package edu.towson.cis.cosc442.project1.monopoly.gui;

import edu.towson.cis.cosc442.project1.monopoly.Cell;

/**
 * Represents the GoCellInfoFormatter component of the Monopoly application.
 */
public class GoCellInfoFormatter implements CellInfoFormatter {
    
    public static final String GO_CELL_LABEL = "<html><b>Go</b></html>";
    
    public String format(Cell cell) {
        return GO_CELL_LABEL;
    }
}
