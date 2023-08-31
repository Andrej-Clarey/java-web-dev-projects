package org.example;

import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
            arr.add(13);
            arr.add(66);
            arr.add(42);
            arr.add(1216);
            arr.add(7);
            arr.add(8);
            arr.add(89);
            arr.add(69);
            arr.add(54);
            arr.add(10);
        System.out.println(Sum.sumEven(arr));

        ArrayList<String> arr1 = new ArrayList<>();
            arr1.add("bike");
            arr1.add("helmet");
            arr1.add("road");
            arr1.add("berry");
            arr1.add("deer");
            arr1.add("coffee");
            arr1.add("code");
            arr1.add("speed");
            arr1.add("water");
            arr1.add("puppy");
        System.out.println(Sum.word(arr1));

    }
}