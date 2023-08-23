package org.example;
import java.util.ArrayList;

public class Sum {
    public static int sumEven(ArrayList<Integer> arr) {

        int total = 0;
        for(int integer : arr){
            if (integer % 2 == 0){
                total += integer;
            }
        }
        return total;
    }

    public static ArrayList word(ArrayList<String> arr1) {
        ArrayList<String> fiveLetterWords = new ArrayList<>();
       for(String str : arr1){
           if(str.length() == 5){
               fiveLetterWords.add(str);
           }
       }
       return fiveLetterWords;
    }
}
