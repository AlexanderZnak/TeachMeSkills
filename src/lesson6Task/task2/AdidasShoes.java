package lesson6Task.task2;

public class AdidasShoes implements IShoes {
    private String name;
    int size;

    public AdidasShoes(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getSize() {return size;}
    public void setSize(int size) {this.size = size;}

    @Override
    public void putOn() {
        System.out.println("Adidas shoes is on");
    }

    @Override
    public void putOff() {
        System.out.println("Adidas shoes is off");
    }
}
