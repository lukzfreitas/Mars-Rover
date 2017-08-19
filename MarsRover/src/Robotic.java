

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lucas
 */
class Robotic {
    private Coordinates coordinates;
    private CardinalPoint cardinalPoint;

    public Robotic(Coordinates coordinates, CardinalPoint cardinalPoint) {
        this.coordinates = coordinates;
        this.cardinalPoint = cardinalPoint;
    }   

    public void moveRight() {
        switch(cardinalPoint.getCardinalPoint()) {
            case CardinalPoint.NORTH :
                cardinalPoint.setCardinalPoint(CardinalPoint.EAST);
                break;
            case CardinalPoint.EAST :
                cardinalPoint.setCardinalPoint(CardinalPoint.SOUTH);
                break;
            case CardinalPoint.SOUTH :
                cardinalPoint.setCardinalPoint(CardinalPoint.WEST);
                break;
            case CardinalPoint.WEST :
                cardinalPoint.setCardinalPoint(CardinalPoint.NORTH);
                break;                
            default:
                throw new IllegalArgumentException("Cardinal point invalid");              
        }
    }
    
    public void moveLeft () {
        switch(cardinalPoint.getCardinalPoint()) {
            case CardinalPoint.NORTH :
                cardinalPoint.setCardinalPoint(CardinalPoint.WEST);
                break;
            case CardinalPoint.WEST :
                cardinalPoint.setCardinalPoint(CardinalPoint.SOUTH);
                break;
            case CardinalPoint.SOUTH :
                cardinalPoint.setCardinalPoint(CardinalPoint.EAST);
                break;
            case CardinalPoint.EAST :
                cardinalPoint.setCardinalPoint(CardinalPoint.NORTH);
                break;                
            default:
                throw new IllegalArgumentException("Cardinal point invalid");              
        }
    }
    
    public void moveForward() {
        switch(cardinalPoint.getCardinalPoint()) {
            case CardinalPoint.NORTH :
                coordinates.incrementY();
                break;
            case CardinalPoint.EAST :
                coordinates.incrementX();
                break;
            case CardinalPoint.SOUTH :
                coordinates.decrementY();
                break;
            case CardinalPoint.WEST :
                coordinates.decrementX();
                break;                
            default:
                throw new IllegalArgumentException("Cardinal point invalid");              
        }
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }  

    public char getCardinalPoint() {
        return cardinalPoint.getCardinalPoint();
    }

    @Override
    public String toString() {
        return coordinates.toString() + " " + cardinalPoint.getCardinalPoint();
    }
    
    
    
}
