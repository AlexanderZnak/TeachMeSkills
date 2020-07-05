package lesson7Task.String;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StringBuffer str = new StringBuffer(s.nextLine());
        System.out.println(str);
        char c = str.charAt(3);
        str.setCharAt(0, c);
        System.out.println(str);
    }
}
