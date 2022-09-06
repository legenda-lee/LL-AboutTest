package com.legenda.lee.studytest.aboutDouble;

import java.text.NumberFormat;
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


        Double a = 12.5d;
        Integer b= 33;
        System.out.println(a + 20);
        System.out.println(b > a + 20);
        System.out.println("hhh");
        System.out.println(Double.valueOf(a.intValue()));
        System.out.println(a.doubleValue());


        double percent = 0.87d;
        NumberFormat nt = NumberFormat.getPercentInstance();
        //设置百分数精确度2即保留两位小数
        nt.setMinimumFractionDigits(2);
        System.out.println(nt.format(percent));

        System.out.println(Double.valueOf(nt.format(percent).substring(0, nt.format(percent).length() - 1)));
    }
}
