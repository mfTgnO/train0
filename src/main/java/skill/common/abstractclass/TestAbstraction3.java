package skill.common.abstractclass;

/*Another real scenario of abstract class

The abstract class can also be used to provide some implementation of the interface.
In such case, the end user may not be forced to override all the methods of the interface.*/
interface C {
    void a();

    void b();

    void c();

    void d();
}

abstract class D implements C {
    public void c() {
        System.out.println("I am c");
    }
}

class E extends D {

    @Override
    public void a() {
        System.out.println("I am a");
    }

    @Override
    public void b() {
        System.out.println("I am d");
    }

    @Override
    public void d() {
        System.out.println("I am d");
    }
}

public class TestAbstraction3 {
    public static void main(String[] args) {
        D d = new E();
        d.a();
        d.b();
        d.c();
        d.d();
    }
}
