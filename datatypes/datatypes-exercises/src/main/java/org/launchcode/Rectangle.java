package org.launchcode;
import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, what is the length of your rectangle:");
        int length = input.nextInt();
        System.out.println("What is the width of your rectangle:");
        int width = input.nextInt();
        System.out.println("The area of the rectangle is: " + (length * width));
    }
}
