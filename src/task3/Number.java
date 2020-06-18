package task3;

public class Number {
    public static void main(String[] args) {
        int a = 323;
        if (a > 0) {
            a += 1;
            System.out.println(a);
        }
        else if (a < 0) {
             a -= 2;
            System.out.println(a);
        }
        else {
            int b = a;
            b = 10;
            System.out.println(b);
        }
    }
}
