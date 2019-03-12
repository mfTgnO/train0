package com.example.demo.testsuites;


import com.example.demo.util.MessageUtil;
import org.junit.Assert;
import org.junit.Test;

public class TestJunit1 {
    String message = "Robert";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testPrintMessage() {
        System.out.println("Inside testPrintMessage()");
        Assert.assertEquals(message, messageUtil.printMessage());
    }

    @Test
    public void test() {
//        Integer integer = new Integer(null);
        /*if (null.equals(new Integer(null))) {
            System.out.println("hello");
        }*/
        int num = 1;
        if (num == 1) {
            System.out.println(1);
        } else if (num == 2) {
            System.out.println(2);
        } else if (num == 3) {
            System.out.println(3);
        } else {
            System.out.println(0);
        }
    }
}