package com.deloitte.lab3.ex5;

import java.util.Scanner;

public class DisplayCharLineWord {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter a String to Check: ");
        String str1 = scan1.nextLine();

        StringBuffer buffr = new StringBuffer(str1);

        int characterCount = buffr.length();
        int wordCount = 0;
        int lineCount = 1; // Assuming the input starts with a line

        for (int i = 0; i < buffr.length(); i++) {
            char c = buffr.charAt(i);

            if (Character.isWhitespace(c)) {
                if (wordCount > 0) {
                    wordCount++;
                }
            } else {
                wordCount++;
            }

            if (c == '\n') {
                lineCount++;
            }
        }

        System.out.println("Character count: " + characterCount);
        System.out.println("Word count: " + wordCount);
        System.out.println("Line count: " + lineCount);

        scan1.close();
    }
}