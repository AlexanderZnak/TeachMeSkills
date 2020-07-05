package lesson7Task.Exception;

import java.util.Random;

public class Car {
    private String brand;
    private int speed;
    private int price;

    public Car(String brand, int speed, int price) {
        this.brand = brand;
        this.speed = speed;
        this.price = price;
    }

    public Car() {}

    public String getBrand() {return brand;}
    public void setBrand(String brand) {this.brand = brand;}
    public int getSpeed() {return speed;}
    public void setSpeed(int speed) {this.speed = speed;}
    public int getPrice() {return price;}
    public void setPrice(int price) {this.price = price;}

    public void getStart() throws MyException {
        Random r = new Random();
        int a = r.nextInt(21);
        if (a % 2 == 0) {
            throw new MyException("You didn't guess a number");
        }
        else
            System.out.printf("Auto %s started\n", getBrand());
    }


}
