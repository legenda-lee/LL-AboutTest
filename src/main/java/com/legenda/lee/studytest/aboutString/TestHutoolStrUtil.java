package com.legenda.lee.studytest.aboutString;

import cn.hutool.core.util.StrUtil;

import java.util.Arrays;
import java.util.List;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2020-11-29 7:16 下午
 * @description:
 */
public class TestHutoolStrUtil {

    public static void main(String[] args) {
        System.out.println(StrUtil.containsAny("wjfd王菲ds￥#2的230", 'g', '4'));

        String a = StrUtil.removeAll("wjfd王。菲ds￥#2的230", 'w', '#', '。', '王');
        System.out.println(a);

        String b = StrUtil.removeAll(" wjfd王。菲ds￥#2的2  30 ", " ");
        System.out.println(b.length());
        System.out.println(b);


        // 诊断预处理逻辑：
        // • 分隔：若诊断只有一个则无需分隔。若为多个诊断，需对诊断进行分隔，文本中见到“中英文逗号、句号、斜杠、顿号、空格、分隔号（；）”则进行分隔。
        // • 去掉特殊字符：将不去的字符保留，剩下的都去掉，不去掉的字符包括：大小写英文字母、大小写数字，及（）+ “” '' -。
        char[] chars = new char[]{'，', '。', '/', '、', ' ', ';', '；'};
        // String illness = " wjfd王。菲ds￥   #2的2  30 ";
        String illness = "轻   度感  冒";
        String result = StrUtil.replaceChars(illness.trim() , chars, ",");
        System.out.println(illness);
        System.out.println(result);
        result = StrUtil.replace(result , ",,,,", ",");
        result = StrUtil.replace(result , ",,,", ",");
        result = StrUtil.replace(result , ",,", ",");
        System.out.println(result);

        System.out.println(a);




        // List<String> drugUsageParamList = Arrays.asList(result.split(","));
        // for (String s : drugUsageParamList) {
        //     System.out.println(s);
        // }





    }


}
