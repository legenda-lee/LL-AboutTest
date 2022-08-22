package com.legenda.lee.studytest.aboutDouble;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2020-11-19 10:33 上午
 * @description:
 */
public class Test2 {

    public static void main(String[] args) {
        String doubleStr = "2.0";
        Double doub = Double.valueOf(doubleStr);
        System.out.println(doub.intValue());

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String yyyyMMdd = LocalDate.now().format(dateTimeFormatter);

        System.out.println(yyyyMMdd);


        double a = 12.5d;
        Integer b= 33;
        System.out.println(a + 20);
        System.out.println(b > a + 20);
    }
}
