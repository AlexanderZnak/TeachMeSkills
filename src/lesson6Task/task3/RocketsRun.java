package lesson6Task.task3;

public class RocketsRun {
    public static void main(String[] args) throws InterruptedException {
        Cosmodrome cos = new Cosmodrome();

        IStart shuttle = new Shuttle("Tiger");
        cos.starting(shuttle);

        IStart spaceX = new SpaceX("Alpha");
        cos.starting(spaceX);

        IStart nasa = new Nasa("Omega");
        cos.starting(nasa);
    }
}
