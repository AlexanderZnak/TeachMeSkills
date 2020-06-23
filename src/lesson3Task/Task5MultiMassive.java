package lesson3Task;

import java.util.Random;
import java.util.Scanner;

public class Task5MultiMassive {
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
        int[][] copy = new int[numbers.length][numbers.length];
        for(int i = 0; i < numbers.length; i++)
            for(int j = 0; j < numbers.length; j++)
                copy[i][j] = numbers[i][j];

        System.out.println("*********************");
        for (int i = 0; i < numbers.length; i++) {
            for (int a = 0; a < numbers.length; a++) {
                numbers[a][i] = copy[i][a];
                numbers[i][a] = copy[a][i];
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            for (int a = 0; a < numbers[0].length; a++) {
                if (Integer.toString(numbers[i][a]).length() == 1) {
                    System.out.print(" " + numbers[i][a] + " ");
                } else {
                    System.out.print(numbers[i][a] + " ");
                }
            }
            System.out.println();
        }
    }
}

