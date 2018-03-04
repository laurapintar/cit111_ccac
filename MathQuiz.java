/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

import java.util.Scanner;

/**
 *
 * @author laurapintar
 */
public class MathQuiz {
    public static void main(String[] args) {
        final double CorrectAnswer = 24;
        double answer;
        final int attemptsallowed = 3;
        int attempts = 0;
        
        Scanner myScanner = new Scanner(System.in);
        while(attempts < attemptsallowed) {
            System.out.println("What is 6 * 4?");
            answer = myScanner.nextDouble();
            // program ends if correct answer is entered
            if(answer == CorrectAnswer) {
                System.out.println("Congratulations, you're correct!");
                break;
                // program will stop after 3 incorrect answers are entered
            } else if(answer < CorrectAnswer) {
                attempts = attempts + 1;
                System.out.println("Sorry, that is not correct. Try again.");
                System.out.println("Attempt " + attempts + " out of " + attemptsallowed);
            } else if(answer > CorrectAnswer) {
                attempts = attempts + 1;
                System.out.println("Sorry, that is not correct. Try again.");
                System.out.println("Attempt " + attempts + " out of " + attemptsallowed);
            } if(attempts == attemptsallowed){
                System.out.println("Sorry, you failed. The answer was 24.");     
            }
        } // close while
                
    } // close main
    
} // close class
