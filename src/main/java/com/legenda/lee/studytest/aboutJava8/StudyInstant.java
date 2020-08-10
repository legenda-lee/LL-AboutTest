package com.legenda.lee.studytest.aboutJava8;

import java.time.Instant;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2020-08-10 22:31
 * @description:
 */
public class StudyInstant {

    public static void main(String[] args) {
        // 创建Instant对象
        Instant instant = Instant.now();
        // 获取秒
        long currentSecond = instant.getEpochSecond();
        // 获取毫秒
        long currentMilli = instant.toEpochMilli();
        System.out.println(currentMilli);

        // 传统方式获取
        System.out.println(System.currentTimeMillis());
    }
}
