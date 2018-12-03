package effective_java_3rd.ch2.item4;

import org.junit.Test;

public class UtilityClassTest {
    @Test
    public void test() {
//        UtilityClass utilityClass = new UtilityClass();
    }

    @Test
    public void test_i() {
        int i = 2018;
        int result = Integer.hashCode(i);
        System.out.println("result:" + result);
    }

    @Test
    public void test_ii(){
        double i = 20.18;
        int result = Double.hashCode(i);
        System.out.println("result:" + result);
    }

}