package lesson2Task;

public class Task5 {
    public static void main(String[] args) {
        for (int a = 1; a <= 20; a++) {
            double inch = 2.54;
            String x = "дюйм", y = "дюйма", z = "дюймов";
            if (a == 1) {
                System.out.println(a + " " + x + " = " + (inch * a) + "см.");
            }
            else if (a > 1 & a < 5) {
                System.out.println(a + " " + y + " = " + (inch * a) + "см.");
            }
            else if (a > 4 & a <= 20) {
                System.out.println(a + " " + z + " = " + (inch * a) + "см.");
            }
        }
    }
}
