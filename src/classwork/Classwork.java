package classwork;

import java.util.Scanner;

public class Classwork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int max = 0;
        int [][] numbers = new int[a][b];
        for (int x = 0; x < a; x++) {
            for (int y = 0; y < b; y++) {
                if (numbers[x][y] < max)
                    max = numbers[x][y];
            }
        }
        System.out.println(max);
    }
}
