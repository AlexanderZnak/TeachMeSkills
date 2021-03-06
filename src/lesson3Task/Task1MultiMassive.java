package lesson3Task;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1MultiMassive {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int amount = scan.nextInt();
        Random r = new Random();
        int[][] numbers = new int[amount][amount];
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int a = 0; a < numbers[0].length; a++) {
                numbers[i][a] = r.nextInt(51);
                if (Integer.toString(numbers[i][a]).length() == 1) {
                    System.out.print(" " + numbers[i][a] + " ");
                } else {
                    System.out.print(numbers[i][a] + " ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i][i] % 2 == 0) {
                sum += numbers[i][i];
            }
        }
        System.out.println(sum);
    }
}