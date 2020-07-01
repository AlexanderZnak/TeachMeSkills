package lesson6Task.task1;

public class SonyHand implements IHand {
    private int price;

    public SonyHand(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {return price;}
    public void setPrice(int price) {this.price = price;}

    @Override
    public void upHands() {
        System.out.println("Руки Sony подняты");
    }
}
