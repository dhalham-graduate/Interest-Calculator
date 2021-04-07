/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mthree.week2.interestcalculator;

import java.util.Scanner;

/**
 *
 * @author dhalh
 */
public class InterestCalculator {


    public static void main(String[] args) {
        //Initialize variables and scanner
        float investment;
        int years;
        float interestRate;
        float initialTotal;
        float finalTotal;
        Scanner sc = new Scanner(System.in);
        
        //Prompt user for details, and assign to corresponding variables
        System.out.println("How much do you want to invest? ");
        investment = sc.nextFloat();
        initialTotal = investment;
        finalTotal = investment;
        System.out.println("How many years are investing? ");
        years = sc.nextInt();
        System.out.println("What is the annual interest rate % growth? ");
        interestRate = sc.nextFloat();
        System.out.println("");
        System.out.println("Calculating...");
        
        //Calculate the investment and print results over years specified
        for (int i = 1; i <= years; i++) {
            System.out.println("Year " + i + ":");
            System.out.println("Began with: $" + initialTotal);
            for (int j = 0; j < 4; j++) {
                finalTotal = finalTotal * (1 + (interestRate/(4*100)));
            }
            System.out.println("Earned: $" + (finalTotal - initialTotal));
            System.out.println("Ended with: $" + finalTotal);
            System.out.println("");
            initialTotal = finalTotal;
        }
    }
    
}
