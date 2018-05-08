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
public class Pancake {
    
    // member variables
    private int percRemaining = 100;
    public String name;
    public boolean butter;
    public boolean syrup;
    
    // method: takes in an integer representing the size of bite
    // being taken of this donut. returns nothing
    public void simulateEating(int percentEaten){
        // subtract the bite size from the existing donut percent remaining
        percRemaining = percRemaining - percentEaten;
    } // close method
    
    // method: takes no input parameters and returns percRemaining
    public int getPercRemaining(){
        return percRemaining;
    } // close method
    
} // close class
