/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Camila and Lucas
 */
public class MarsRoverTest {
    
    public Robotic robotic;
            
    @Before
    public void setUp() {
        Coordinates coordinates = new Coordinates();
        CardinalPoint cardinalPoint = new CardinalPoint(CardinalPoint.NORTH);     
        robotic = new Robotic(coordinates, cardinalPoint);        
    }
    
    @Test
    public void testCoordinatesNotParameters() {
        Coordinates coordinates = new Coordinates();
        int expected = 0;
        assertEquals(expected, coordinates.getX());
        assertEquals(expected, coordinates.getY());
    }
    
    @Test
    public void testCoordinatesWithParameters() {
        Coordinates coordinates = new Coordinates(5, 5);
        int x = 5;
        int y = 5;
        assertEquals(x, coordinates.getX());
        assertEquals(y, coordinates.getY());
    }
    
    @Test
    public void testIncrementCoordinateX() {
        Coordinates coordinates = new Coordinates(5, 5);
        coordinates.incrementX();
        int expected = 6;
        assertEquals(6, coordinates.getX());
    }
    
    @Test
    public void testDecrementCoordinateX() {
        Coordinates coordinates = new Coordinates(5, 5);
        coordinates.decrementX();
        int expected = 4;
        assertEquals(4, coordinates.getX());
    }
    
    @Test
    public void testIncrementCoordinateY() {
        Coordinates coordinates = new Coordinates(5, 5);
        coordinates.incrementY();
        int expected = 6;
        assertEquals(6, coordinates.getY());
    }
    
    @Test
    public void testDecrementCoordinateY() {
        Coordinates coordinates = new Coordinates(5, 5);
        coordinates.decrementY();
        int expected = 4;
        assertEquals(4, coordinates.getY());
    }
    
    @Test
    public void testCardinalPoint() {
        CardinalPoint cardinalPoint = new CardinalPoint(CardinalPoint.NORTH);
        char expected = CardinalPoint.NORTH;
        assertEquals(expected, cardinalPoint.getCardinalPoint());
    }
    
    @Test
    public void turnRight90Degrees() {
        robotic.moveRight();
        char expected = CardinalPoint.EAST;
        assertEquals(expected, robotic.getCardinalPoint());
    }
    
    @Test
    public void turnRight180Degrees() {
        robotic.moveRight();
        robotic.moveRight();
        char expected = CardinalPoint.SOUTH;
        assertEquals(expected, robotic.getCardinalPoint());
    }
    
    @Test
    public void turnRight270Degrees() {
        robotic.moveRight();
        robotic.moveRight();
        robotic.moveRight();
        char expected = CardinalPoint.WEST;
        assertEquals(expected, robotic.getCardinalPoint());
    }
    
    @Test
    public void turnRight360Degrees() {
        robotic.moveRight();
        robotic.moveRight();
        robotic.moveRight();
        robotic.moveRight();
        char expected = CardinalPoint.NORTH;
        assertEquals(expected, robotic.getCardinalPoint());
    }
    
    @Test
    public void turnLeft90Degrees() {
        robotic.moveLeft();
        char expected = CardinalPoint.WEST;
        assertEquals(expected, robotic.getCardinalPoint());
    }
    
    @Test
    public void turnLeft180Degrees() {
        robotic.moveLeft();
        robotic.moveLeft();
        char expected = CardinalPoint.SOUTH;
        assertEquals(expected, robotic.getCardinalPoint());
    }
    
    @Test
    public void turnLeft270Degrees() {
        robotic.moveLeft();
        robotic.moveLeft();
        robotic.moveLeft();
        char expected = CardinalPoint.EAST;
        assertEquals(expected, robotic.getCardinalPoint());
    }
    
    @Test
    public void turnLeft360Degrees() {
        robotic.moveLeft();
        robotic.moveLeft();
        robotic.moveLeft();
        robotic.moveLeft();
        char expected = CardinalPoint.NORTH;
        assertEquals(expected, robotic.getCardinalPoint());
    }
    
    @Test
    public void moveNorth() {        
        robotic.moveForward();
        int y = 1;
        int x = 0;
        assertEquals(y, robotic.getCoordinates().getY());
        assertEquals(x, robotic.getCoordinates().getX());
    }
    
    @Test
    public void moveEast() {        
        robotic.moveRight();
        robotic.moveForward();
        int y = 0;
        int x = 1;
        assertEquals(y, robotic.getCoordinates().getY());
        assertEquals(x, robotic.getCoordinates().getX());
    }
    
    @Test
    public void moveSouth() {
        robotic.moveRight();
        robotic.moveRight();
        robotic.moveForward();
        int y = -1;
        int x = 0;
        assertEquals(y, robotic.getCoordinates().getY());
        assertEquals(x, robotic.getCoordinates().getX());
    }

    @Test
    public void moveWest() {
        robotic.moveRight();
        robotic.moveRight();
        robotic.moveRight();
        robotic.moveForward();
        int y = 0;
        int x = -1;
        assertEquals(y, robotic.getCoordinates().getY());
        assertEquals(x, robotic.getCoordinates().getX());
    }    
    
    @Test(expected = IllegalArgumentException.class)
    public void cardinalPointInvalid() {
        CardinalPoint cardinalPoint = new CardinalPoint('X');        
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void setCardinalPointInvalid() {
        CardinalPoint cardinalPoint = new CardinalPoint(CardinalPoint.EAST);   
        cardinalPoint.setCardinalPoint('X');
    }
    
}
