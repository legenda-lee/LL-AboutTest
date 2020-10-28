package com.legenda.lee.studytest.aboutDouble;

import java.math.BigDecimal;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2020-10-28 10:48 上午
 * @description:
 */
public class Test1 {

    public static void main(String[] args) {
        Drgu drgu = new Drgu();
        System.out.println(drgu.getTakeAmount());

        System.out.println(distributeByRate("1.5"));

    }


    private static boolean distributeByRate(String rate){
        double random = Math.random();
        int val = BigDecimal.valueOf(random).compareTo(new BigDecimal(rate));
        return val < 1;
    }
}
