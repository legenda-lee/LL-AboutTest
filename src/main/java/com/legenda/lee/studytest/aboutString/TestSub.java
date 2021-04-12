package com.legenda.lee.studytest.aboutString;

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
    }
}
