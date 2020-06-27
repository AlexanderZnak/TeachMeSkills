package lesson5Task;

public class Automobile extends Ground {
    private String body;
    private int passengerOfAuto;

    public String getBody() { return this.body;}
    public void setBody(String body) { this.body = body;}
    public int getPassengerOfAuto() { return this.passengerOfAuto;}
    public void setPassengerOfAuto(int passengerOfAuto) { this.passengerOfAuto = passengerOfAuto;}

    public Automobile(int power, int speed, int weight, String brand, int wheels, double fuelOut, String body, int passengerOfAuto) {
        super(power, speed, weight, brand, wheels, fuelOut);
        this.body = body;
        this.passengerOfAuto = passengerOfAuto;
    }

    public static void main(String[] args) {
        Automobile bmw = new Automobile(300, 350, 2500, "BMW", 4, 11, "седан", 4);
        bmw.rangeAndFuelOut(4.5);
        bmw.print();
    }

    private void rangeAndFuelOut(double hours) {
        System.out.printf("За время %.1f ч, автомобиль %s, двигаясь с максимальной скоростью %d км/ч проедет %.1f км и израсходует %.1f литров топлива. \n", hours, getBrand(), getSpeed(), getSpeed() * hours, getFuelOut() * ((getSpeed() * hours) / 100.0));
    }

    @Override
    public void print() {
        super.print();
        System.out.printf("%d колеса, %.1f л/100км, %s кузов, %d пассажира, %.1f кВ \n", getWheels(), getFuelOut(), getBody(), getPassengerOfAuto(), super.kw());
    }
}
