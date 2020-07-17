package lesson9Task.shop;

import java.util.ArrayList;
import java.util.List;

public class Market {
    List<Stuff> list = new ArrayList<>();

    public List<Stuff> getList() { return list;}

    public void addList (Stuff stuff) {
        for (int i = 0; i < list.size(); i++) {
            if (stuff.getId() != list.get(i).getId()) {
                list.add(stuff);
            }
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
        for (int i = 0; i < list.size(); i++) {
            if (stuff.equals(list.get(i))) {
//                stuff.setId();
            }
        }
    }

}
