package com.sda;

import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {
        var number = new Scanner(System.in).nextInt();
        switch (number) {
            case 0:
                System.out.println("*");
                break;
            case 1:
                System.out.println("!");
                break;
            case 2:
                System.out.println("@");
                break;
            case 3:
                System.out.println("#");
                break;
            case 4:
                System.out.println("$");
                break;
            case 5:
                System.out.println("%");
                break;
            default:
                System.out.println("Number is invalid. Must be between 0-5");
        }

    }
}
