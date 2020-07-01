package lesson6Task.task1;

public class ToshibaHead implements IHead {
    private int price;

    public ToshibaHead(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {return price;}
    public void setPrice(int price) {this.price = price;}

    @Override
    public void speak() {
        System.out.println("Голова Toshiba говорит");
    }
}
