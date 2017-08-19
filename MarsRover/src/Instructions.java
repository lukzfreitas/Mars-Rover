/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lucas
 */
public class Instructions {
    public static void execute(Robotic robotic, char[] commands) {        
        for (char command : commands) {
            switch(command) {
                case 'M' :
                    robotic.moveForward();
                    break;
                case 'L' :
                    robotic.moveLeft();
                    break;
                case 'R' :
                    robotic.moveRight();
                    break;
                default:
                    throw new IllegalArgumentException("Command invalid");
            }
        }
        System.out.println(robotic.toString());
    }
}
