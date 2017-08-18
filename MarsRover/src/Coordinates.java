

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lucas
 */
class Coordinates {
    private int x;
    private int y;

    public Coordinates() {
        this.x = 0;
        this.y = 0;
    }

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void incrementX() {
        x++;
    }

    public void incrementY() {
        y++;
    }
    
    public void decrementX() {
        x--;
    }
    
    public void decrementY() {
        y--;
    }
}
