package com.legenda.lee.studytest.aboutString;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2021-01-29 11:26 上午
 * @description:
 */
public class TestSub {

    public static void main(String[] args) {
        // String a = "汇总数据-";
        //
        // System.out.println(a.substring(0, a.length() - 1));
        //
        // System.out.println(1 << 1);
        //
        //
        // System.out.println("yyyyMMddHHmmssSSS".substring(10));

        String aa = "1000200329DZSYAB";
        System.out.println(aa.substring(0, 5) + "*****"+ aa.substring(10, 16));


        String fieldCode = "2357433";
        System.out.println(fieldCode.substring(2, 3));
        if ("5".equals(fieldCode.substring(2, 3))) {
            System.out.println("yes");
        }


        String a = "PRESCRIPTION-EVENT-0001-SNAPSHOT";
        System.out.println(a.substring(0, a.indexOf("SNAPSHOT") - 1));
        System.out.println(a.substring(0, 5));


        String aaa = "无,";
        System.out.println(aaa.substring(0, aaa.length() - 1));


        String name = "100041110402484";
        String newStudentNo = name.substring(0, 5) + "*" + name.substring(12, name.length());
        System.out.println(newStudentNo);


        // List<String> temp1 = new ArrayList<>();
        // temp1.addAll(null);

        System.out.println(name.substring(0, name.length() - 1));

        System.out.println(name.concat("$1\r").concat("hhh"));


        Double x = 1.0d * 0.2d * 3.0;
        Double y = 0.6d;
        System.out.println(x);
        System.out.println(x > 0.6d);


        Double one = 1.0d;
        Double two = 0.2d;
        Double three = 3.0d;

        Double four = 0.6d;
        BigDecimal a1 = new BigDecimal(Double.toString(one));
        BigDecimal b1 = new BigDecimal(Double.toString(two));
        BigDecimal c1 = new BigDecimal(Double.toString(three));

        BigDecimal d1 = new BigDecimal(Double.toString(four));
        BigDecimal left = a1.multiply(b1).multiply(c1);
        System.out.println(left);
        System.out.println(d1);
        System.out.println(left.compareTo(d1));

    }
}
