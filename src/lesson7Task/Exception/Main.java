package lesson7Task.Exception;


public class Main {
    public static void main(String[] args) {
        Car bmw = new Car("BMW", 240, 12000);
        Car reno = new Car("Renault", 180, 8000);
        Car mazda = new Car("MAZDA", 200, 9000);
        try {
            bmw.getStart();
            reno.getStart();
            mazda.getStart();
        }
        catch (MyException e) {
            e.printStackTrace();
        }
    }
}
