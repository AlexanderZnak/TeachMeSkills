package lesson6Task.task3;

import java.util.Random;

public class Shuttle implements IStart {
    private String name;

    public Shuttle(String name) {
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
        if (a > 3) {
            return true;
        }
        else
            return false;
    }

    @Override
    public void engineOn() {
        System.out.println("Двигатели Шатла запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт Шатла");
    }
}
