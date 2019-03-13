package com.example.demo.collectionsdemo;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class Test1 {
    @Test
    public void givenUsingCoreJava_whenListConvertedToArray_thenCorrect() {
        List<Integer> sourceList = Arrays.asList(0, 1, 2, 3, 4, 5);
        Integer[] targetArray = sourceList.toArray(new Integer[sourceList.size()]);
        for (int i = 0; i < targetArray.length; i++) {
            System.out.println(targetArray[i]);
        }
    }

    @Test
    public void givenUsingGuava_whenListConvertedToArray_thenCorrect() {
        List<Integer> sourceList = Lists.newArrayList(0, 1, 2, 3, 4, 5);
        int[] targetArray = Ints.toArray(sourceList);
    }
}
