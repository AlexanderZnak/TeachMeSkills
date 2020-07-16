package lesson9Task.shop;

import java.util.ArrayList;
import java.util.List;

public class Market {
    private List<Stuff> list;

    public Market(List<Stuff> list) {
        this.list = list;
    }

    public List<Stuff> getList() {return list;}
    public void setList(List<Stuff> list) {this.list = list;}

    public void addList (Stuff stuff) {
        for (int i = 0; i < list.size(); i++) {
            if (stuff.getId() != list.get(i).getId()) {
                list.add(stuff);
            }
        }
    }

    public void deleteStuff(int id) {
        for (int i = 0; i < getList().size(); i++) {
            if (getList().get(i).getId() == id) {
                getList().remove(getList().get(i));
            }
        }
    }

    public void getRewrite(Stuff stuff) {
        for (int i = 0; i < getList().size(); i++) {
            if (stuff.equals(getList().get(i))) {
//                stuff.setId();
            }
        }
    }

}
