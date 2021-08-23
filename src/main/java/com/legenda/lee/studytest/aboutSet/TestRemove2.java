package com.legenda.lee.studytest.aboutSet;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2021-08-10 9:50 下午
 * @description:
 */
public class TestRemove2 {
    public static void main(String[] args) {
        Set<Integer> fileDateList = new HashSet<>();
        fileDateList.add(2020);
        fileDateList.add(2020);

        // 最近两年
        Integer maxFileDate = Collections.max(fileDateList);
        fileDateList.remove(maxFileDate);
        Integer maxFileDateSecond = Collections.max(fileDateList);

        System.out.println(maxFileDateSecond);
    }
}
