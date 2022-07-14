package com.ironhack.bootcamp.exercices.s2;

public class StringChallengeMain {

    public static void main(String[] args) {

        String result;

        result = productFormatter("    Platanos de canarias", "20220714");
        System.out.println(result);
        /**
         * receives a String name productName and a String date as parameters. This method should return the productName
         * trimmed, change spaces by _, append the date at the end of the string and return the formatted product all
         * uppercase.
         * @param productName Name of your product
         * @param date the Date suffix
         * @return String with the desired product formatted.
         */

    }
    private static String productFormatter(String productName, String date) {
        // Implement this method
        String result = productName.trim().replace(' ', '_').concat(" ").concat(date).toUpperCase();
        return result;
    }
}
