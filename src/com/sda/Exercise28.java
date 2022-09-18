package com.sda;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise28 {

    //  Napisz program, który odwróci zawartość tablicy, np.

    //        [1, 10, 4, 5, 2, 12] -> [12, 2, 5, 4, 10, 1]
    //        [1, 2, 5, 3, 10] -> [10, 3, 5, 2, 1]

    public static void main(String[] args) {

        int arrSize = 6;
        int[] arr = new int[]{1, 10, 4, 5, 2, 12};
        int[] reversedArr = new int[arrSize];

        int counter = arrSize - 1;

        for (int element : arr) {
            reversedArr[counter--] = element;
        }

        System.out.println(Arrays.toString(reversedArr));

    }

}
