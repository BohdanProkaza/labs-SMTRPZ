package main.java.com.company;

import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    /*

    Знайти слова, символи в яких йдуть в порядку зростання їх кодів. На вхід поступає
рядок із словами. На виході – масив String.

     */

    public static void main(String[] args) {
        WordCalculation wordCalculation = new WordCalculation();
        System.out.println("Enter a sentence : ");
        System.out.println(Arrays.toString(wordCalculation.findIncrWords(enterString())));
    }

    private static String enterString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

}
