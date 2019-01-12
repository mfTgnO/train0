package skill.common.basic;

// https://www.programcreek.com/2011/10/java-class-instance-initializers/
public class Foo {
    //instance variable initializer
    String s = "abc";

    //constructor

    public Foo() {
        System.out.println("constructor called");
    }

    //static initializer
    static {
        System.out.println("static initializer called");
    }

    //instance initializer
    {
        System.out.println("instance initializer called");
    }

    public static void main(String[] args) {
        new Foo();
        new Foo();
    }
}
