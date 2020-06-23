package lesson3Task;

public class Task2 {
    public static void main(String[] args) {
        int [] numbers = new int[50];
        for (int a = 0; a < numbers.length; a++) {
            numbers[a] = a * 2 + 1;
            System.out.print(numbers[a] + " ");
        }
        System.out.println();
        for (int a = numbers.length - 1; a >= 0; a--)
            System.out.print(numbers[a] + " ");
    }
}
