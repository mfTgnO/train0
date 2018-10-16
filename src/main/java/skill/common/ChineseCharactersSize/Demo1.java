package skill.common.ChineseCharactersSize;

import java.io.UnsupportedEncodingException;
/*
* Java一个汉字占几个字节（详解与原理）(转载)
* https://www.cnblogs.com/lslk89/p/6898526.html
* */
public class Demo1 {
    public static void main(String[] args) {
        test1();
        test2();
        test3();
    }

    public static void test1() {
        String a = "名";
        try {
            System.out.println("UTF-8编码长度:"+a.getBytes("UTF-8").length);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    public static void test2(){
        String a = "名";
        try {
            System.out.println("GBK编码长度:"+a.getBytes("GBK").length);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    public static void test3(){
        String a = "名";
        try {
            System.out.println("GB2312编码长度:"+a.getBytes("GB2312").length);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
