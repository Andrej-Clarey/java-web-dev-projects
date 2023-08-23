package org.launchcode;
import java.util.Scanner;

public class Miles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, how many miles did you travel:");
        double miles = input.nextDouble();
        System.out.println("How much gas did you use:");
        double gas = input.nextDouble();
        System.out.println("Your MPG is: " + (miles / gas));
    }
}
