package lesson4Task;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    private String processor;
    private String ram;
    private String hdd;
    private int resource;
    //private static int count = 0;

    public Computer(String processor, String ram, String hdd, int resource) {
        this.processor = processor;
        this.ram = ram;
        this.hdd = hdd;
        this.resource = resource;
    }

    public void print() {
        System.out.printf("Название процессора: %s, объем оперативной памяти: %s, объем жесткого диска: %s, ресурс включений и выключений: %d", processor, ram, hdd, resource);
    }

    public void switchOn() {
        Random r = new Random();
        int x = r.nextInt(2);
        Scanner scan = new Scanner(System.in);
        int y = scan.nextInt();
        if (y == x) {
            System.out.println("Компьютер включился");
            resource--;
        }
        else {
            System.out.println("Компьютер сгорел, ему капец");
        }
    }

    public void switchOff() {
        Random r = new Random();
        int x = r.nextInt(2);
        Scanner scan = new Scanner(System.in);
        int y = scan.nextInt();
        if (y == x) {
            System.out.println("Компьютер выключился");
            resource--;
        }
        else
            System.out.println("Компьютер сгорел, ему капец");
    }
    public void limitResource() {
        if (resource  == 0) {
            System.out.println("Ресурс компьютера исчерпан, он сгорел");
        }
    }

    public static void main(String[] args) {
        Computer comp = new Computer("Intel", "4gb", "500gb", 3);
        comp.print();
        comp.switchOn();
        comp.switchOff();
        comp.limitResource();
    }


}
