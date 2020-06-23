package lesson3TaskInAdditional;

import java.util.Arrays;
import java.util.Random;

public class Task5Add {
    public static void main(String[] args) {
        Random r = new Random();
        int[] numbers = new int[r.nextInt(10) + 1];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = r.nextInt(10);
            if (i % 2 != 0 & i != 0) {
                numbers[i] = 0;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
