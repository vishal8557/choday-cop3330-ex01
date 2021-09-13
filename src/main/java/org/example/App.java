package base;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Vishal Choday
 */

//Exercise 1 - Saying Hello
//Create a program that prompts for your name and prints a greeting using your name.

//Example Output
//What is your name? Brian
//Hello, Brian, nice to meet you!
//Constraint
//Keep the input, string concatenation, and output //separate.

import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        var ourscanner = new java.util.Scanner(System.in);
        System.out.print("What is your name? ");
        String name = ourscanner.nextLine();
        System.out.print("Hello, " +name+", nice to meet you!");
    }
}
