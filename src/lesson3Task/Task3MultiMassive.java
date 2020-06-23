package lesson3Task;

import java.util.Random;
import java.util.Scanner;

public class Task3MultiMassive {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int amount = scan.nextInt();
        Random r = new Random();
        int[][] numbers = new int[amount][amount];
        int multiMain = 1;
        int multiSecond = 1;
        for (int i = 0; i < numbers.length; i++) {
            for (int a = 0; a < numbers[0].length; a++) {
                numbers[i][a] = r.nextInt(51);
                if (Integer.toString(numbers[i][a]).length() == 1) {
                    System.out.print(" " + numbers[i][a] + " ");
                }
                else
                {
                    System.out.print(numbers[i][a] + " ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < numbers.length; i++) {
            multiMain *= numbers[i][i];
            multiSecond *= numbers[i][numbers.length - i - 1];
        }
        //System.out.println(multiMain + " " + multiSecond);
        if (multiMain > multiSecond)
            System.out.println("Произведение главной диагонали больше, чем произведение побочной диагонали");
        else if (multiSecond > multiMain)
            System.out.println("Произведение побочной диагонали больше, чем произведение главной диагонали");
        else
            System.out.println("Произведение главной диагонали равно произведению побочной диагонали");
    }
}
