package com.example.demo.fundamental.log;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @author:
 * @createDate: 2023-03-30 14:33
 * @description:
 */
@Slf4j
public class LogDemo {
    @Test
    public void test1() {
        long l1 = System.currentTimeMillis();
        log.info("Checkpoint: {}, time: {}", 1, l1);

        for (int i = 0; i < 100000; i++) {
            int num = i ^ 2;
//            System.out.println(i ^ 2);
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long l2 = System.currentTimeMillis();
        log.info("Checkpoint: {}, time: {}", 2, l2 - l1);
    }

    @Test
    public void test2() {
        for (int i = 0; i < 50; i++) {
            System.out.println("long l" + i + " = System.currentTimeMillis();");
            if (i == 0) {
                System.out.println("log.info(\"Checkpoint: {}, time: {}\", " + i + ", l" + i + ");");
            } else {
                System.out.println("log.info(\"Checkpoint: {}, time: {}\", " + i + ", l" + i + " - l" + (i - 1) + ");");
            }

            System.out.println();
        }
    }
}