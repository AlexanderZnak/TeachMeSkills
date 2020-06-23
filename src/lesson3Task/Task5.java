package lesson3Task;

import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] num1 = new int[5];
        int[] num2 = new int[5];
        int num1sum = 0;
        int num2sum = 0;
        for (int a = 0; a < num1.length; a++) {
            num1[a] = r.nextInt(16);
            System.out.print(num1[a] + " ");
            num1sum += num1[a];
        }
        System.out.println();
        System.out.println((double)num1sum/num1.length);
        for (int a = 0; a < num2.length; a++) {
            num2[a] = r.nextInt(16);
            System.out.print(num2[a] + " ");
            num2sum += num2[a];
        }
        System.out.println();
        System.out.println((double)num2sum/num2.length);
        if ((double)num1sum/num1.length > (double)num2sum/num2.length)
            System.out.println("Среднеарифмитеческое массива num1 больше, чем num2");
        else if ((double)num1sum/num1.length < (double)num2sum/num2.length)
            System.out.println("Среднеарифмитеческое массива num2 больше, чем num1");
        else
            System.out.println("Cреднеарифмитические вычисления num1 и num2 равны");


    }
}
