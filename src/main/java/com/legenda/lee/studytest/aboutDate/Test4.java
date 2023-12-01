package com.legenda.lee.studytest.aboutDate;

import cn.hutool.json.JSONObject;

import java.text.SimpleDateFormat;

public class Test4 {

    public static void main(String[] args) {
        // for (int i = 0; i < 333333; i++) {
        // System.out.println(System.currentTimeMillis());
        //
        // }

        // long time = System.currentTimeMillis();
        // String currentTime = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(time);
        //
        // System.out.println(currentTime);
        //
        // System.out.println(currentTime.toString().substring(0, 4));

        // System.out.println(String.valueOf(null));

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("名称", "张三");
        jsonObject.put("年龄", 30);

        System.out.println(jsonObject.get("名称"));
        System.out.println(jsonObject.get("年龄"));

        String a = jsonObject.get("名称").toString();
        System.out.println(a);

        System.out.println(null + "");


    }
}
