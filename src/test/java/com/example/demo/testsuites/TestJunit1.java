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
}
