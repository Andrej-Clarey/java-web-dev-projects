package org.example;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        String str = "If the product of two terms is zero then common" +
                " sense says at least one of the two terms has to be zero" +
                " to start with. So if you move all the terms over to one side," +
                " you can put the quadratics into a form that can be factored allowing " +
                "that side of the equation to equal zero. Once you’ve done that," +
                " it’s pretty straightforward from there.";
        char[] charactersInString = str.toCharArray();
        HashMap<Character, Integer> letterCount = new HashMap<>();
        for (char i : charactersInString){
            if (letterCount.containsKey(i)){
                letterCount.put(i, letterCount.get(i) + 1);
            }else{
                letterCount.put(i, 1);
            }
        }
        for(Map.Entry<Character, Integer> letterCounts : letterCount.entrySet()){
            System.out.println(letterCounts.getKey() +":"+ letterCounts.getValue());
        }
        System.out.println(letterCount);
    }
}