package skill.common.bigdecimaltutorial;

import java.math.BigDecimal;

/*
* BigDecimal to string
* https://stackoverflow.com/questions/13900204/bigdecimal-to-string
* */
public class Demo1 {
    public static void main(String[] args) {
//        test1();
        test2();
    }

    public static void test1() {
        BigDecimal bdec = new BigDecimal(1.2345);
        System.out.println(bdec.toString());// 1.2344999999999999307220832633902318775653839111328125
    }


    /*
    * The problem with new BigDecimal(10.0001) is that the argument is a double and it happens that doubles can't represent 10.0001 exactly. So 10.0001 is "transformed" to the closest possible double, which is 10.000099999999999766941982670687139034271240234375 and that's what your BigDecimal shows.
    For that reason, it rarely makes sense to use the double constructor.
    You can read more about it here, Moving decimal places over in a double
    *
    * */
    public static void test2(){
        BigDecimal bdec1 = new BigDecimal("1.2345");
        System.out.println(bdec1.toString());
        BigDecimal bdec2 = BigDecimal.valueOf(1.2345);
        System.out.println(bdec2.toString());
    }
}
