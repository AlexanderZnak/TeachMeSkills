package task4;

public class Numbers {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        int c = -31;
        int count = 0;

        int[] numbers = new int[] {a, b, c};
        for (int x : numbers) {
            if (x > 0)
                count++;
        }

        /*if (a > 0)
            count++;
        if (b > 0)
            count++;
        if (c > 0)
            count++;*/
        // второй вариант решения
    }
}
