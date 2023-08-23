package org.launchcode;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, what is the radius of your circle:");
        double radius = input.nextDouble();
        double pi = 3.1415;
        System.out.println("The area of circle radius " + radius + " is "+ (pi * radius * radius));
    }
}
