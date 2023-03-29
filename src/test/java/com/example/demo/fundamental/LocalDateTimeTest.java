package com.example.demo.fundamental;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import org.junit.Test;

/**
 * @author:
 * @createDate: 2023-03-17 17:13
 * @description:
 */
public class LocalDateTimeTest {
    @Test
    public void test1() {
        System.out.println("hello");

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

//        String timeExpire = DateTimeZoneUtil.dateToTimeZone(System.currentTimeMillis() + 1000 * 60 * 3);
        System.out.println(now.format(DateTimeFormatter.ISO_DATE));
        System.out.println(now.format(DateTimeFormatter.ISO_DATE_TIME));
//        System.out.println(now.format(DateTimeFormatter.ISO_INSTANT));
        System.out.println(now.format(DateTimeFormatter.ISO_LOCAL_DATE));

        ZoneOffset offset = OffsetDateTime.now().getOffset();
        System.out.println(offset);
//        ZoneId.of()

        System.out.println("--------------------");
        System.out.println(now.toString() + offset.toString());
    }

    @Test
    public void test2() {
//        String str = "2023-03-21T10:58:18+08:00";
//        String str = "2023-03-21T10:58:18";
        String str = "2023-03-21 10:58:18";
//        String str = "2016-03-04 11:30";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime formatDateTime = LocalDateTime.parse(str, formatter);

        System.out.println(formatDateTime);

        System.out.println(LocalDateTime.parse("2023-03-21T10:58:18"));
        System.out.println(LocalDateTime.parse("2023-03-21T10:58:18+08:00".split("\\+")[0]));

    }
}
