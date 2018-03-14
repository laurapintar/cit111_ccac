/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;

import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

/**
 * Mystery door and prize generator
 * @author laurapintar
 */
public class MysteryDoors {
    public static void main(String[] args) {
        // create a scanner object to read in user input
        Scanner keyboardScanner = new Scanner(System.in);
        // create a variable for holding user selection and running switch
        int userSelection;
        
        System.out.println("***** MYSTERY DOOR *****");
        System.out.println("_____  _____  _____");
        System.out.println("| 1 |  | 2 |  | 3 |");
        System.out.println("-----  -----  -----");
        System.out.println("Choose a door to recieve a prize!");
        
        // read in an integer either 1, 2, or 3 from the user through the keyboard
        userSelection = keyboardScanner.nextInt();
        
      
        switch(userSelection){
            case 1:
                printStatement(); // goes to generate a statement
                break;
            case 2:
                generateBigNumber(); // goes to generate a random number
                break;
            case 3:
                ifElse(); // goes to if / else
                break;
        } // close switch
    } // close main
    
    // generates a statement
    public static void printStatement(){
        System.out.println("CONGRATULATIONS");
        System.out.println("You won a cat! You're welcome.");
    } // close method printStatement
    
    // Generates a random number 
    public static void generateBigNumber(){
        System.out.println("You've won:");
        Random r = new Random();
        BigInteger bigInt = new BigInteger(20, r);
        // generates the number and shows text
        System.out.println(bigInt + " free apples!");
        System.out.println("An apple a day keeps the doctor away ( ͡° ͜ʖ ͡°)");
    } // close method generateBigNumber
    
    public static void ifElse(){
        System.out.println("Do you enjoy films more than the average human? Answer yes or no.");
        Scanner input = new Scanner(System.in);
        String a = input.next();
        
        // if answer is yes...
        if(a.equals("yes")){
            System.out.println("Awesome! You get free movies forever!");
            
       // if answer is no, or anything else...
        } else {
            System.out.println("What's wrong with you? You shall not pass. Sorry.");
        }
        // close if/else block
    } // close method ifElse
    
} // close class
