package com.legenda.lee.studytest.aboutSet;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2021-04-29 2:51 下午
 * @description:
 */
public class TestRemove {

    public static void main(String[] args) {
        Set<Integer> fileDateList = new HashSet<>();
        fileDateList.add(1);
        fileDateList.add(2);
        fileDateList.add(3);

        Integer max = Collections.max(fileDateList);
        System.out.println(max);

        fileDateList.remove(max);


        System.out.println(fileDateList.size());
    }
}
