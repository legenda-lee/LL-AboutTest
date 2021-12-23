package com.legenda.lee.studytest.aboutString;

import cn.hutool.core.date.DateUtil;
import com.alibaba.fastjson.JSON;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2021-11-26 3:33 下午
 * @description:
 */
public class TestChange {
    public static void main(String[] args) {
        Map<String, Object> ruleParamMap = new HashMap<>();

        String a = "aaaaa";

        ruleParamMap.put("haha", a);

        a = "4324423";

        ruleParamMap.put("hehe", a);

        System.out.println(JSON.toJSONString(ruleParamMap));



        StringBuilder sb = new StringBuilder();
        sb.append("dfdf").append(" | ").append("hhhh").append(" | ");

        System.out.println(sb.toString());
        System.out.println(sb.toString().substring(0, sb.toString().length() - 3));

        int aa = (int) System.currentTimeMillis();
        System.out.println(aa);
        System.out.println(System.currentTimeMillis());
        System.out.println(DateUtil.currentSeconds());
        System.out.println(Long.valueOf(DateUtil.currentSeconds()).intValue());
    }


}
