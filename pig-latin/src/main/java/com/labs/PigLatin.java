package com.labs;

import java.util.Scanner;

public class PigLatin {
    /**
     * Pig latin works as follows: every word has its first character moved to the end, and 'ay' is added to the end of the
     * word.
     *
     *     example:
     *     word = ordway
     *     pig = igpay
     *     latin = atinlay
     *
     * Take in a word and return the pig latin form. You will need to use the substring method of String to break
     * up the string.
     * String docs: https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
     *
     * @param in A string.
     * @return the pig latin form of in.
     */
    public String returnPigLatin(String in){
        if (in == null || in.isEmpty()) {
            return ""; // Handle null or empty input
        }
        
        if (in.length() == 1) {
            return in + "ay"; // Handle single-character words
        }

        // Option 1. Using substring
        return in.substring(1) + in.charAt(0) + "ay";

        // Option 2. Using StringBuilder.
        // StringBuilder pigLatin = new StringBuilder();
        // for (int i = 1; i < in.length(); i++) {
        //     pigLatin.append(in.charAt(i));
        // }
        // pigLatin.append(in.charAt(0));
        // pigLatin.append("ay");

        // return pigLatin.toString();
    }

    /**
     * Entry point of the application.
     *
     * @param args Command-line arguments.
     */
    public static void main(String[] args) {
        PigLatin pigLatinConverter = new PigLatin();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word to convert to Pig Latin (or type 'exit' to quit):");

        while (true) {
            System.out.print("> ");
            String input = scanner.nextLine();

            if ("exit".equalsIgnoreCase(input)) {
                System.out.println("Goodbye!");
                break;
            }

            String pigLatin = pigLatinConverter.returnPigLatin(input);
            System.out.println("Pig Latin: " + pigLatin);
        }

        scanner.close();
    }
}