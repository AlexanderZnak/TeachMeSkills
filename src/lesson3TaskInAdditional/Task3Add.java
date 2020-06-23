package lesson3TaskInAdditional;

import java.util.Arrays;
import java.util.Random;

public class Task3Add {
    public static void main(String[] args) {
        Random r = new Random();
        int c = r.nextInt(10);
        int sum = 0;
        int count = 0;
        int[] numbers = new int[r.nextInt(10) + 1];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = r.nextInt(10);
            if (numbers[i] > c) {
                sum += numbers[i];
                count++;
            }
        }
        if ((double)sum / count > 0) {
            System.out.println((double) sum / count);
        }
        //System.out.println(Arrays.toString(numbers));
        //System.out.println(c);
    }
}
