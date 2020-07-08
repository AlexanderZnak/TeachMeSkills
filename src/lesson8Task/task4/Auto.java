package lesson8Task.task4;

import java.io.Serializable;

public class Auto implements Serializable {
    private static final long serialVersionUID = 1;

    private String brand;
    private int speed;
    private int price;

    public Auto(String brand, int speed, int price) {
        this.brand = brand;
        this.speed = speed;
        this.price = price;
    }

    public String getBrand() {return brand;}
    public void setBrand(String brand) {this.brand = brand;}
    public int getSpeed() {return speed;}
    public void setSpeed(int speed) {this.speed = speed;}
    public int getPrice() {return price;}
    public void setPrice(int price) {this.price = price;}

    @Override
    public String toString() {
        return String.format("Brand: %s, maxSpeed: %d, price: %d$", getBrand(), getSpeed(), getPrice());
    }

}
