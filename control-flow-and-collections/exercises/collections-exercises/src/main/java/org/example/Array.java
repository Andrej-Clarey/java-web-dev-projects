package org.example;

public class Array {
    public static void main(String[] args) {
        int[] intergerArray = {1, 1, 2, 3, 5, 8};
        for(int i : intergerArray) {
            if(i % 2 ==1) {
                System.out.println(i);
            }
        }
    }
}