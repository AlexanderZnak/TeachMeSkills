package lesson3Task;

import java.util.Arrays;
import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        Random r = new Random();
        int [] number = new int[4];
        for (int a = 0; a < number.length; a++) {
            number[a] = r.nextInt(11);
        }
        System.out.println(Arrays.toString(number));
        for (int a = 0; a < number.length -1; a++) {
            if (number[a] >= number[a + 1]) {
                System.out.println("Массив не идет по возрастанию");
                break;
            }
        }
    }
}
