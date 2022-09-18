package com.sda;


public class Exercise22 {
    // Napisz własną funkcję realizującą potęgowanie bez użycia operatorów mnożenia i dzielenia.

    public static void main(String[] args) {
        System.out.println(pow(5, 2));
    }


    public static double pow(int n, int p) {
        return Math.pow(n, p);
    }
}
