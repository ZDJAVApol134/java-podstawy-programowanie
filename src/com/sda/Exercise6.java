package com.sda;


import java.util.Scanner;

public class Exercise6 {


    /*
     * 1. Napisz prosty kalkulator, który:
     *
     * a) Przyjmuje dwie wartości x i y, zwraca ich sumę oraz różnicę.
     * Wykorzystaj funkcję printf albo String.format tak, aby znak „=„ i „+” oraz „-” były w tym samym miejscu jeden pod drugim.
     * Nie używaj metody nextInt().
     *
     * b) j/w + podawanie informacji, czy chcemy, aby dokonać dodawania, czy odejmowania poprzez napisanie „suma” lub „różnica”.
     * Wykorzystaj instrukcję warunkową if-else
     *
     * c) j/w + użytkownik może zdecydować jaką operację chce wykonać uwzględniając mnożenie i dzielenie.
     * Wykorzystaj instrukcję warunkową switch-case
     *
     * d) j/w + skorzystaj z „ternary operator” zamiast standardowej instrukcji if-else
     *
     * e) obsłuż sytuację, w której użytkownik poda wartość 0 podczas dzielenia.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose your option:\n 1 - Sum\n 2 - Subtraction\n 3 - Division \n 4 - Multiplication");

        byte option = scanner.nextByte();

        System.out.println("Enter x: ");
        double x = scanner.nextInt();

        System.out.println("Enter y: ");
        double y = scanner.nextInt();


        switch (option) {
            case 1:
                System.out.printf("Result: %.2f", x + y);
                break;
            case 2:
                System.out.printf("Result: %.2f", x - y);
                break;
            case 3:
                double result = x / y;
                if (result == Double.POSITIVE_INFINITY) {
                    System.err.println("Division by zero is not allowed");
                    break;
                }
                System.out.printf("Result: %.2f", result);
                break;
            case 4:
                System.out.printf("Result: %.2f", x * y);
                break;
            default:
                System.err.println("Invalid option");
                break;
        }

    }
}
