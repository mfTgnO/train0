package spring_recipes_4th.ch02.createPOJOswithfactory_ii;

public class Disc extends Product {
    private int capacity;

    public Disc() {
    }

    public Disc(String name, double price) {
        super(name, price);
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}