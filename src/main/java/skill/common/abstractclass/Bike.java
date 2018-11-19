package skill.common.abstractclass;

/*Example of Abstract class that has an abstract method

In this example, Bike is an abstract class that contains only one abstract method run.
Its implementation is provided by the Honda class.*/
public abstract class Bike {
    abstract void run();
}

class Honda4 extends Bike {

    @Override
    void run() {
        System.out.println("running safely");
    }

    public static void main(String[] args) {
        Honda4 honda4 = new Honda4();
        honda4.run();
    }
}