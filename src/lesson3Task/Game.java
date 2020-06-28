package lesson3Task;

import java.util.Scanner;

public class Game {
    private static String[][] game = new String[3][3];
    private static Scanner scanner = new Scanner(System.in);
    private static boolean x = true;

    public static void main(String[] args) {
        System.out.println("Игра началась!!!");
        make();
        while (x) {
            print();
            moveFirst();
            print();
            moveSecond();
        }
    }

    public static void make() {
        for (int i = 0; i < game.length; i++) {
            for (int a = 0; a < game[0].length; a++) {
                game[i][a] = "-";
            }
        }
    }

    public static void moveFirst() {
        if ((game[0][0].equals("O") & game[0][1].equals("O") & game[0][2].equals("O")) | (game[0][0].equals("O") & game[1][1].equals("O") & game[2][2].equals("O")) | (game[0][2].equals("O") & game[1][1].equals("O") & game[2][0].equals("O")) | (game[0][0].equals("O") & game[1][0].equals("O") & game[2][0].equals("O")) | (game[2][0].equals("O") & game[2][1].equals("O") & game[2][2].equals("O")) | (game[0][2].equals("O") & game[1][2].equals("O") & game[2][2].equals("O")) | (game[0][1].equals("O") & game[1][1].equals("O") & game[2][1].equals("O"))){
            System.out.println("Игра окончена, Игрок №2 ПОБЕДИЛ!!!");
            x = false;
        }
        else {
            System.out.println("Ход игрока № 1");
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            if (game[x][y].equals("O") | game[x][y].equals("X")) {
                System.out.println("Эта клетка занята, у вас проблемы со зрением и восприятием, ход передается вашему оппоненту");
            }
            else
                game[x][y] = "X";
        }
    }

     public static void moveSecond() {
         if ((game[0][0].equals("X") & game[0][1].equals("X") & game[0][2].equals("X")) | (game[0][0].equals("X") & game[1][1].equals("X") & game[2][2].equals("X")) | (game[0][2].equals("X") & game[1][1].equals("X") & game[2][0].equals("X")) | (game[0][0].equals("X") & game[1][0].equals("X") & game[2][0].equals("X")) | (game[2][0].equals("X") & game[2][1].equals("X") & game[2][2].equals("X")) | (game[0][2].equals("X") & game[1][2].equals("X") & game[2][2].equals("X")) | (game[0][1].equals("X") & game[1][1].equals("X") & game[2][1].equals("X"))){
             System.out.println("Игра окончена, Игрок №1 ПОБЕДИЛ!!!");
             x = false;
         }
         else {
             System.out.println("Ход игрока № 2");
             int x = scanner.nextInt();
             int y = scanner.nextInt();
             if (game[x][y].equals("X") | game[x][y].equals("O")) {
                 System.out.println("Эта клетка занята, у вас проблемы со зрением и восприятием, ход передается вашему оппоненту");
             }
             else
                 game[x][y] = "O";
         }
    }

    public static void print() {
        for (int i = 0; i < game.length; i++) {
            for (int a = 0; a < game[0].length; a++) {
                System.out.print(game[i][a] + " ");
            }
            System.out.println();
        }
    }
}
