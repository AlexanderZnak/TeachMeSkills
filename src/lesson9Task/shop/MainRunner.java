package lesson9Task.shop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainRunner {
    public static void main(String[] args) {
        Market euroOpt = new Market();
        Stuff bread = new Stuff(4, "Bread", 13);
        Stuff milk = new Stuff(3, "Milk", 8);
        Stuff cheese = new Stuff(6, "Cheese", 6);
        Stuff cake = new Stuff(5, "Cake", 4);
        euroOpt.addList(bread);
        euroOpt.addList(milk);
        euroOpt.addList(cheese);
        euroOpt.addList(cake);
        ComporatorForStuff comp = new ComporatorForStuff();
        Collections.sort(euroOpt.getList(), comp);
        for (Stuff stuff : euroOpt.getList()) {
            System.out.println(stuff);
        }
        System.out.println("-------------");
        euroOpt.deleteStuff(3);
        Collections.reverse(euroOpt.getList());
        for (Stuff stuff : euroOpt.getList()) {
            System.out.println(stuff);
        }
        System.out.println("-------------");
        euroOpt.getRewrite(cake);
        for (Stuff stuff : euroOpt.getList()) {
            System.out.println(stuff);
        }



    }
}
