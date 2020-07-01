package lesson6Task.task1;

public class SonyHead implements IHead {
    private int price;

    public SonyHead(int price) {
        this.price = price;
    }
    @Override
    public int getPrice() {return price;}
    public void setPrice(int price) {this.price = price;}

    @Override
    public void speak() {
        System.out.println("Говорит Sony голова");
    }
}
