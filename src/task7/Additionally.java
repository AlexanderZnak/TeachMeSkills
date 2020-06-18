package task7;

public class Additionally {
    public static void main(String[] args) {
        int countProgrammer = 3000002;
        String x = "программист";
        String y = "программиста";
        String z = "программистов";
        if (countProgrammer % 10 == 0 | (countProgrammer % 10 >= 5 & countProgrammer % 10 <= 9))
            System.out.println(countProgrammer + " " + z);
        else if (countProgrammer % 10 == 1)
            System.out.println(countProgrammer + " " + x);
        else if (countProgrammer % 10 > 1 & countProgrammer % 10 < 5)
            System.out.println(countProgrammer + " " + y);

    }
}
