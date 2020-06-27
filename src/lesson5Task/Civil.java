package lesson5Task;

public class Civil extends Air {
    private int passengerOfFly;
    private boolean businessClass;

    public int getPassengerOfFly() { return this.passengerOfFly;}
    public void setPassengerOfFly(int passengerOfFly) { this.passengerOfFly = passengerOfFly;}
    public boolean getBusinessClass() { return this.businessClass;}
    public void setBusinessClass(boolean businessClass) { this.businessClass = businessClass;}

    public Civil(int power, int speed, int weight, String brand, int wings, int lengthOfTakeOff, int passengerOfFly, boolean businessClass) {
        super(power, speed, weight, brand, wings, lengthOfTakeOff);
        this.passengerOfFly = passengerOfFly;
        this.businessClass = businessClass;
    }

    public static void main(String[] args) {
        Civil ty134 = new Civil(1200, 1000, 4500, "TY134", 22, 150, 24, false);
        ty134.print();
        ty134.contain(23);
    }

    public void contain(int passenger) {
        if (passenger > getPassengerOfFly())
            System.out.println("Вам нужен самолет побольше");
        else
            System.out.println("Пассажиры на борту");
    }

    @Override
    public void print() {
        super.print();
        System.out.printf("размах крыльев %d м, мин.взлет.полоса %d м, %d пассажиров, наличие бизнесс класса %b, %.1f кВ \n", getWings(), getLengthOfTakeOff(), getPassengerOfFly(), getBusinessClass(), super.kw());
    }
}
