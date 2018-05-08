/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects1;


/**
 *
 * @author laurapintar
 */
public class FoodLand {
    
    final static int nibble = 5;
    final static int megaBite = 40;
    
    public static void main(String[] args){
        
        Donut firstDonut;
        firstDonut = new Donut();
        
        firstDonut.name = "Donut";
        // pass our Donut referenced by firstDonut to printObjectData
        printObjectData(firstDonut);
        
        Pancake firstPancake;
        firstPancake = new Pancake();
        
        firstPancake.name = "Pancake";
        firstPancake.butter = true;
        firstPancake.syrup = true;
        printObjectData(firstPancake);
        
        Waffle firstWaffle;
        firstWaffle = new Waffle();
        
        firstWaffle.name = "Waffle";
        printObjectData(firstWaffle);
        
        System.out.println("Eating " + firstDonut.name);
        System.out.println("Nibble...");
        firstDonut.simulateEating(nibble);
        System.out.println("Nibble...");
        firstDonut.simulateEating(nibble);
        System.out.println("Taking megaBite...");
        firstDonut.simulateEating(megaBite);
        printObjectData(firstDonut);
        
        System.out.println("Eating " + firstPancake.name);
        System.out.println("Nibble...");
        firstPancake.simulateEating(nibble);
        System.out.println("Taking megaBite...");
        firstPancake.simulateEating(megaBite);
        System.out.println("Taking megaBite...");
        firstPancake.simulateEating(megaBite);
        printObjectData(firstPancake);
        
        System.out.println("Eating " + firstWaffle.name);
        System.out.println("Taking megaBite...");
        firstWaffle.simulateEating(megaBite);
        System.out.println("Nibble...");
        firstWaffle.simulateEating(nibble);
        printObjectData(firstWaffle);
    } // close main method
    
    private static void printObjectData(Donut inputDonut){
        System.out.println("|-----STATS-----|");
        System.out.println("| Name: " + inputDonut.name);
        System.out.println("| PercRemaining: " + inputDonut.getPercRemaining());
        System.out.println("|---------------|");
    } // close printObjectData method
    
    private static void printObjectData(Pancake inputPancake){
        System.out.println("|-----STATS-----|");
        System.out.println("| Name: " + inputPancake.name);
        System.out.println("| PercRemaining: " + inputPancake.getPercRemaining());
        System.out.println("|---------------|");
    } // close printObjectData method
    
    private static void printObjectData(Waffle inputWaffle){
        System.out.println("|-----STATS-----|");
        System.out.println("| Name: " + inputWaffle.name);
        System.out.println("| PercRemaining: " + inputWaffle.getPercRemaining());
        System.out.println("|---------------|");
    } // close printObjectData method
    
} // close main
