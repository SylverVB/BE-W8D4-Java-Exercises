package com.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class WordCountMap {
    /**
     * Processes a string containing multiple words and returns a map of word occurrences.
     * Each word is used as a key, and its frequency in the input string is the corresponding value.
     * 
     * The input string is split using spaces as delimiters, and each word is counted.
     * New words are added to the map with an initial count of 1, while existing words
     * have their count incremented accordingly.
     * 
     * @param words A string containing words separated by spaces.
     * @return A map where keys are words and values are their number of occurrences.
     */
    public Map<String, Integer> returnWordMap(String words){
        Map<String, Integer> wordCountMap = new HashMap<>();
        if (words == null || words.isEmpty()) {
            return wordCountMap;
        }
        
        String[] wordArray = words.split(" ");

        for (String word : wordArray) {
            // If the word is already a key in the map, increment its count
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                // Otherwise, add the word to the map with a count of 1
                wordCountMap.put(word, 1);
            }
        }

        return wordCountMap;
    }

    public static void main(String[] args) {
        // Create an instance of WordCountMap
        WordCountMap wcm = new WordCountMap();
        
        // Use Scanner to get input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string of words:");

        // Get the input string
        String input = scanner.nextLine();
        
        // Call returnWordMap to get the word count map
        Map<String, Integer> wordCountMap = wcm.returnWordMap(input);

        // Print the resulting word count map
        System.out.println("Word Count Map: " + wordCountMap);
        
        // Close the scanner
        scanner.close();
    }
}