package lesson6Task.task2;

public class RunnerHuman {
    public static void main(String[] args) {
        ICoat coat = new AdidasCoat("Lake", 120);
        IPants pants = new NikePants("Mountain", 70);
        IShoes shoes = new NikeShoes("Air", 41);
        Human jack = new Human("Jack", coat, pants, shoes);
        ICoat coat1 = new NikeCoat("River", 125);
        IPants pants1 = new AdidasPants("Cloud", 74);
        IShoes shoes1 = new AdidasShoes("Original", 43);
        Human bill = new Human("Bill", coat1, pants1, shoes1);
        jack.putOnAll();
        bill.putOnAll();
        jack.putOffAll();
        bill.putOffAll();
    }
}
