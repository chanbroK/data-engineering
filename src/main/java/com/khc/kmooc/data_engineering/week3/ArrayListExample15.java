package com.khc.kmooc.data_engineering.week3;

import java.util.ArrayList;

public class ArrayListExample15 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        list.clear();
        System.out.println(list);
        System.out.println(list.size());
    }
} 
