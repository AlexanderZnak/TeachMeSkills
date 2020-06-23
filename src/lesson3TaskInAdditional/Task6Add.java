package lesson3TaskInAdditional;

import java.util.Arrays;
import java.util.Random;

public class Task6Add {
    public static void main(String[] args) {
        Random r = new Random();
        int[] numbers = new int[r.nextInt(10) + 2];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = r.nextInt(10);
        }
        System.out.println(Arrays.toString(numbers));
        boolean x = false;
        int i;
        for (int a = 0; a < numbers.length; a++) {
            for (i = a + 1; i < numbers.length; i++) {
                if (numbers[a] == numbers[i]) {
                    x = true;
                    System.out.println("Элементы массива различны");
                    break;
                }
            }
            if (x)
                break;
        }
    }
}
