package com.khc.kmooc.data_engineering.week10;

import com.khc.kmooc.data_engineering.week1.Email;

import java.util.HashMap;

public class HashMapExample4 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(1, 2);
        map.put(2, 3);
        map.put(3, 4);
        map.put(2, 5);
        System.out.println(map);

        HashMap<Email, Integer> map2 = new HashMap<Email, Integer>();
        map2.put(new Email(1, 2), 3);
        map2.put(new Email(1, 2), 5);
        System.out.println(map2);
        map2.put(new Email(1, 2), 7);
        System.out.println(map2);

        HashMap<Integer, Integer> map3 = new HashMap<>(map);
        System.out.println(map3);

        HashMap<Object, Object> map4 = new HashMap<>(map2);
        System.out.println(map4);
//         중요 not working
//        map2 = new HashMap<Email, Integer>(map4);

    }
}
