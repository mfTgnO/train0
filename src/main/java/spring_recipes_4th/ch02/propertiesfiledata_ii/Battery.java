package spring_recipes_4th.ch02.propertiesfiledata_ii;

public class Battery extends Product {
    private boolean rechargeable;

    public Battery() {
    }

    public Battery(String name, double price, double discount) {
        super(name, price, discount);
    }

    public boolean isRechargeable() {
        return rechargeable;
    }

    public void setRechargeable(boolean rechargeable) {
        this.rechargeable = rechargeable;
    }
}
