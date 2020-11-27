package com.legenda.lee.studytest.aboutList;

import java.util.Arrays;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2020-11-24 9:13 下午
 * @description:
 */
public class Test4 {

    public static void main(String[] args) {
        String[] years = new String[]{"2014","2015","2016","2017","2018",
                "2019","2020","2021","2022","2023", "2024","2025","2026","2027","2028"};
        if (!Arrays.asList(years).contains("2019")) {
            System.out.println("hhh");
        }
    }
}
