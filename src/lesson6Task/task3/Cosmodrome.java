package lesson6Task.task3;

public class Cosmodrome{

    public Cosmodrome() {}

    public void starting (IStart start) throws InterruptedException {
        if (start.preStart()) {
            start.engineOn();
            for (int i = 10; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(1000); //необязательно
            }
            start.start();
        }
        else
            System.out.printf("Предстартовая проверка %s провалена", start.getName());
    }
}
