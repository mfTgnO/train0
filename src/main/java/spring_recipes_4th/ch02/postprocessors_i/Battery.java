package spring_recipes_4th.ch02.postprocessors_i;

public class Battery extends Product {
    private boolean rechargeable;

    public Battery() {
    }

    public Battery(String name, double price) {
        super(name, price);
    }

    public boolean isRechargeable() {
        return rechargeable;
    }

    public void setRechargeable(boolean rechargeable) {
        this.rechargeable = rechargeable;
    }
}
