package lesson7Task.String;

import java.util.Arrays;
import java.util.Scanner;

public class Task2Additional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String alpha = s.trim();
        String [] strings1 = alpha.split("[?!.,;:]");
        String str2 = String.join("", strings1);
        String [] strings = str2.split(" +");
        for (int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].substring(strings[i].length() - 1);
        }
        String result = String.join("", strings);
        System.out.println(result);
    }
}
