/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

import java.util.Scanner;


/**
 *
 * @author laurapintar
 */
public class Gas {
    
    public static void main(String[] args) {
        
        double MilesPerGallon = 28.00;
        double MilesLeft;
        double GasLeft;
        Scanner userInputScanner = new Scanner(System.in);
        
        // prompt user for amount of miles remaining
        System.out.println("Enter the amount of miles remaining and press enter:");
        MilesLeft = userInputScanner.nextDouble();
        
        // prompt user for amount of gas remaining
        System.out.println("Enter the amount of gas remaining and press enter:");
        GasLeft = userInputScanner.nextDouble();
        
        // evaluate whether user input compared to calculated amount is true or false
        if(GasLeft * MilesPerGallon >= MilesLeft) {
            System.out.println("Congratulations, you'll make it!");
        }
        else {
           System.out.println("Oh no, you won't make it");
        }
    }
    
}
