package com.sda;

public class Exercise1 {
/*

- Wprowadź dowolną wartość z kilkoma cyframi po przecinku do
zmiennej typu double.

- Wyświetl podaną wartość z dokładnością do dwóch miejsc
po przecinku. Uzyj funkcji System.out.printf().

- Wyświetl podaną wartość z dokładnością do 4 miejsc
 po przecinku. Uzyj funkcji System.out.println()
 oraz String.format().

*/

    public static void main(String[] args) {
        double num = 5.8932341;
        System.out.printf("%.2f\n", num);
        System.out.printf("%.4f\n", num);

        String formattedNum = String.format("%.4f", num);
        System.out.println(formattedNum);
    }

}
