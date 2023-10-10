package edu.guilford;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Counting Loop Example 
            // Suppose we deposit $1000 into a savings account. You add $100 at the end of each year, and the account has a compound interest rate of 3%.
            // What is the value of the account each year for the next 20 years? 
            
            // Initialize variables
        double startingCash = 1000;
        double interestRate = 0.03;
        double yearlyDeposit = 100;
        double currentCash = startingCash;

            // Counting loops need an "index" variable; what iteration of the loop are we currently in? We also need an "endpoint" variable; when
            // do we stop the loop? 
        int currentYear = 0; // we start at year 0
        int endYear = 20; // we stop at year 20

            // The counting loop
        while (currentYear <= endYear) {
            // Keep running as long as we haven't hit finalYear
            currentCash = (startingCash + yearlyDeposit * currentYear) * Math.pow(1 + interestRate, currentYear);
            System.out.println("At the end of year " + currentYear + ", the account balance =\t$" + String.format("%,.2f", currentCash));
            currentYear ++; // Make sure you increment the index! If you forget this step, the loop will never stop! 
        }    

    }
}
