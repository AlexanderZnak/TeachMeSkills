package lesson3Task;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] numbers = new int[20];
        for (int a = 0; a < numbers.length; a++) {
            numbers[a] = a;
            System.out.print(numbers[a] + " ");
        }
        System.out.println();
        for (int a = 0; a < numbers.length; a++) {
            if (numbers[a] % 2 != 0)
                numbers[a] = 0;
            System.out.print(numbers[a] + " ");
        }
    }
}
