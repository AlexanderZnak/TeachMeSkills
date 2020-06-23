package lesson3TaskInAdditional;

import java.util.Random;

public class Task9Add {
    public static void main(String[] args) {
        Random r = new Random();
        int[] numbers = new int[r.nextInt(10) + 1];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = r.nextInt(10);
            if (i % 2 == 0 & i != 0) {
                if (numbers[i] < min)
                    min = numbers[i];
            }
        }
        System.out.println(min);
    }
}
