package com.sda;


public class Exercise29 {


    //  Napisz program obliczający różnicę pomiędzy największą i najmniejszą wartością z tablicy.
    //  Tablica wejściowa: [20, 20, 30, 40, 50, 50, 50],
    //  wynik: 50 - 20 = 30


    public static void main(String[] args) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int[] arr = new int[]{20, 20, 30, 40, 50, 50, 50};

        for (int num : arr) {

            if (num > max) {
                max = num;
            }

            if (num < min) {
                min = num;
            }
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Result: " + (max - min));
    }
}
