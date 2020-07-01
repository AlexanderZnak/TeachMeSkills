package lesson6Task.task3;

import java.util.Random;

public class Nasa implements IStart {
    private String name;

    public Nasa(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean preStart() {
        Random r = new Random();
        int a = r.nextInt(11);
        if (a > 5) {
            return true;
        }
        else
            return false;
    }

    @Override
    public void engineOn() {
        System.out.println("Двигатели Nasa запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт Nasa");
    }
}
