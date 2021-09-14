/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Brooks McKinley
 */

package com.brooksmckinley;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Press C to convert from Fahrenheit to Celsius.\n" +
                "Press F to convert from Celsius to Fahrenheit.");
        String choice = "";
        while (!choice.equals("C") && !choice.equals("F")) {
            System.out.print("Your choice: ");
            choice = scan.nextLine().toUpperCase();
        }
        System.out.print("Please enter the temperature in " + (choice.equals("C") ? "Fahrenheit" : "Celsius") + ": ");
        double temp = scan.nextDouble();
        System.out.println("The temperature in " + (choice.equals("C") ? "Celsius" : "Fahrenheit") + " is " +
                (choice.equals("C") ? toCelsius(temp) : toFahrenheit(temp)) + ".");
    }

    public static double toCelsius(double temp) {
        return (temp - 32) * (5.0 / 9.0);
    }

    public static double toFahrenheit(double temp) {
        return (temp * 9.0 / 5.0) + 32;
    }
}