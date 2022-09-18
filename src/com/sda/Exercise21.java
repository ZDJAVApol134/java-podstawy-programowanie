package com.sda;


public class Exercise21 {

    //    Na podstawie zadanych z konsoli wartości oraz znaku (*, $, #...) narysuj:
    //    Kwadrat pusty w środku z dwiema przekątnymi

    public static void main(String[] args) {
        int len = 10;
        String sign = "* ";

        for (int i = 1; i <= len; i++) {

            for (int j = 1; j <= len; j++) {

                if (i == 1 || i == len || j == 1 || j == i || j == len || j == len - i + 1) {
                    System.out.print(sign);
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

    }
}
