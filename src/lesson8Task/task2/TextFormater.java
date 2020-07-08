package lesson8Task.task2;

import java.io.*;

public class TextFormater {
    public static void main(String[] args) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("src\\lesson8Task\\task2\\example.txt"))) {
            String text = "You don't really like it man\nJust\nHello all\nWorld pop\nI yoy\nam mm\nProgrammer Like Boss\nLOL invisible man like you gug";
            writer.write(text);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("src\\lesson8Task\\task2\\copyExample.txt")); BufferedReader reader = new BufferedReader(new FileReader("src\\lesson8Task\\task2\\example.txt"))) {
            String s;
            while ((s = reader.readLine())!= null) {
                if (getAmount(s) >= 3 & getAmount(s) <= 5) {
                    writer.write(s + "\n");
                }
                else if (getPolidrome(s)) {
                    writer.write(s + "\n");
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int getAmount(String s) {
        String[] str = s.split(" ");
        return str.length;
    }

    public static boolean getPolidrome(String s) {
        String[] str = s.split(" ");
        for (int i = 0; i < str.length; i++) {
            if (str[i].equalsIgnoreCase(new StringBuffer(str[i]).reverse().toString())) {
                return true;
            }
        }
        return false;
    }
}
