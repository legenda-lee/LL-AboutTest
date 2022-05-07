package com.legenda.lee.aboutUtils.test;

import com.legenda.lee.aboutUtils.IsNumUtil;
import com.legenda.lee.aboutUtils.ZhengZeUtil;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2021-10-09 4:03 下午
 * @description:
 */
public class TestNum {

    public static void main(String[] args) {
        String a = "333";
        String b = "333. 43";
        String c= "0";
        //
        System.out.println(IsNumUtil.isNum(a));
        System.out.println(IsNumUtil.isNum(b));
        System.out.println(IsNumUtil.isInteger(b));
        System.out.println(IsNumUtil.isInteger(c));

        String majorCode = "020Z32";
        // System.out.println(ZhengZeUtil.isNumOrWord(majorCode));
        System.out.println(IsNumUtil.isNum(majorCode));
        System.out.println(IsNumUtil.isInteger(majorCode));


    }
}
