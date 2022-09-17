package com.sda;

import java.util.Scanner;

public class Exercise7 {

    /*
     * 
     * 1. Wewnątrz pętli for (np. 5 razy) pobieraj produkt do kupienia i wyświetlaj
     * go na ekran w postaci:
     * „Dodałem do koszyka <nazwa>, to nasz <numer iteracji> produkt!”
     * 
     * 2. Stwórz pętle for, która wykona 5 iteracji.
     * Wewnątrz pętli pobieraj z konsoli dowolną wartość typu int.
     * Po wyjściu z pętli zwróć sumę tych wartości.
     * 
     * 3. Stwórz pętle wewnątrz pętli (pamiętaj o różnych nazwach zmiennych iterujących!).
     * Wyświetl wartości iteratorów w postaci: „<iterator nr 1> : <iterator nr 2>”.
     * 
     * 4. Wyświetl kwadrat składający się z samych gwiazdek „*”, których liczba (długość boku kwadratu) będzie równa podanej z konsoli wartości.
     * 
     * 5. Jak wyżej, ale znak, z którego będzie składał się kwadrat, również pobierz z konsoli.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            String product = scanner.next();
            System.out.printf("Dodałem do koszyka %s, to nasz %d produkt!\n", product, i);
        }



    }
}
