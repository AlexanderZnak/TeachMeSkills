package lesson6Task.task1;

import lesson6Task.task1.hand.*;
import lesson6Task.task1.head.*;
import lesson6Task.task1.leg.*;

/*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */
public class RobotRunner {
    public static void main(String[] args) {
        IHand hand = new SamsungHand(25);
        IHead head = new SonyHead(150);
        ILeg leg = new ToshibaLeg(524);
        IRobot terminator = new Robot(hand, head, leg);
        terminator.action();
        IHand secondHand = new ToshibaHand(245);
        IHead secondHead = new SamsungHead(24);
        ILeg secondLeg = new SonyLeg(52);
        IRobot robocop = new Robot(secondHand, secondHead, secondLeg);
        robocop.action();
        IHand thirdHand = new SonyHand(25);
        IHead thirdHead = new ToshibaHead(35);
        ILeg thirdLeg = new SamsungLeg(532);
        IRobot xRay = new Robot(thirdHand, thirdHead, thirdLeg);
        xRay.action();
        if (terminator.getPrice() > robocop.getPrice() & terminator.getPrice() > xRay.getPrice()) {
            System.out.println("Терминатор самый дорогой робот");
        }
        else if (robocop.getPrice() > terminator.getPrice() & robocop.getPrice() > xRay.getPrice()) {
            System.out.println("Робокоп самый дорогой робот");
        }
        else if (xRay.getPrice() > robocop.getPrice() & xRay.getPrice() > terminator.getPrice()) {
            System.out.println("XRay самый дорогой робот");
        }
        /* если после if должна отработать одна строка, можно фигурные скобки опустить,
        *  но постарайтесь привыкать их указывать.
        *  забыв их указать при блоке кода, вы получите неожидаемый результат
        */
    }
}
