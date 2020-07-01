package lesson6Task.task2.pants;

public class AdidasPants implements IPants {
    private String name;
    int size;

    public AdidasPants(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void putOn() {
        System.out.println("Adidas pants is on");
    }

    @Override
    public void putOff() {
        System.out.println("Adidas pants is off");
    }
}
