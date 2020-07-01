package lesson6Task.task2.coat;

public class NikeCoat implements ICoat {
    private String name;
    private int size;

    public NikeCoat(String name, int size) {
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
        System.out.println("Nike coat is on");
    }

    @Override
    public void putOff() {
        System.out.println("Nike coat is off");
    }

}
