package main.java.com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class WordCalculation {
    public String [] findIncrWords(String str) {
        ArrayList<String> finalWords = new ArrayList<>();
        int counter = 1;
        for (String word : str.split(" ")) {
            for (int itteration = 0; itteration < word.length(); itteration++) {
                if (itteration + 1 != word.length() && word.charAt(itteration + 1) >= word.charAt(itteration)) {
                    counter++;
                    continue;
                }else break;

            }
            if (counter == word.length()) {
                finalWords.add(word);
            }
            counter=1;
        }
        String [] arr = new String[finalWords.size()];
        for (int itter = 0; itter < arr.length; itter++) {
            arr[itter] = finalWords.get(itter);
        }
        return arr;
    }
}
