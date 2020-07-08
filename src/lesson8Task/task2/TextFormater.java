package lesson8Task.task2;

import java.io.*;

public class TextFormater {
    public static void main(String[] args) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("src\\lesson8Task\\task2\\example2.txt"))) {
            String text = "Hello\nWorld\nI\nam\nProgrammer\nLOL";
            writer.write(text);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("src\\lesson8Task\\task2\\copy2.txt")); BufferedReader reader = new BufferedReader(new FileReader("src\\lesson8Task\\task2\\example2.txt"))) {
            String s;
            while ((s = reader.readLine())!= null) {
                if (getPolidrome(s)) {
                    writer.write(s + "\n");
                }
                else if (getAmount(s) >= 3 & getAmount(s) <= 5) {
                    writer.write(s + "\n");
                }

            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int getAmount(String s) {
        return s.length();
    }

    public static boolean getPolidrome(String s) {
        if (s.equalsIgnoreCase(new StringBuffer(s).reverse().toString()))
            return true;
        else
            return false;
    }
}
