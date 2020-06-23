package lesson3Task;

public class Task1 {
    public static void main(String[] args) {
        int [] numbers = new int [10];

        for (int a = 0; a < numbers.length; a++) {
            numbers[a] = (a + 1) * 2;
            System.out.print(numbers[a] + " ");
        }
        System.out.println();
        for (int x : numbers)
            System.out.println(x);


    }
}
