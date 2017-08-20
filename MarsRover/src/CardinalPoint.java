/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Camila and Lucas
 */
public class CardinalPoint {

    public static final char NORTH = 'N';
    public static final char SOUTH = 'S';
    public static final char WEST = 'W';
    public static final char EAST = 'E';
    private char cardinalPoint;

    public CardinalPoint(char cardinalPoint) {
        if (cardinalPoint == NORTH || cardinalPoint == SOUTH
                || cardinalPoint == WEST || cardinalPoint == EAST) {
            this.cardinalPoint = cardinalPoint;
        } else {
            throw new IllegalArgumentException("Cardinal point invalid");
        }
    }

    public void setCardinalPoint(char cardinalPoint) {
        if (cardinalPoint == NORTH || cardinalPoint == SOUTH
                || cardinalPoint == WEST || cardinalPoint == EAST) {
            this.cardinalPoint = cardinalPoint;
        } else {
            throw new IllegalArgumentException("Cardinal point invalid");
        }
    }
        
    public char getCardinalPoint() {
        return cardinalPoint;
    }
}
