package com.legenda.lee.studytest.aboutString;

import org.springframework.util.StringUtils;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2021-01-29 11:26 上午
 * @description:
 */
public class TestSub {

    public static void main(String[] args) {
        // String a = "汇总数据-";
        //
        // System.out.println(a.substring(0, a.length() - 1));
        //
        // System.out.println(1 << 1);
        //
        //
        // System.out.println("yyyyMMddHHmmssSSS".substring(10));



        String title1 = "二型糖尿病并发糖尿病肾病、糖尿病酮症酸中毒、合并冠心病、";


        if (!StringUtils.isEmpty(title1)) {
            // 去除最后一个顿号、
            title1 = title1.substring(0, title1.length() - 1);

            // 二型糖尿病并发（第8、9题非无选项，中间、分隔），合并（第10题非无选项中间、分隔）
            // 第十题有有效选项的话则有  合并 二字，需把合并二字之前的顿号改为逗号。
            if (title1.contains("合并")) {
                String temp1 = title1.substring(0, title1.indexOf("合并"));
                temp1 = temp1.substring(0, temp1.length()- 1).concat("，");

                title1 = temp1.concat(title1.substring(title1.indexOf("合并"))).concat("。");
            }
        }

        System.out.println(title1);

    }
}
