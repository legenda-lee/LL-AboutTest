package com.legenda.lee.studytest.aboutList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2020-07-23 15:30
 * @description:
 */
public class Test3 {

    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        nameList.add("ee");
        // nameList.add("ww");

        String x = "";
        for (String s : nameList) {
            x = x.concat(s).concat("，");
        }
        x = x.substring(0, x.length() - 1);

        System.out.println(x);

    }
}
