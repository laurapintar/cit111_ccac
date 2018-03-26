/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8_methods2;

import java.util.Scanner;

/**
 *
 * @author laurapintar
 */
public class ConversionCalculator {
    public static void main(String[] args) {
        // create a scanner object to gather user input
        Scanner scan = new Scanner(System.in);
        
        // obtain a user input of miles
        System.out.println("Enter the number of miles you would like to convert to fathoms:");
        double userMiles = scan.nextDouble();
        
        // call calcMilesToFtm() with the user's input of miles
        double returnedFtm = calcMilesToFtm(userMiles);
        
        // print the inputs and the outputs
        System.out.println("There are " + returnedFtm + " fathoms in " + userMiles + " miles.");
        System.out.println("---------------------------------------------");
        
        
        
        // obtain a user input of furlongs
        System.out.println("Enter the number of furlongs you would like to convert to miles:");
        double userFurlongs = scan.nextDouble();
        
        // call calcFurToMi() with the user's input of furlongs
        double returnedMi = calcFurToMi(userFurlongs);
        
        // print the inputs and the outputs
        System.out.println("There are " + returnedMi + " miles in " + userFurlongs + " furlongs.");
        System.out.println("---------------------------------------------");
        
        
        
        // obtain a user input of hands
        System.out.println("Enter the number of hands you would like to convert to feet:");
        double userHands = scan.nextDouble();
        
        // call calcHandsToFt() with the user's input of hands
        double returnedFt = calcHandsToFt(userHands);
        
        // print the inputs and the outputs
        System.out.println("There are " + returnedFt + " feet in " + userHands + " hands.");
        
    } // close main method
    

    
    public static double calcMilesToFtm(double mi){
        // calculates how many fathoms are in a mile
        double ftm = (mi * 880);
        return ftm;
    } // close method
    

    public static double calcFurToMi(double fur){
        // calculates how many miles are in a furlong
        double mi = (fur * 0.125);
        return mi;
    } // close method
    

    public static double calcHandsToFt(double hands){
        // calculates how many feet are in a hand
        double ft = (hands * 0.333333);
        return ft;
    } // close method
} // close class
