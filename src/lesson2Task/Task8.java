package lesson2Task;

public class Task8 {
    public static void main(String[] args) {
        for (int a = 0; a < 4; a++) {
            for (int y = 0; y < a; y++) {
                System.out.print(" ");
            }
            for (int x = 4; x > a; x--) {
                System.out.print("*");
            }

            System.out.println("");
        }
        for (int a = 0; a < 4; a++) {
            for (int y = 3; y > a; y--) {
                System.out.print(" ");
            }
            for (int x = 0; x < a  + 1; x++) {
                System.out.print("*");
            }

            System.out.println("");
        }
    }
}
