package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;

public class CharacterCounter {
    public static void CountChar(String input) {
        // method takes string input
        // method loops through each character (creates character array)
        // creates a collection to hold the following: character:score

        char[] characters = input.toCharArray();
        HashMap<Character, Integer> scores = new HashMap<>();

        for(char letter : characters) {
            if(!scores.containsKey(letter)) {
                scores.put(letter, 1);
            } else {
                scores.put(letter, (scores.get(letter) + 1));
            }
        }

        for (Map.Entry<Character, Integer> score : scores.entrySet()) {
            System.out.println(String.format("%s: %s", score.getKey(), score.getValue()));
        }
    }

}
