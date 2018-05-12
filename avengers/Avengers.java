/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avengers;

import java.util.Scanner;


/**
 *DISCLAIMER: This is not based on fact.
 * I'm just your average Thor stan and mild MCU fan.
 * Don't @ me
 * @author laurapintar
 */
public class Avengers {
    
    public static void main(String[] args) {
        //variables
        
        OriginalSix godofthunder;
        godofthunder = new OriginalSix();
        godofthunder.name = "Thor";
        godofthunder.strength = 6;
        godofthunder.speed = 7;
        godofthunder.intelligence = 2;
        godofthunder.durability = 7;
        godofthunder.energyprojection = 6;
        godofthunder.total = 28;
        
        OriginalSix steverogers;
        steverogers = new OriginalSix();
        steverogers.name = "Captain America";
        steverogers.strength = 3;
        steverogers.speed = 2;
        steverogers.intelligence = 2;
        steverogers.durability = 5;
        steverogers.energyprojection = 2;
        steverogers.total = 14;
        
        OriginalSix tonystark;
        tonystark = new OriginalSix();
        tonystark.name = "Iron Man";
        tonystark.strength = 5;
        tonystark.speed = 3;
        tonystark.intelligence = 5;
        tonystark.durability = 5;
        tonystark.energyprojection = 5;
        tonystark.total = 23;
        
        OriginalSix brucebanner;
        brucebanner = new OriginalSix();
        brucebanner.name = "Hulk";
        brucebanner.strength = 7;
        brucebanner.speed = 2;
        brucebanner.intelligence = 5;
        brucebanner.durability = 6;
        brucebanner.energyprojection = 4;
        brucebanner.total = 24;
        
        OriginalSix clintbarton;
        clintbarton = new OriginalSix();
        clintbarton.name = "Hawkeye";
        clintbarton.strength = 2;
        clintbarton.speed = 2;
        clintbarton.intelligence = 2;
        clintbarton.durability = 3;
        clintbarton.energyprojection = 2;
        clintbarton.total = 11;
        
        OriginalSix natasharomanova;
        natasharomanova = new OriginalSix();
        natasharomanova.name = "Black Widow";
        natasharomanova.strength = 2;
        natasharomanova.speed = 2;
        natasharomanova.intelligence = 2;
        natasharomanova.durability = 3;
        natasharomanova.energyprojection = 2;
        natasharomanova.total = 11;
        
       
        
        // create a scanner object to read in user input
        Scanner keyboardScanner = new Scanner(System.in);
        int userSelection;
        
        System.out.println("----------Choose a fight----------");
        System.out.println("1 - Thor vs Captain America");
        System.out.println("2 - Hawkeye vs Black Widow");
        System.out.println("3 - Hulk vs Iron Man");
        System.out.println("Enter a number and press enter");
        
        // read in an integer from the user through the keyboard
        userSelection = keyboardScanner.nextInt();

        switch(userSelection){
            case 1:
                thorVsCap(); 
                break;
            case 2:
                hawkeyeVsBW();
                break;
            case 3:
                hulkVsIM(); 
                break;
            default:
                System.out.println("Press 1, 2, or 3.");
        } // close switch
            
    } // close main
    
    public static void thorVsCap(){
        OriginalSix godofthunder;
        godofthunder = new OriginalSix();
        godofthunder.name = "Thor";
        godofthunder.total = 28;
        
        OriginalSix steverogers;
        steverogers = new OriginalSix();
        steverogers.name = "Captain America";
        steverogers.total = 14;
        
                if(godofthunder.total > steverogers.total) {
        System.out.println(godofthunder.name + " would win against " 
                + steverogers.name);
                } // close if statement
    }
    
    public static void hawkeyeVsBW(){
        OriginalSix clintbarton;
        clintbarton = new OriginalSix();
        clintbarton.name = "Hawkeye";
        clintbarton.total = 11;
        
        OriginalSix natasharomanova;
        natasharomanova = new OriginalSix();
        natasharomanova.name = "Black Widow";
        natasharomanova.total = 11;
        
        if(clintbarton.total == natasharomanova.total) {
            System.out.println("Stalemate! They're just gonna hug it out");
        } // close if statement
    }
    
    public static void hulkVsIM(){
        OriginalSix brucebanner;
        brucebanner = new OriginalSix();
        brucebanner.name = "Hulk";
        brucebanner.total = 24;
        
        OriginalSix tonystark;
        tonystark = new OriginalSix();
        tonystark.name = "Iron Man";
        tonystark.total = 23;
        
        if(brucebanner.total > tonystark.total) {
            System.out.println(brucebanner.name + " would win against "
                    + tonystark.name);
        } // close if statement 
    }
 
} // close class

