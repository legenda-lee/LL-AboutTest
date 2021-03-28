package com.legenda.lee.studytest.aboutExtends.another2;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2020-10-20 11:26 上午
 * @description:
 */
public class Test {

    public static void main(String[] args) {
        Test test = (Test)null;
        System.out.println(test);

        Double a = 1.9;
        Double c = 1.0;
        Integer b = 2;

        System.out.println(a.compareTo(c));
        System.out.println(a <= b);
        System.out.println(b < a);

        System.out.println(1e-3);
    }
}
