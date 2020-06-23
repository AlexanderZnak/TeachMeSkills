package lesson3Task;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int enter = scan.nextInt();
        Random r = new Random();
        if (enter > 0 & enter % 2 == 0) {
            int sum1 = 0;
            int sum2 = 0;
            int[] numbers = new int[enter];
            for (int i = 0; i < numbers.length; i++)
                numbers[i] = r.nextInt(16);
            for (int a = 0; a < numbers.length/2; a++) {
                sum1 += numbers[a];
            }
            for (int a = numbers.length/2 ; a < numbers.length; a++) {
                sum2 += numbers[a];
            }
            System.out.println(Arrays.toString(numbers));
            //System.out.println(sum1);
            //System.out.println(sum2);
            if (sum1 > sum2)
                System.out.println("Сумма левой части массива больше, чем сумма правой части");
            else if (sum2 > sum1)
                System.out.println("Сумма правой части массива больше, чем сумма левой части");
            else
                System.out.println("Сумма левой части массива равна сумме правой части массива");
        }
        else
            System.out.println("Согласно условию задачи, массив с таким количеством элементов существовать не может");
    }
}
