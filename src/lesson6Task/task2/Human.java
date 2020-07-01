package lesson6Task.task2;

public class Human implements IHuman {
    private String name;
    private ICoat coat;
    private IPants pants;
    private IShoes shoes;

    public Human(String name, ICoat coat, IPants pants, IShoes shoes) {
        this.name = name;
        this.coat = coat;
        this.pants = pants;
        this.shoes = shoes;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public ICoat getCoat() {return coat;}
    public void setCoat(ICoat coat) {this.coat = coat;}
    public IPants getPants() {return pants;}
    public void setPants(IPants pants) {this.pants = pants;}
    public IShoes getShoes() {return  shoes;}
    public void setShoes(IShoes shoes) {this.shoes = shoes;}

    @Override
    public void putOnAll() {
        coat.putOn();
        pants.putOn();
        shoes.putOn();
    }

    @Override
    public void putOffAll() {
        coat.putOff();
        pants.putOff();
        shoes.putOff();
    }
}
