package com.legenda.lee.aboutUtils;

import org.springframework.util.StringUtils;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2021-09-29 10:35 上午
 * @description:
 */
public class IsNumUtil {

    /**
     * 是否为数字（正负整数、正负小数）
     *
     * @param str
     * @return
     */
    public static boolean isNum(String str) {
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        return str.matches("^[-+]?(([0-9]+)([.]([0-9]+))?|([.]([0-9]+))?)$");
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
