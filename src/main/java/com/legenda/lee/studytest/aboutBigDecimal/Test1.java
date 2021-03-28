package com.legenda.lee.studytest.aboutBigDecimal;

import java.math.BigDecimal;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2020-11-26 4:57 下午
 * @description:
 */
public class Test1 {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("25.0");
        BigDecimal b = new BigDecimal("25.6");

        System.out.println(a.compareTo(b));



    }
}
