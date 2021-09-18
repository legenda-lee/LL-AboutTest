package com.legenda.lee.studytest.aboutList;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2021-08-31 10:23 下午
 * @description:
 */
public class Test8 {

    public static void main(String[] args) {
        List<String> ordersns = new ArrayList<>();

        for (int i = 1; i <= 271859; i++) {
            ordersns.add(String.valueOf(i));
        }
        System.out.println(ordersns.size());



        List<String> orderSnListSub1 = new ArrayList<>();
        List<String> orderSnListSub2 = new ArrayList<>();
        List<String> orderSnListSub3 = new ArrayList<>();
        for (int i = 0; i < ordersns.size(); i++) {
            if (i < 100000 ) {
                orderSnListSub1.add(ordersns.get(i));
            } else if (i >= 100000 && i < 200000) {
                orderSnListSub2.add(ordersns.get(i));
            } else {
                orderSnListSub3.add(ordersns.get(i));
            }
        }

        System.out.println(orderSnListSub1.size());
        System.out.println(orderSnListSub1.get(0));
        System.out.println(orderSnListSub1.get(orderSnListSub1.size()-1));

        System.out.println("===");

        System.out.println(orderSnListSub2.size());
        System.out.println(orderSnListSub2.get(0));
        System.out.println(orderSnListSub2.get(orderSnListSub2.size()-1));

        System.out.println("===");

        System.out.println(orderSnListSub3.size());
        System.out.println(orderSnListSub3.get(0));
        System.out.println(orderSnListSub3.get(orderSnListSub3.size()-1));

        System.out.println("===");
    }
}
