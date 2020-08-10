package com.legenda.lee.studytest.aboutJava8;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2020-08-10 22:25
 * @description: LocalTime是时间处理类，具体API如下：
 */
public class StudyLocalTime {

    public static void main(String[] args) {
        // 获取当前时间
        LocalTime localTime = LocalTime.now();
        // 设置时间
        // LocalTime localTime = LocalTime.of(13, 51, 10);
        //获取小时
        int hour = localTime.getHour();    // 结果：13
        int hour1 = localTime.get(ChronoField.HOUR_OF_DAY); // 结果：13

        System.out.println(hour);
        System.out.println(hour1);
        //获取分
        int minute = localTime.getMinute();  // 结果：51
        int minute1 = localTime.get(ChronoField.MINUTE_OF_HOUR); // 结果：51
        System.out.println(minute);
        System.out.println(minute1);
        //获取秒
        int second = localTime.getSecond();   // 结果：10
        int second1 = localTime.get(ChronoField.SECOND_OF_MINUTE); // 结果：10
        System.out.println(second);
        System.out.println(second1);

    }
}
