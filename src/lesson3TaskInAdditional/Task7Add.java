package lesson3TaskInAdditional;

import java.util.Arrays;
import java.util.Random;

public class Task7Add {
    public static void main(String[] args) {
        Random r = new Random();
        int[] numbers = new int[r.nextInt(10) + 1];
        int count = 0;
        int value = r.nextInt(10);
        for (int a = 0; a < numbers.length; a++) {
            numbers[a] = r.nextInt(10);
            if (numbers[a] == value) {
                count++;
            }
        }
        if (count > 0)
            System.out.println("Заданное число: " + value + " встречается " + count + " раз.");
        else
            System.out.println("Заданное число: " + value + " не встречается.");

        System.out.println(Arrays.toString(numbers));

    }
}
