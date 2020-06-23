package lesson3TaskInAdditional;

import java.util.Arrays;
import java.util.Random;

public class Task2Add {
    public static void main(String[] args) {
        Random r = new Random();
        int[] numbers = new int[r.nextInt(10) + 1];
        int sum = 0;
        int count = 0;
        for (int a = 0; a < numbers.length; a++) {
            numbers[a] = r.nextInt(10);
            if (a % 2 != 0 & a != 0) {
                sum += numbers[a];
                count++;
            }
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println((double)sum / count);
    }
}
