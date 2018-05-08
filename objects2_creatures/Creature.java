/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects2_creatures;

/**
 *
 * @author laurapintar
 */
public class Creature {
    
    // public member variables
    public String name;
    public String species;

    // private member variable
    private int biteSizeInPercent;
    public int donutSize;
    
    // method to simulate eating donut
    public void eatDonut(SizedDonut donutForPenguin, SizedDonut donutTom) {
        if(donutForPenguin.sizeInmm > donutSize) {
        System.out.println("Creature.eatDonut | Eating " 
                + biteSizeInPercent + "% of " + donutForPenguin.name);
        donutForPenguin.simulateEating(biteSizeInPercent);
    } else {
            System.out.println("Creature.eatDonut | Chloe is too small");
        } // close if/else
    
    if(donutTom.sizeInmm > donutSize) {
        System.out.println("Creature.eatDonut | Eating " 
                + biteSizeInPercent + "% of " + donutTom.name);
    } else {
        System.out.println("Creature.eatDonut | Tom is too small");
    } // close if/else
} 
    
    // "getter" method for biteSizeInPercent
    public int getBiteSizeInPercent() {
        return biteSizeInPercent;
    }
    
    // setter method for biteSizeInPercent
    public void setBiteSizeInPercent(int sizeToSet) {
        if(sizeToSet > 0){
            this.biteSizeInPercent = sizeToSet;
        } else {
            System.out.println("Oops, negative values not allowed");
        } // close if/else
    } // close method
    
    public void setMinDonutSizeInmm(int donutSizeToSet){
        if(donutSizeToSet > 15){
            this.donutSize = donutSizeToSet;
            System.out.println("That's the right size!");
        } else {
            System.out.println("This donut is too small!");
        } // close if/else
    } // close method
    
    public void getMinDonutSizeInmm(){
        System.out.println("The food must be at least " + donutSize + "mm big");
    } // close method
    
} // close class
