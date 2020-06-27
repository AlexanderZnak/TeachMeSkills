package lesson5Task;

public class Military extends Air {
    private boolean ejection;
    private int rockets;

    public boolean getEjection() { return this.ejection;}
    public void setEjection(boolean ejection) { this.ejection = ejection;}
    public int getRockets() { return this.rockets;}
    public void setRockets(int rockets) { this.rockets = rockets;}

    public Military(int power, int speed, int weight, String brand, int wings, int lengthOfTakeOff, boolean ejection, int rockets) {
        super(power, speed, weight, brand, wings, lengthOfTakeOff);
        this.ejection = ejection;
        this.rockets = rockets;
    }

    public static void main(String[] args) {
        Military mig29 = new Military(3000, 2500, 2500, "MIG29", 14, 60, true, 20);
        mig29.print();
        mig29.shoot();
        mig29.catapulting();
    }

    public void catapulting() {
        if (getEjection() == true)
            System.out.println("Катапультирование прошло успешно");
        else
            System.out.println("У вас нет такой системы");
    }

    public void shoot() {
        if (getRockets() != 0) {
            System.out.println("Ракета пошла…");
            rockets--;
        }
        else
            System.out.println("Боеприпасы отсутствуют");
    }

    @Override
    public void print() {
        super.print();
        System.out.printf("размах крыльев %d м, мин.взлет.полоса %d м, наличие системы катапультирования %b, количество ракет %d, %.1f кВ \n", getWings(), getLengthOfTakeOff(), getEjection(), getRockets(), super.kw());
    }
}
