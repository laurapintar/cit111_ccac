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
public class CreatureLand {
    
    public static void main(String[] args) {
        // make a pointer variable
        Creature penguin;
        penguin = new Creature();
        penguin.name = "Pablo";
        penguin.species = "Emperor Penguin";
        penguin.setBiteSizeInPercent(5);
        penguin.setMinDonutSizeInmm(25);
        penguin.getMinDonutSizeInmm();
        
        displayCreatureStats(penguin);
        
        SizedDonut donutForPenguin = new SizedDonut();
        donutForPenguin.name = "Chloe";
        donutForPenguin.sizeInmm = 32;
        
        SizedDonut donutTom = new SizedDonut();
        donutTom.name = "Tom";
        donutTom.sizeInmm = 15;
        
        penguin.eatDonut(donutForPenguin, donutTom);
        
        displaySizedDonutStats(donutForPenguin);
        displayDonutTomStats(donutTom);

                
    } // close main
    
    
    public static void displayCreatureStats(Creature penguin){
        System.out.println("***Display Creature Stats***");
        System.out.println("Name: " + penguin.name);
        System.out.println("Species: " + penguin.species);
        System.out.println("Bite Size: " + penguin.getBiteSizeInPercent()
                + "% of a donut");
        System.out.println("Min SizedDonut size: " + penguin.donutSize + "mm");
        System.out.println("********************");
        // no return value needed
    } // close method
    
    public static void displaySizedDonutStats(SizedDonut donutForPenguin) {
        System.out.println("***SizedDonut Stats***");
        System.out.println("Name: " + donutForPenguin.name);
        System.out.println("Size: " + donutForPenguin.sizeInmm + "mm");
        System.out.println("Percent Remaining: " + donutForPenguin.getPercRemaining() + "%");
        System.out.println("********************");
    } //close method
    
    public static void displayDonutTomStats(SizedDonut donutTom) {
        System.out.println("***SizedDonut Stats***");
        System.out.println("Name: " + donutTom.name);
        System.out.println("Size: " + donutTom.sizeInmm + "mm");
        System.out.println("Percent Remaining: " + donutTom.getPercRemaining() + "%");
        System.out.println("********************");
    } // close method
    
} // close class
