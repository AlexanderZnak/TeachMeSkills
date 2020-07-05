package lesson7Task.String;

import java.util.Scanner;

public class Task1Additional {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        char[] chars = {'.', ',', '!', '?', ';', ':'};
        char[] charString = str.toCharArray();
        int countAll = 0;
        int countСomma = 0;
        for (int i = 0; i < chars.length; i++) {
            for (int a = 0; a < charString.length; a++) {
                if (charString[a] == chars[i]) {
                    countAll++;
                }
            }
        }
        for (int i = 0; i <charString.length; i ++) {
            if (charString[i] == chars[1]) {
               countСomma++;
            }
        }
        System.out.println(countAll + ", " + countСomma);
    }
}
