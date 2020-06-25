package lesson3Task;

import java.util.Scanner;

public class Game {
    static String[][] game;
    public static void main(String[] args) {
        String[][] game = new String[3][3];
        for (int i = 0; i < game.length; i++) {
            for (int a = 0; a < game[0].length; a++) {
                game[i][a] = "-";
            }
        }
        System.out.println("Игра началась!!!");
        printFirst();
        moveFirst();
        printSecond();
        moveSecond();
        print();

    }
    static void moveFirst() {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        game[x][y] = "Y";
    }

    static void moveSecond() {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        game[x][y] = "Y";
    }

    static void print() {
        for (int i = 0; i < game.length; i++) {
            for (int a = 0; a < game[0].length; a++) {
                System.out.print(game[i][a] + " ");
            }
            System.out.println();
        }
    }
    static void printFirst() {
        System.out.println("Ход игрока №1");
        for (int i = 0; i < game.length; i++) {
            for (int a = 0; a < game[0].length; a++) {
                if (game[i][a] == "X" | game[a][i] == "X" | game[i][i] == "X" | game[i][game.length -1 -i] == "X")
                    System.out.println("Игрок №1 победил, игра окончена.");
            }
        }
    }
    static void printSecond() {
        System.out.println("Ход игрока №2");
        for (int i = 0; i < game.length; i++) {
            for (int a = 0; a < game[0].length; a++) {
                if (game[i][a] == "Y" | game[a][i] == "Y" | game[i][i] == "Y" | game[i][game.length -1 -i] == "Y")
                    System.out.println("Игрок №2 победил, игра окончена.");
            }
        }
    }
}
