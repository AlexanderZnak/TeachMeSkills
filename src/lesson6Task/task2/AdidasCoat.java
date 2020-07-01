package lesson6Task.task2;

public class AdidasCoat implements ICoat {
    private String name;
    int size;

    public AdidasCoat(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getSize() {return size;}
    public void setSize(int size) {this.size = size;}

    @Override
    public void putOn() {
        System.out.println("Adidas coat is on");
    }

    @Override
    public void putOff() {
        System.out.println("Adidas coat is off");
    }
}
