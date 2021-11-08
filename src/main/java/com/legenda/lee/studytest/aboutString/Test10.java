package com.legenda.lee.studytest.aboutString;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2021-10-16 4:01 下午
 * @description:
 */
public class Test10 {

    public static void main(String[] args) {
        System.out.println(isInteger("-333"));
        System.out.println(isInteger("03432.3"));
        System.out.println("333".length());
        System.out.println("z沟沟壑壑".length());

    }

    /**
     * &#64;Description 判断字符串是否实际上是整数
     * &#64;Author .Mark
     * &#64;Date 2019年1月30日
     */
    public static Boolean isInteger(String str) {
        // 1.限制入参
        if (str == null || "".equals(str)) {
            return false;
        }

        // 2.判断
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }

        return true;
    }
}
