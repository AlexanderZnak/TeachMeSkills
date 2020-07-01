package lesson6Task.task3;

public class RocketsRun {
    public static void main(String[] args) throws InterruptedException {
        Cosmodrome cos = new Cosmodrome(new Shuttle("Tiger"));
        cos.starting();
        Cosmodrome cos1 = new Cosmodrome(new SpaceX("Alpha"));
        cos1.starting();
        Cosmodrome cos2 = new Cosmodrome(new Nasa("Omega"));
        cos2.starting();

    }
}
