package lesson2Task;

public class Task2 {
    public static void main(String[] args) {
        int sumAmeba = 1;
        int a = 3;
        while (a <= 24) {
            sumAmeba += sumAmeba;
            a += 3;
        }
        //System.out.println(sumAmeba);
    }
}
