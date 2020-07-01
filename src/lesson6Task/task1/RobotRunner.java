package lesson6Task.task1;

public class RobotRunner {
    public static void main(String[] args) {
        IHand hand = new SamsungHand(25);
        IHead head = new SonyHead(150);
        ILeg leg = new ToshibaLeg(524);
        Robot terminator = new Robot(hand, head, leg);
        terminator.action();
        IHand secondHand = new ToshibaHand(245);
        IHead secondHead = new SamsungHead(24);
        ILeg secondLeg = new SonyLeg(52);
        Robot robocop = new Robot(secondHand, secondHead, secondLeg);
        robocop.action();
        IHand thirdHand = new SonyHand(25);
        IHead thirdHead = new ToshibaHead(35);
        ILeg thirdLeg = new SamsungLeg(532);
        Robot xRay = new Robot(thirdHand, thirdHead, thirdLeg);
        xRay.action();
        if (terminator.getPrice() > robocop.getPrice() & terminator.getPrice() > xRay.getPrice())
            System.out.println("Терминатор самый дорогой робот");
        else if (robocop.getPrice() > terminator.getPrice() & robocop.getPrice() > xRay.getPrice())
            System.out.println("Робокоп самый дорогой робот");
        else if (xRay.getPrice() > robocop.getPrice() & xRay.getPrice() > terminator.getPrice())
            System.out.println("XRay самый дорогой робот");
    }
}
