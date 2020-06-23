package lesson3Task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n > 3) {
            int add = 0;
            ArrayList<Integer> list = new ArrayList<>();
            int[] numbers = new int[n];
            Random r = new Random();
            for (int a = 0; a < numbers.length; a++) {
                numbers[a] = r.nextInt(n);
                if (numbers[a] % 2 == 0 & numbers[a] != 0) {
                    add++;
                    list.add(numbers[a]);
                }
            }
            System.out.println(Arrays.toString(numbers));
            if (add > 0) {
                int[] second = new int[add];
                for (int a = 0; a < list.size(); a++) {
                    second[a] = list.get(a);
                }
                System.out.println(Arrays.toString(second));
            }

        }
        else
            System.out.println("Вы ввели не подходящее число.");
    }


    }
