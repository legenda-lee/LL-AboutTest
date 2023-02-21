package com.legenda.lee.studyalgorithm.aboutDiGui;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2023-02-21 上午11:43
 * @description:
 */
public class FeiBoNaQi {

    public static void main(String[] args) {
        // 1、1、2、3、5、8、13


        System.out.println(get(7));
    }

    private static int get(int n) {
        if (n < 3) {
            return 1;
        }

        return get(n - 1) + get(n - 2);
    }
}
