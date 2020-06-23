package lesson3TaskInAdditional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Task10Add {
    public static void main(String[] args) {
        Random r = new Random();
        int max = Integer.MIN_VALUE;
        int indexMax = 0;
        int[] numbers = new int[r.nextInt(10) + 1];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = r.nextInt(10);
            if (numbers[i] > max) {
                max = numbers[i];
                indexMax = i;
            }
        }
        System.out.println(Arrays.toString(numbers));
        int[] copy = new int[numbers.length];
        System.arraycopy(numbers, 0, copy, 0, numbers.length);
        numbers[0] = numbers[indexMax];
        numbers[indexMax] = copy[0];
        System.out.println(Arrays.toString(numbers));
    }
}
