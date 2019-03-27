package com.example.demo;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class FormatCode {
    @Test
    public void test1() {
        Integer[] arr = new Integer[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 213;
        System.out.println(Arrays.toString(arr));

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(14);

        System.out.println(arrayList);
    }
}