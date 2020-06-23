package lesson3TaskInAdditional;

import java.util.Arrays;
import java.util.Random;

public class Task8Add {
    public static void main(String[] args) {
        Random r = new Random();
        int[] numbers = new int[r.nextInt(10) + 1];
        for (int a = 0; a < numbers.length; a++) {
            numbers[a] = r.nextInt(10);
        }
        Arrays.sort(numbers);
        int previousMax = numbers[numbers.length -2];
        //System.out.println(previousMax);
    }
}
