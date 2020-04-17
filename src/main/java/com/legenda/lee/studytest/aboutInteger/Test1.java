package com.legenda.lee.studytest.aboutInteger;

/**
 * @author Legenda-Lee
 * @date 2020-04-17 14:13
 * @description
 * @since 1.0.0
 */
public class Test1 {
    public static void main(String[] args) {
        String a = "0003";
        String b = "0043";
        String c = "0403";

        System.out.println(Integer.valueOf(a));
        System.out.println(Integer.valueOf(b));
        System.out.println(Integer.valueOf(c));

        String d = "0403.png";
        String e = "附房间打开.png";
        System.out.println(d.length());
        System.out.println(e.length());

        String fileNameWithNoType = e.substring(0, e.lastIndexOf("."));
        System.out.println(fileNameWithNoType);

    }
}
