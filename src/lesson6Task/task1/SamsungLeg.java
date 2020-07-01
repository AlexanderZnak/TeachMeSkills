package lesson6Task.task1;

public class SamsungLeg implements ILeg {
    private int price;

    public SamsungLeg(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {return price;}
    public void setPrice(int price) {this.price = price;}

    @Override
    public void step() {
        System.out.println("Ноги Samsung шагнули");
    }
}
