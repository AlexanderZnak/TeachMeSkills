package lesson5Task;

public class Air extends Transport {
    private int wings;
    private int lengthOfTakeOff;

    public int getWings() { return this.wings;}
    public void setWings(int wings) { this.wings = wings;}
    public int getLengthOfTakeOff() { return this.lengthOfTakeOff;}
    public void setLengthOfTakeOff(int lengthOfTakeOff) { this.lengthOfTakeOff = lengthOfTakeOff;}

    public Air(int power, int speed, int weight, String brand, int wings, int lengthOfTakeOff) {
        super(power, speed, weight, brand);
        this.wings = wings;
        this.lengthOfTakeOff = lengthOfTakeOff;
    }
}
