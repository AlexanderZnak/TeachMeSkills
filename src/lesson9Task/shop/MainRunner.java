package lesson9Task.shop;

import java.util.ArrayList;
import java.util.List;

public class MainRunner {
    public static void main(String[] args) {
        Market euroOpt = new Market();
        Stuff bread = new Stuff(4, "Bread", 1);
        Stuff milk = new Stuff(3, "Milk", 1);
        Stuff cheese = new Stuff(6, "Cheese", 3);
        euroOpt.addList(bread);
        euroOpt.addList(milk);
        euroOpt.addList(cheese);
        System.out.println(euroOpt.getList().indexOf(bread));
        for (Stuff stuff : euroOpt.getList()) {
            System.out.println(stuff);
        }
        euroOpt.deleteStuff(3);
    }
}
