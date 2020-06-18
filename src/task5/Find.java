package task5;

public class Find {
    public static void main(String[] args) {
        int a = 2;
        int b = -5;
        int c = 31;
        int plus = 0;
        int minus = 0;

        int[] numbers = new int[] {a, b, c};
        for (int x : numbers) {
            if (x > 0)
                plus++;
            if (x < 0)
                minus++;
        }
    }
}
