package lesson8Task.task4;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Auto bmw = new Auto("BMW", 240, 15000);
        System.out.println(bmw);
        try(ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("src\\lesson8Task\\task4\\save.txt"))) {
            output.writeObject(bmw);
        }
        catch (IOException e) {
            e.printStackTrace();
        }


    }
}
