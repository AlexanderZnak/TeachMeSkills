package lesson3TaskInAdditional;

import java.util.Arrays;
import java.util.Random;

public class Task4Add {
    public static void main(String[] args) {
        Random r = new Random();
        int[] numbers = new int[r.nextInt(10) + 1];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = r.nextInt(10);
            if (numbers[i] % 2 != 0 & numbers[i] != 0) {
                if (numbers[i] < min) {
                    min = numbers[i];
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(min);

    }
}
