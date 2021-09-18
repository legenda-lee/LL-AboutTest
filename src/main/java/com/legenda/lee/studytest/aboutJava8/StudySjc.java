package com.legenda.lee.studytest.aboutJava8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2020-08-10 22:27
 * @description: 　　LocalDateTime可以设置年月日时分秒，相当于LocalDate + LocalTime
 */
public class StudySjc {

    public static void main(String[] args) {

        // 获取当前日期
        LocalDate localDate = LocalDate.now();
        // 获取当前时间
        LocalTime localTime = LocalTime.now();



        // 获取当前日期时间
        LocalDateTime localDateTime = LocalDateTime.now();
        // 设置日期
        LocalDateTime localDateTime1 = LocalDateTime.of(2019, 7, 1, 0, 0, 0);
        LocalDateTime localDateTime2 = LocalDateTime.of(localDate, localTime);
        LocalDateTime localDateTime3 = localDate.atTime(localTime);
        LocalDateTime localDateTime4 = localTime.atDate(localDate);
        // 获取LocalDate
        LocalDate localDate2 = localDateTime.toLocalDate();
        // 获取LocalTime
        LocalTime localTime2 = localDateTime.toLocalTime();



        LocalDateTime aa = LocalDateTime.now();
        LocalDateTime yesterday = aa.minusDays(1);
        LocalDateTime hhhh = LocalDateTime.of(yesterday.getYear(), yesterday.getMonth(), yesterday.getDayOfMonth(), 23, 59, 59);
        System.out.println(hhhh.toString().replace("T", " "));

        System.out.println("时间戳");
        System.out.println("时间戳");
    }
}
