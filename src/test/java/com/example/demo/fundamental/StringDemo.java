package com.example.demo.fundamental;

import org.junit.Test;

/**
 * @author:
 * @createDate: 2023-03-20 16:42
 * @description:
 */
public class StringDemo {
    @Test
    public void test1() {
        String str = "[备注]考点：【基础医学综合】病理学/肿瘤\n";
        System.out.println(str.replaceAll("[备注]", ""));
        System.out.println(str.replaceAll("\\[备注\\]", ""));
    }
}
