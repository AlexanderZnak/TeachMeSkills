package lesson3Task;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int [] numbers = new int[15];
        Random r = new Random();
        int amount = 0;
        for(int a = 0; a < numbers.length; a++) {
            numbers[a] = r.nextInt(100);
            if (numbers[a] % 2 == 0) {
                amount++;
            }
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(amount);
    }

}
