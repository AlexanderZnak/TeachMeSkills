package lesson9Task.shop;

import java.util.Comparator;

public class ComporatorForStuff implements Comparator<Stuff> {
    @Override
    public int compare(Stuff a, Stuff b) {
        return a.getPrice() - b.getPrice();
    }
}
