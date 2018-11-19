package skill.common.abstractclass;

/*Abstract class having constructor, data member and methods

An abstract class can have a data member, abstract method, method body (non-abstract method), constructor, and even main() method.*/
abstract class Bike_i {
    public Bike_i() {
        System.out.println("bike is created");
    }

    // Rule: If there is an abstract method in a class, that class must be abstract.
    // Rule: If you are extending an abstract class that has an abstract method, you must either provide the implementation of the method or make this class abstract.
    abstract void run();

    void changeGear() {
        System.out.println("gear changed");
    }
}

//Creating a Child class which inherits Abstract class
class Honda extends Bike_i {

    @Override
    void run() {
        System.out.println("running safely..");
    }
}

//Creating a Test class which calls abstract and non-abstract methods
public class TestAbstraction2 {
    public static void main(String[] args) {
        Honda honda = new Honda();
        honda.run();
        honda.changeGear();
    }
}
