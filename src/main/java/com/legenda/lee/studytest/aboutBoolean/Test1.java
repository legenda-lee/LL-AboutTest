package com.legenda.lee.studytest.aboutBoolean;

import com.alibaba.fastjson.JSON;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2021-08-09 11:01 上午
 * @description:
 */
public class Test1 {

    public static void main(String[] args) {
        final boolean[] alreadyHandleType27 = {false, false, false, false, false};

        System.out.println(JSON.toJSONString(alreadyHandleType27));

        alreadyHandleType27[3] = true;

        System.out.println(JSON.toJSONString(alreadyHandleType27));

    }
}
