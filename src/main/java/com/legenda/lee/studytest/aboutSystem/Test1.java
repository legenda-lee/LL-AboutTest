package com.legenda.lee.studytest.aboutSystem;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2020-11-06 2:12 下午
 * @description:
 */
public class Test1 {

    private static int a = 3;

    static {
        System.out.println(a);
    }

    public static void main(String[] args) {
        System.out.println(1 << 1);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyyMM");
        String yyyyMM = LocalDate.now().format(dateTimeFormatter);
        System.out.println(yyyyMM);
    }
}
