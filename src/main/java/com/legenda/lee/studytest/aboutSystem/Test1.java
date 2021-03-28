package com.legenda.lee.studytest.aboutSystem;

import java.text.DecimalFormat;
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

        Integer a = 3;
        Integer b = 33;

        int c = a / b;
        System.out.println(c);


        int  aa=11;
        int  bb=34;
        DecimalFormat df = new DecimalFormat("0.00");
        String maerialRatio = df.format((double)aa/bb);
        System.out.println(maerialRatio);

        double cc = Double.valueOf(maerialRatio);
        System.out.println(cc);


        double ee = 3.256;
        System.out.println(Math.ceil(ee));

    }
}
