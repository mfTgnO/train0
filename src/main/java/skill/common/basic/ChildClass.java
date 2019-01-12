package skill.common.basic;

public class ChildClass extends ParentClass {
    public ChildClass() {
        super();  //If not provided, JVM will insert it
        System.out.println("In ChildClass Constructor");
    }

    //Instance Initializer 1
    {
        System.out.println("In ChildClass Instance Initializer 1");
    }

    //Instance Initializer 2
    {
        System.out.println("In ChildClass Instance Initializer 2");
    }
}
