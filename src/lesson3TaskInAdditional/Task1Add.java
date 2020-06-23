package lesson3TaskInAdditional;

import java.util.Arrays;
import java.util.Random;

public class Task1Add {
    public static void main(String[] args) {
        Random r = new Random();
        int[] numbers = new int[r.nextInt(10) + 1];
        int multi = 1;
        for (int a = 0; a < numbers.length; a++) {
            numbers[a] = r.nextInt(10);
            if (numbers[a] % 3 == 0 & numbers[a] != 0) {
                multi *= numbers[a];
            }
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(multi);
    }
}
