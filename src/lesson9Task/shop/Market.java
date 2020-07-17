package lesson9Task.shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Market {
    List<Stuff> list = new ArrayList<>();

    public List<Stuff> getList() { return list;}

    public void addList (Stuff stuff) {
        int x = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == stuff.getId()) {
                x++;
            }
        }
        if (x == 0) {
            list.add(stuff);
        }
    }

    public void deleteStuff(int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                list.remove(list.get(i));
            }
        }
    }

    public void getRewrite(Stuff stuff) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(stuff)) {
                stuff.setName(scanner.nextLine());////почему-то когда ставил эту строку логически между  setId и setPrice программа выкидывала ошибку...
                stuff.setId(scanner.nextInt());
                stuff.setPrice(scanner.nextInt());
            }
        }
    }

}
