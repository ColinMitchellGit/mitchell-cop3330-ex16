/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Colin Mitchell
 */

package org.example;
import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.print("What is your age? ");
        String age_string = input.nextLine();

        int age = parseInt(age_string);

        System.out.println((age >= 16) ? "You are old enough to legally drive." : "You are not old enough to legally drive.");
    }
}
