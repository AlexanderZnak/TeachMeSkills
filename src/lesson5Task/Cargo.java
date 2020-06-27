package lesson5Task;

public class Cargo extends Ground {
    private double lift;

    public double getLift() { return this.lift;}
    public void setLift(double lift) { this.lift = lift;}

    private void amountLift(int kg) {
        if (kg > getLift() * 1000.0)
            System.out.println("Вам нужен грузовик побольше");
        else
            System.out.println("Грузовик загружен");
    }

    public static void main(String[] args) {
        Cargo lorry = new Cargo(500, 180, 6000, "MAZ", 12, 25.4, 10);
        lorry.amountLift(9500);
        lorry.print();
    }

    @Override
    public void print() {
        super.print();
        System.out.printf("%d колеса, %.1f л/100км, %.1f Т, %.1f кВ \n", getWheels(), getFuelOut(), getLift(), super.kw());
    }

    public Cargo(int power, int speed, int weight, String brand, int wheels, double fuelOut, int lift) {
        super(power, speed, weight, brand, wheels, fuelOut);
        this.lift = lift;
    }
}
