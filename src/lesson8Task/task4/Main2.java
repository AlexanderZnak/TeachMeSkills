package lesson8Task.task4;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main2 {
    public static void main(String[] args) {
        try(ObjectInputStream input = new ObjectInputStream(new FileInputStream("src\\lesson8Task\\task4\\save.txt"))) {
            Auto bmw = (Auto)input.readObject();
            System.out.println(bmw);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        catch (ClassNotFoundException a) {
            a.printStackTrace();
        }
    }
}
