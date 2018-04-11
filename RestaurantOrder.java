/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Is3_classStructure;

import java.util.Scanner;

/**
 *
 * @author laurapintar
 */
public class RestaurantOrder {
    
    static int totalHamburgersOrdered = 0;
    static int totalHotdogsOrdered = 0;
    
    static int hamburgers = 0;
    static int hotdogs = 0;
    
    final static int MAX_HAMBURGERS_AVAILABLE = 100;
    final static int MAX_HOTDOGS_AVAILABLE = 100;
    
    final static double HAMBURGER_PRICE = 2.00;
    final static double HOTDOG_PRICE = 1.50;
    private static double totalOrder = 0;
    
    public static void main(String[] args){
        System.out.println("Enter the number pertaining to what you'd like to order.");
        System.out.println("1. Hamburger \n2. Hotdog");
        
        int userSelection;
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        
        // switch options that call to methods
        while (i == 0) {
           userSelection = scanner.nextInt();
            switch(userSelection){
                case 1:
                    orderHamburger(); // goes to orderHamburger method
                    break;
                case 2:
                    orderHotdog(); // goes to orderHotdog method
                    break;
                case 3:
                    displayOrderTotals(); // goes to displayOrderTotals method
                    break;
            } // close switch
        } // close while
    } // close method
    
    public static void orderHamburger(){
        System.out.println("How many hamburgers would you like to order?");
        Scanner scanner = new Scanner(System.in);
        hamburgers = scanner.nextInt();
        if(hamburgers >= 1) {
            totalHamburgersOrdered = (int) (hamburgers * HAMBURGER_PRICE);
            System.out.println("Your hamburger total is $" + totalHamburgersOrdered);
                }

        System.out.println("Press 2 to order hot dogs or 3 to checkout.");   
    } // close method
    
    public static void orderHotdog(){
        System.out.println("How many hot dogs would you like to order?");
        Scanner scanner = new Scanner(System.in);
        hotdogs = scanner.nextInt();
        if(hotdogs >= 1) {
            totalHotdogsOrdered = (int) (hotdogs * HOTDOG_PRICE);
            System.out.println("Your hot dog total is $" + totalHotdogsOrdered);
        }
        
        System.out.println("Press 1 to order hamburgers or 3 to checkout.");
    } // close method
    
    public static void displayOrderTotals(){
        if(hamburgers >= 1) {
            totalHamburgersOrdered = (int) (hamburgers * HAMBURGER_PRICE);
            System.out.println("Your hamburger total is $" + totalHamburgersOrdered);
                }
        
        if(hotdogs >= 1) {
            totalHotdogsOrdered = (int) (hotdogs * HOTDOG_PRICE);
            System.out.println("Your hot dog total is $" + totalHotdogsOrdered);
        }
        
        double totalOrder = totalHamburgersOrdered + totalHotdogsOrdered;
        System.out.println("Your overall total cost is $" + totalOrder);
    } // close method
} // close class
