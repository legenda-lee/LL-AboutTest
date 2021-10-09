package com.legenda.lee.aboutUtils.test;

import com.legenda.lee.aboutUtils.IsNumUtil;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2021-10-09 4:03 下午
 * @description:
 */
public class TestNum {

    public static void main(String[] args) {
        String a = "333";
        String b = "333.4a3";

        System.out.println(IsNumUtil.isNum(a));
        System.out.println(IsNumUtil.isNum(b));
    }
}
