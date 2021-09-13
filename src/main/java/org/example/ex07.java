/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 McGreggor Kennison
 */

package org.example;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex07 {

    // main
    public static void main(String[] args) {

        // set format, initialize variables, and compute area
        DecimalFormat df = new DecimalFormat("#.###");
        double conversion = 0.09290304;
        int length = getlength();
        int width = getwidth();
        int area_ft = length * width;
        double area_m = area_ft * conversion;

        // print output
        System.out.println("You entered dimensions of " + length + " feet by " + width + " feet.\n" +
                "The area is\n" +
                area_ft + " square feet\n" +
                df.format(area_m) + " square meters");

    }

    // gets length of room
    public static int getlength() {

        // prompt for input and return scan
        System.out.print("What is the length of the room in feet? ");
        Scanner input = new Scanner(System.in);
        return input.nextInt();

    }

    // gets width of room
    public static int getwidth() {

        // prompt for input and return scan
        System.out.print("What is the width of the room in feet? ");
        Scanner input = new Scanner(System.in);
        return input.nextInt();

    }
}
