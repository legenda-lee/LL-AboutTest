package com.legenda.lee.studytest.aboutString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2020-11-29 12:37 下午
 * @description:
 */
public class TestSplit {

    public static void main(String[] args) {
        List<String> laugh = Arrays.asList("哈哈哈呵呵呵,".split(","));

        System.out.println(laugh.size());
        for (String s : laugh) {
            System.out.println(s);
        }

        List<Object> paramList = null;
        System.out.println(paramList.isEmpty());
    }
}
