
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lucas
 */
public class File {
    public static void read(String filePath) {
          try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));            
            String line = br.readLine();                        
            Scanner sc = new Scanner(line).useDelimiter(" ");                
            int x = Integer.parseInt(sc.next());   
            int y = Integer.parseInt(sc.next());   
            while (br.ready()) {                                
                Coordinates coordinates = new Coordinates(x, y);
                line =  br.readLine();
                sc = new Scanner(line).useDelimiter(" ");
                x = Integer.parseInt(sc.next());   
                y = Integer.parseInt(sc.next());   
                char cardinalPointChar = sc.next().charAt(0);                   
                CardinalPoint cardinalPoint = new CardinalPoint(cardinalPointChar);                                
                char[] commands =  br.readLine().toCharArray();
                Robotic robotic = new Robotic(coordinates, cardinalPoint);
                Instructions.execute(robotic, commands);
            }            
        } catch (IOException exception) {
            System.err.format("Erro de E/S: %s%n", exception);
        }         
    } 
}
