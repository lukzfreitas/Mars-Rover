/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Lucas
 */
public class MarsRoverTest {
    
    public Robotic robotic;
            
    @Before
    public void setUp() {
        Coordinates coordinates = new Coordinates();
        CardinalPoints cardinalPoints = new North();
        robotic = new Robotic(coordinates, cardinality);        
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
    
    public void testDecrementCoordinateX() {
        Coordinates coordinates = new Coordinates(5, 5);
        coordinates.decrementX();
        int expected = 4;
        assertEquals(4, coordinates.getX());
    }
    
    @Test
    public void testIncrementCoordinateY() {
        Coordinates coordinates = new Coordinates(5, 5);
        coordinates.incrementX();
        int expected = 6;
        assertEquals(6, coordinates.getY());
    }
    
    @Test
    public void testDecrementCoordinateY() {
        Coordinates coordinates = new Coordinates(5, 5);
        coordinates.decrementX();
        int expected = 4;
        assertEquals(4, coordinates.getY());
    }
    
    @Test
    public void testCadinality() {
        Cardinality cardinality = new Cardinality(Cardinality.NORTH);
        char expected = Cardinality.NORTH;
        assertEquals(expected, cardinality.getCardinality());
    }
    
    @Test
    public void turnRight() {
        robotic.moveRight();
        char expected = Cardinality.;
        assertEquals(coordinatesExpected, robotic.getCoordinates());
    }
    
    @Test
    public void turnRightAndMove() {
        robotic.moveRight();
        Coordinates coordinatesExpected = new Coordinates(1, 0);
        assertEquals(coordinatesExpected, robotic.getCoordinates());
    }

    @Test
    public void moveLeft() {}

    @Test
    public void moveForward() {}    
    
}
