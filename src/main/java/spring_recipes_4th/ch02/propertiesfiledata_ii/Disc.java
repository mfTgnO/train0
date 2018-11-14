package spring_recipes_4th.ch02.propertiesfiledata_ii;

public class Disc extends Product {
    private int capacity;

    public Disc() {
    }

    public Disc(String name, double price, double discount) {
        super(name, price, discount);
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
