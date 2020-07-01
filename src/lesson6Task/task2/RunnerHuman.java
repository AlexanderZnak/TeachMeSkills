package lesson6Task.task2;

import lesson6Task.task2.coat.*;
import lesson6Task.task2.pants.*;
import lesson6Task.task2.shoes.*;

public class RunnerHuman {
    public static void main(String[] args) {
        ICoat coat = new AdidasCoat("Lake", 120);
        IPants pants = new NikePants("Mountain", 70);
        IShoes shoes = new NikeShoes("Air", 41);
        IHuman jack = new Human("Jack", coat, pants, shoes);
//        ICoat coat1 = new NikeCoat("River", 125);
//        IPants pants1 = new AdidasPants("Cloud", 74);
//        IShoes shoes1 = new AdidasShoes("Original", 43);
//        IHuman bill = new Human("Bill", coat1, pants1, shoes1);
        //как вариант
        IHuman bill = new Human("Bill", new NikeCoat("River", 125),
                new AdidasPants("Cloud", 74), new AdidasShoes("Original", 43));
        jack.putOnAll();
        bill.putOnAll();
        jack.putOffAll();
        bill.putOffAll();
    }
}
