package chapter1;

import java.util.Arrays;

public class Question2 {
    public static void main(String[] args) {
        // Given two strings, write a method to decide if one is a permutation of the other.

        // Assume that a is a permutation of b iff a) are the same length b) contain exactly the same set of strings
        System.out.println("isPermutation: " + isPermutationEasy("apple", "plpae"));
        System.out.println("isPermutation: " + isPermutationEasy("apple", "plpaae"));
        System.out.println("isPermutation: " + isPermutationEasy("apple", "llpae"));

        System.out.println("isPermutation: " + isPermutationFull("apple", "plpae"));
        System.out.println("isPermutation: " + isPermutationFull("apple", "plpaae"));
        System.out.println("isPermutation: " + isPermutationFull("apple", "llpae"));
    }

    private static boolean isPermutationEasy(String one, String two) {
        if (one.length() != two.length())
            return false;
        return sortStringChars(one).equals(sortStringChars(two));
    }

    private static String sortStringChars(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    private static boolean isPermutationFull(String one, String two) {
        if (one.length() != two.length())
            return false;

        int[] letters = new int[128];

        // Go through first string and add at every index the letter corresponds to
        for (int i = 0; i < one.length(); i++) {
            letters[one.charAt(i)]++;
        }

        // Then go through second string and subtract. If the subtraction leads to value less than 0, they are not equal
        for (int i = 0; i < two.length(); i++) {
            letters[two.charAt(i)]--;
            if (letters[two.charAt(i)] < 0) {
                return false;
            }
        }

        return true;
    }

}
