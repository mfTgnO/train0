package com.example.demo.fundamental.list;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Test;

/**
 * @author:
 * @createDate: 2023-06-27 16:49
 * @description:
 */
public class ListDemo {
    @Test
    public void test1() {
//        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        System.out.println(list);
        double media;

        int size = list.size();
        if (size % 2 == 0) {
            double left = list.get((size / 2) - 1);
            double right = list.get(size / 2);
            System.out.println(left);
            System.out.println(right);
            double sum = left + right;
            media = sum / 2;
        } else {
            media = list.get((size / 2));
        }
        System.out.println(media);
    }
}
