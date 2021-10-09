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

}
