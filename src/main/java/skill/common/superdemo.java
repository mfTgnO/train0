package skill.common;

import java.util.ArrayList;
import java.util.List;

public class superdemo {
    public static void main(String[] args) {

    }

    /*
    *
        super
        Now consider List <? super T>.
        The wildcard declaration of List<? super Integer> foo3 means that any of these are legal assignments:
    */
    public static void test1() {
        List<? super Integer> foo1 = new ArrayList<>();// Integer is a "superclass" of Integer (in this context)
        List<? super Integer> foo2 = new ArrayList<>();// Number is a superclass of Integer
        List<? super Integer> foo3 = new ArrayList<>();// Object is a superclass of Integer
    }
    /*
        Reading - Given the above possible assignments, what type of object are you guaranteed to receive when you read from List foo3:
            You aren't guaranteed an Integer because foo3 could be pointing at a List<Number> or List<Object>.
            You aren't guaranteed a Number because foo3 could be pointing at a List<Object>.
            The only guarantee is that you will get an instance of an Object or subclass of Object (but you don't know what subclass).

        Writing - Given the above possible assignments, what type of object could you add to List foo3 that would be legal for all the above possible ArrayList assignments:
            You can add an Integer because an Integer is allowed in any of above lists.
            You can add an instance of a subclass of Integer because an instance of a subclass of Integer is allowed in any of the above lists.
            You can't add a Double because foo3 could be pointing at an ArrayList<Integer>.
            You can't add a Number because foo3 could be pointing at an ArrayList<Integer>.
            You can't add an Object because foo3 could be pointing at an ArrayList<Integer>.

            PECS

        Remember PECS: "Producer Extends, Consumer Super".

            "Producer Extends" - If you need a List to produce T values (you want to read Ts from the list), you need to declare it with ? extends T, e.g. List<? extends Integer>. But you cannot add to this list.

            "Consumer Super" - If you need a List to consume T values (you want to write Ts into the list), you need to declare it with ? super T, e.g. List<? super Integer>. But there are no guarantees what type of object you may read from this list.

            If you need to both read from and write to a list, you need to declare it exactly with no wildcards, e.g. List<Integer>.

        Example

        Note this example from the Java Generics FAQ(http://www.angelikalanger.com/GenericsFAQ/FAQSections/TypeArguments.html#FAQ103). Note how the source list src (the producing list) uses extends, and the destination list dest (the consuming list) uses super:
    */


}
