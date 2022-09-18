package com.sda;


public class Exercise24 {

    // Napisz program zamieniajacy kazdy char w Stringu na jego numeryczny odpowiednik z tablicy ASCII.
    public static void main(String[] args) {
        System.out.println(convertStringToASCII("ABCD"));
    }

    public static String convertStringToASCII(String text) {
        char[] array = text.toCharArray();

        text = "";
        StringBuilder sb = new StringBuilder(text);

        for (char c : array) {
            int asciiValue = c;
            sb.append(asciiValue).append(", ");
        }

        text = sb.toString();
        text = text.trim();
        text = text.substring(0, text.length() - 1);
        return text;
    }
}
