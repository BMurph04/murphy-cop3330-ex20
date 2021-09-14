/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Brendon Murphy
 */
package org.example;
import java.util.Scanner;


public class App
{
    public static void main( String[] args )
    {
        //input
        Scanner input = new Scanner(System.in);

        System.out.println("What is the order amount?");
        double orderAmount = input.nextDouble();
        System.out.println("What state do you live in?");
        String state = input.next();

        //assigns a default string and cost to output to the user
        double totalCost = orderAmount;
        String output = String.format("The total is $%.2f.", totalCost);

        //checks to see if Wisconsin was inputted and changes output based on input
        if(state.equals("Wisconsin")){

            double taxRate = 0.05;

            //checks to see if user's county needs additional tax added
            System.out.println("What county do you live in?");
            input.nextLine();
            String county = input.nextLine();
            if(county.equals("Eau Claire")){
                taxRate += 0.005;
            }
            else if(county.equals("Dunn")){
                taxRate += 0.004;
            }
            double taxCost = orderAmount * taxRate;
            totalCost = orderAmount + taxCost;

            output = String.format("The tax is $%.2f. \nThe total is $%.2f.", taxCost, totalCost);
        }
        else if(state.equals("Illinois")){

            double taxRate = 0.08;

            double taxCost = orderAmount * taxRate;
            totalCost = orderAmount + taxCost;

            output = String.format("The tax is $%.2f. \nThe total is $%.2f.", taxCost, totalCost);
        }
        //output
        System.out.println(output);
    }
}