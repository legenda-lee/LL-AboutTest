package com.legenda.lee.studytest.aboutString;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Test11 {

    public static void main(String[] args) {
        String a = "李达";

        byte[] aa = a.getBytes();
        String responseResult = new String(aa, StandardCharsets.UTF_8);
        String responseResult1 = new String(aa, StandardCharsets.UTF_8);

        System.out.println(a);
        System.out.println(responseResult);
        System.out.println(responseResult1);

        System.out.println(a == responseResult);

        String v = "李达";

        System.out.println(a == v);
    }
}
