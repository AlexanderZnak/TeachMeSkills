package lesson2Task;

public class Task1 {
    public static void main(String[] args) {
        double sum = 10.0;
        double x = 10.0;
        for (int a = 1; a < 7; a++) {
            x += x * 0.1;
            sum += x;
        }
        System.out.println(sum);
    }
}
