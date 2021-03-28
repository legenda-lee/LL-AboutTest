package com.legenda.lee.studytest.aboutJson;

import com.alibaba.fastjson.JSON;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2020-09-01 4:34 下午
 * @description:
 */
public class Test4 {

    public static void main(String[] args) {
        Boolean a = true;
        System.out.println(a);

        System.out.println(JSON.toJSONString("drugCompositionConflictOutput"));
    }
}
