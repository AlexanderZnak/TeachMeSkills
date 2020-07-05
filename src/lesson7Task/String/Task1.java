package lesson7Task.String;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StringBuffer str = new StringBuffer(s.nextLine());
        System.out.println(str);
        String str1 = str.substring(0, str.length());
        System.out.println(str1);
    }
}
