package lesson6Task.task1.hand;

public class ToshibaHand implements IHand {
    private int price;

    public ToshibaHand(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void upHands() {
        System.out.println("Руки Toshiba подняты");
    }
}
