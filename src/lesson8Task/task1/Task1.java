package lesson8Task.task1;

import java.io.*;

public class Task1 {
    public static void main(String[] args) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("src\\lesson8Task\\task1\\example.txt"))) {
            String text = "Hello\nWorld\nI\nam\nProgrammer\nLOL";
            writer.write(text);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        try(BufferedReader reader = new BufferedReader(new FileReader("src\\lesson8Task\\task1\\example.txt")); BufferedWriter writer = new BufferedWriter(new FileWriter("src\\lesson8Task\\task1\\copy.txt"))) {
            String s;
            while ((s = reader.readLine()) != null) {
                if (s.equalsIgnoreCase(new StringBuffer(s).reverse().toString())) {
                    writer.write(s + "\n");
                }
            }
        }
        catch (IOException e) {
            e.getMessage();
        }
    }
}
