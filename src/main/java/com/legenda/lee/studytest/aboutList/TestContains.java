package com.legenda.lee.studytest.aboutList;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2020-12-01 10:44 上午
 * @description:
 */
public class TestContains {

    public static void main(String[] args) {
        // List<Object> paramList = new ArrayList<>();
        // paramList.add("hh");
        // paramList.add("呵呵");
        //
        // System.out.println(contains(paramList, "hh"));
        // System.out.println(contains(paramList, "呵呵"));

        List<Object> paramList1 = new ArrayList<>();
        paramList1.add("hh");
        paramList1.add("呵呵");

        // List<Object> paramList2 = new ArrayList<>();
        List<Object> paramList2 = null;
        // paramList2.add("3333");

        paramList1.addAll(paramList2);
        System.out.println(paramList1.size());
        for (Object o : paramList1) {
            System.out.println(o);
        }
    }

    public static boolean contains(List<Object> paramList, Object paramObject) {
        return paramList.contains(paramObject);
    }
}
