package com.legenda.lee.studytest.aboutJava8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2020-09-30 4:26 下午
 * @description:
 */
public class Test2 {

    public static void main(String[] args) {
        DateTimeFormatter yyyyMMdd = DateTimeFormatter.ofPattern("yyyyMMdd");
        String format = LocalDate.now().format(yyyyMMdd);
        System.out.println(format);
    }
}
