package lesson5Task;

public class Transport {
    private int power;
    private int speed;
    private int weight;
    private String brand;

    public int getPower() { return this.power;}
    public void setPower(int power) { this.power = power;}
    public int getSpeed() { return this.speed;}
    public void setMaxSpeed(int maxSpeed) { this.speed = maxSpeed;}
    public int getWeight() { return this.weight;}
    public void setWeight(int weight) { this.weight = weight;}
    public String getBrand() { return this.brand;}
    public void setBrand(String brand) { this.brand = brand;}

    public void print() {
        System.out.printf("Мощность %d л.с., макс.скорость %d км/ч, масса %d кг, марка %s, ", getPower(), getSpeed(), getWeight(), getBrand());
    }

    public double kw() {
        return getPower() * 0.74;
    }
    public Transport(int power, int speed, int weight, String brand) {
        this.power = power;
        this.speed = speed;
        this.weight = weight;
        this.brand = brand;
    }
}
