package com.legenda.lee.studytest.aboutList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestSysn {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            integerList.add(i);
        }
        System.out.println(integerList.size());

        //List<Integer> list = new ArrayList<>();
        List<Integer> list = Collections.synchronizedList(new ArrayList<>());

        integerList.parallelStream().forEach(list::add);
        System.out.println(list.size());
        System.out.println(list);

    }
}
