package lesson6Task.task1;

public class Robot implements IRobot {
    private IHand hand;
    private IHead head;
    private ILeg leg;

    public Robot(IHand hand, IHead head, ILeg leg) {
        this.hand = hand;
        this.head = head;
        this.leg = leg;
    }

    public IHand getHand() {return hand;}
    public void setHand(IHand hand) {this.hand = hand;}
    public IHead getHead() {return head;}
    public void setHead(IHead head) {this.head = head;}
    public ILeg getLeg() {return leg;}
    public void setLeg(ILeg leg) {this.leg = leg;}

    @Override
    public void action() {
        hand.upHands();
        head.speak();
        leg.step();
    }

    @Override
    public int getPrice() {
        int price = hand.getPrice() + head.getPrice() + leg.getPrice();
        return price;
    }

}
