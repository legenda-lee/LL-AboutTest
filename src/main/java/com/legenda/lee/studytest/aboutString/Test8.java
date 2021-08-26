package com.legenda.lee.studytest.aboutString;

import cn.hutool.core.util.StrUtil;
import org.springframework.util.StringUtils;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2021-08-11 10:56 上午
 * @description:
 */
public class Test8 {

    public static void main(String[] args) {
        String lo = "1.395645";
        String la = "116.434";


        String haha = StrUtil.sub(lo, lo.indexOf("."), lo.length());
        System.out.println(haha);
        System.out.println(haha.length());


        String hehe = StrUtil.sub(lo, 0, lo.length() - 1);
        System.out.println(hehe);

        String heihei = StrUtil.sub(lo, 0, lo.length() - 2);
        System.out.println(heihei);



        String patientName = "3？!355";
        System.out.println(patientName.length());
        String first = patientName.substring(0, 3);
        String second = patientName.substring(3, 6);
        System.out.println(first);
        System.out.println(second);

    }
}
