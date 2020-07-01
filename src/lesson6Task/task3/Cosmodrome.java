package lesson6Task.task3;

public class Cosmodrome{
    private IStart start;

    public Cosmodrome(IStart start) {
        this.start = start;
    }

    public IStart getStart() {
        return start;
    }

    public void setStart(IStart start) {
        this.start = start;
    }

    public IStart starting () throws InterruptedException {
        if (start.preStart()) {
            start.engineOn();
            for (int i = 10; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }
            start.start();
        }
        else
            System.out.printf("Предстартовая проверка %s провалена", start.getName());
        return start;
    }
}
