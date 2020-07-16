package lesson9Task.shop;

public class Stuff {
    private int id;
    private String name;
    private int price;

    public Stuff(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Stuff(){}

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getPrice() {return price;}
    public void setPrice(int price) {this.price = price;}

    @Override
    public String toString() {
        return String.format("ID: %d, Name: %s, Price: %d$.", getId(), getName(), getPrice());
    }
}
