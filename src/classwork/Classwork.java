package classwork;

import java.util.Arrays;
import java.util.Scanner;

public class Classwork {
    public static void main(String[] args) {
        int[] array = {10, 2, 10, 3, 1, 2, 5};
        System.out.println(Arrays.toString(array));
        boolean itter = true;
        while (itter) {
            for (int i = 1; i < array.length - 1; i++) {
                if (array[i] < array[i - 1]) {
                    int tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                    itter = true;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
