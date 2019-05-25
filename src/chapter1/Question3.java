package chapter1;

public class Question3 {

    /*
       Write a method to replace all spaces in a string with '%20'. You may assume that the string has sufficient
       space at the end to hold the additional characters, and that you are given the "true" length of the string.

       Note: if implementing in Java please use a char array so that you can perform this operation in place.
     */

    private static final char WHITESPACE = ' ';

    public static void main(String[] args) {
        System.out.println("urlify: " + urlify("Mr John Smith    ", 13));
        System.out.println("urlify: " + urlify("Adam  is   smrt.          ", 16));
    }

    private static String urlify(String s, int trueLength) {
        char[] url = new char[s.length()];
        int ind = 0;
        for (int i = 0; i < trueLength; i++) {
            char c = s.charAt(i);
            if (WHITESPACE == c) {
                url[ind++] = '%';
                url[ind++] = '2';
                url[ind++] = '0';
            } else {
                url[ind++] = c;
            }
        }
        return new String(url);
    }
}
