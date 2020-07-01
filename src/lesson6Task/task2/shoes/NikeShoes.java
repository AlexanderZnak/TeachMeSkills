package lesson6Task.task2.shoes;

public class NikeShoes implements IShoes {
    private String name;
    int size;

    public NikeShoes(String name, int size) {
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
        System.out.println("Nike shoes is on");
    }

    @Override
    public void putOff() {
        System.out.println("Nike shoes is off");
    }
}
