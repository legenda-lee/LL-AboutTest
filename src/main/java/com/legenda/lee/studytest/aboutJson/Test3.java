package com.legenda.lee.studytest.aboutJson;

import com.alibaba.fastjson.JSON;

/**
 * @author Legenda-Lee
 * @date 2020-06-05 16:27
 * @description
 * @since 1.0.0
 */
public class Test3 {

    public static void main(String[] args) {
        User a = new User();
        a.setSuccess(true);

        System.out.println(JSON.toJSONString(a));
    }
}
