package com.legenda.lee.studytest.aboutList;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Legenda-Lee
 * @date 2019-12-06 17:11
 * @description
 * @since 1.0.0
 */
public class Test1 {

    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        nameList.add("LiLei");
        nameList.add("LiMing");
        nameList.add("LiHaHa");
        nameList.add("LiHeHe");
        nameList.add("Legenda-Lee");

        nameList.forEach(item -> {
            System.out.println(item);
            if ("Legenda-Lee".equals(item)) {
                System.out.println("i am in this List");
            }
        });

    }
}
