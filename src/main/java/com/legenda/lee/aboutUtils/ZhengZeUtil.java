package com.legenda.lee.aboutUtils;

import org.springframework.util.StringUtils;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2021-09-29 10:35 上午
 * @description:
 */
public class ZhengZeUtil {

    /**
     * 是否为数字和字母组合
     *
     * @param str
     * @return
     */
    public static boolean isNumOrWord(String str) {
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        return str.matches("^[A-Za-z0-9]+$");
    }

}
