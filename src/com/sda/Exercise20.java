package com.sda;


public class Exercise20 {

    //    Na podstawie zadanych z konsoli wartości oraz znaku (*, $, #...) narysuj:
    //    Kwadrat pusty w środku z jedną przekątną

    public static void main(String[] args) {
        int len = 6;
        String sign = "* ";

        for (int i = 1; i <= len; i++) {

            for (int j = 1; j <= len; j++) {

                if (i == 1 || i == len) {
                    System.out.print(sign);
                    continue;
                }

                if (j == 1 || j == i || j == len) {
                    System.out.print(sign);
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();

        }

    }
}
