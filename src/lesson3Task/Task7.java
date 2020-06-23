package lesson3Task;

import java.util.Arrays;
import java.util.Random;

public class Task7 {
    public static void main(String[] args) {
        Random r = new Random();
        int [] numbers = new int[12];
        int max = 0;
        int indexMax = 0;
        for (int a = 0; a < numbers.length; a++) {
            numbers[a] = r.nextInt(16);
            if (numbers[a] > max) {
                max = numbers[a];
                indexMax = a;
            }
        }
        //System.out.println(Arrays.toString(numbers));
        //System.out.println(indexMax);

    }
}
