package chapter1;

public class Question4 {

    /*
        Palindrome Permutation: Given a string, write a function to check if it is a permutation of a palindrome. A
        palindrome is a word or phrase that is the same forwards and backwards. A permutation is a re-arrangement of
        letters. The palindrome does not need to be limited to dictionary words.
     */

    public static void main(String[] args) {

    }

    private static boolean isPalindrome(String input) {
        // Can palindrome strings be even length? -> Assume yes as long as the middle two chars are the same
        String inputLC = input.toLowerCase();

        // Count the occurrences of the string, then add together based on looking up half the values.
        int[] letters = new int[128];
        for (int i = 0; i < input.length(); i++) {
            letters[input.charAt(i)]++;
        }

        if (input.length() % 2 == 0) {
            // String is even length - all characters have a match

        } else {
            // String is odd length - one character can not have match
        }

        return false;
    }
}
