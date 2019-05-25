package chapter1;

import java.util.HashSet;
import java.util.Set;

public class Question1 {

    public static void main(String[] args) {
        // Implement an algorithm to determine if a string has all unique characters

        System.out.println("isUnique: " + isUnique("adam") + " Expected: false");        // false
        System.out.println("isUnique: " + isUnique("dolphin") + " Expected: true");     // true
        System.out.println("isUnique: " + isUnique("pizza") + " Expected: false");       // false
        System.out.println("isUnique: " + isUnique("ibm") + " Expected: true");         // true
        System.out.println("isUnique: " + isUnique("atmosphEre") + " Expected: false");  // false
        System.out.println();

        // Implement the same algorithm without using data structures.
        System.out.println("isUnique: " + isUniqueNoStructures("adam") + " Expected: false");        // false
        System.out.println("isUnique: " + isUniqueNoStructures("dolphin") + " Expected: true");     // true
        System.out.println("isUnique: " + isUniqueNoStructures("pizza") + " Expected: false");       // false
        System.out.println("isUnique: " + isUniqueNoStructures("ibm") + " Expected: true");         // true
        System.out.println("isUnique: " + isUniqueNoStructures("atmosphEre") + " Expected: false");  // false
    }

    private static boolean isUnique(String word) {
        String wordLC = word.toLowerCase(); // assume uniqueness is case-insensitive
        Set<Character> characters = new HashSet<>();
        for (Character c : wordLC.toCharArray()) {
            characters.add(c);
        }
        return characters.size() == word.length();
    }

    private static boolean isUniqueNoStructures(String word) {
        String wordLC = word.toLowerCase();
        for (int i = 0; i < wordLC.length(); i++) {
            for (int j = i + 1; j < wordLC.length(); j++) {
                if (wordLC.charAt(i) == wordLC.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}
