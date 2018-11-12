package com.example.demo.fixtures;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
/*
* https://www.tutorialspoint.com/junit/junit_test_framework.htm
* Features of JUnit Test Framework

JUnit test framework provides the following important features −

    Fixtures
    Test suites
    Test runners
    JUnit classes

Fixtures

Fixtures is a fixed state of a set of objects used as a baseline for running tests. The purpose of a test fixture is to ensure that there is a well-known and fixed environment in which tests are run so that results are repeatable. It includes −

    setUp() method, which runs before every test invocation.
    tearDown() method, which runs after every test method.

Let's check one example −
*/
public class TestJunit extends TestCase {
    protected int value1, value2;

    @Test
    public void testAdd1() {
        String str = "Junit is working fine";
        Assert.assertEquals("Junit is working fine", str);
    }

    @Override
    protected void setUp() throws Exception {
        value1 = 1;
        value2 = 2;
    }

    @Test
    public void testAdd2() {
        double result = value1 + value2;
//        assertTrue(result == 3);
        assertEquals(3, result, 0.0);
    }
}
