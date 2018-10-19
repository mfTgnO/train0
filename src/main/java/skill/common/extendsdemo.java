package skill.common;

import java.util.ArrayList;
import java.util.List;

/*Difference between <? super T> and <? extends T> in Java [duplicate]
 * https://stackoverflow.com/questions/4343202/difference-between-super-t-and-extends-t-in-java
 * */
public class extendsdemo {
    public static void main(String[] args) {

    }

    /*
    extends
    The wildcard declaration of List<? extends Number> foo3 means that any of these are legal assignments:
    */
    public static void demo1() {
        List<? extends Number> foo1 = new ArrayList<>();// Number "extends" Number (in this context)
        List<? extends Long> foo2 = new ArrayList<>();// Integer extends Number
        List<? extends Double> foo3 = new ArrayList<>();// Double extends Number
    }
    /*
    Reading - Given the above possible assignments, what type of object are you guaranteed to read from List foo3:
        You can read a Number because any of the lists that could be assigned to foo3 contain a Number or a subclass of Number.
        You can't read an Integer because foo3 could be pointing at a List<Double>.
        You can't read a Double because foo3 could be pointing at a List<Integer>.

    Writing - Given the above possible assignments, what type of object could you add to List foo3 that would be legal for all the above possible ArrayList assignments:
        You can't add an Integer because foo3 could be pointing at a List<Double>.
        You can't add a Double because foo3 could be pointing at a List<Integer>.
        You can't add a Number because foo3 could be pointing at a List<Integer>.

    You can't add any object to List<? extends T> because you can't guarantee what kind of List it is really pointing to, so you can't guarantee that the object is allowed in that List. The only "guarantee" is that you can only read from it and you'll get a T or subclass of T.
    */
}
