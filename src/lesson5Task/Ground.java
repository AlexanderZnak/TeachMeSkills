package lesson5Task;

public class Ground extends Transport {
    private int wheels;
    private double fuelOut;

    public int getWheels() { return this.wheels;}
    public void setWheels(int wheels) { this.wheels = wheels;}
    public double getFuelOut() { return this.fuelOut;}
    public void setFuelOut(double fuelOut) { this.fuelOut = fuelOut;}

    public Ground(int power, int speed, int weight, String brand, int wheels, double fuelOut) {
        super(power, speed, weight, brand);
        this.wheels = wheels;
        this.fuelOut = fuelOut;
    }
}
