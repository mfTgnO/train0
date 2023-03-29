package com.example.demo.fundamental.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Test;

/**
 * @author:
 * @createDate: 2023-03-28 10:35
 * @description:
 */
public class MapDemo {
    @Test
    public void test1() {
        Map<String, Object> map = new HashMap<>();
        map.put("openid", "o28cf4-JpupdYkALpry-9YenQZGU");

        List<Map<String, Object>> skuIdList = new ArrayList<>();
        Map<String, Object> skuId = new HashMap<>();
        skuId.put("skuId", 44);
        skuId.put("type", 2);
        skuIdList.add(skuId);
        map.put("skuIdList", skuIdList);
        map.put("remark", "判读原价购买");

        System.out.println(map);
        System.out.println(map.toString());
    }

    @Test
    public void test2() {
        List<HashMap<String, Object>> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            HashMap<String, Object> map = new HashMap<>();
            map.put("questionsId", i);
            map.put("correct", null);

            list.add(map);
        }

        StringBuffer sb = new StringBuffer();
        list.stream().forEach(item -> {
            String questionsId = item.get("questionsId").toString();
            if (sb.length() == 0) {
                sb.append(questionsId);
            } else {
                sb.append(",").append(questionsId);
            }
        });
        String toString = sb.toString();
        System.out.println(toString);
    }

    @Test
    public void test3() {
        List<HashMap<String, Object>> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            HashMap<String, Object> map = new HashMap<>();
            map.put("questionsId", i);
            map.put("correct", null);

            list.add(map);
        }

        StringBuffer sb = new StringBuffer();
        list.parallelStream().forEach(item -> {
            String questionsId = item.get("questionsId").toString();
            if (sb.length() == 0) {
                sb.append(questionsId);
            } else {
                sb.append(",").append(questionsId);
            }
        });
        String toString = sb.toString();
        System.out.println(toString);
    }
}