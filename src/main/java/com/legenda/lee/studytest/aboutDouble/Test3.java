package com.legenda.lee.studytest.aboutDouble;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Test3 {

    public static void main(String[] args) {
        Double x = 1.0d * 0.2d * 3.0d;
        Double y = 0.6d;
        System.out.println(x);
        System.out.println(x > y);
        System.out.println(x > 0.6d);


        BigDecimal b1 = new BigDecimal(Double.toString(x.doubleValue()));
        BigDecimal b2 = new BigDecimal(Double.toString(y.doubleValue()));

        System.out.println("----");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b1.compareTo(b2));

        System.out.println("-----");

        Double haha = 1.0d;
        Double hehe = 0.2d;
        Double xixi = 3.0d;
        BigDecimal aaa = new BigDecimal(Double.toString(haha));
        BigDecimal bbb = new BigDecimal(Double.toString(hehe));
        BigDecimal ccc = new BigDecimal(Double.toString(xixi));
        System.out.println( aaa.multiply(bbb).multiply(ccc).doubleValue());
        System.out.println((aaa.multiply(bbb).multiply(ccc).doubleValue()) > 0.6d);

        System.out.println(LocalDate.now().format(DateTimeFormatter.ISO_DATE));
        System.out.println(LocalDate.now().plusDays(-1));



    }
}
