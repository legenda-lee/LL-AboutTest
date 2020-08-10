package com.legenda.lee.studytest.aboutJava8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2020-08-10 22:27
 * @description: 　　LocalDateTime可以设置年月日时分秒，相当于LocalDate + LocalTime
 */
public class StudyLocalDateTime {

    public static void main(String[] args) {

        // 获取当前日期
        LocalDate localDate = LocalDate.now();
        // 获取当前时间
        LocalTime localTime = LocalTime.now();



        // 获取当前日期时间
        LocalDateTime localDateTime = LocalDateTime.now();
        // 设置日期
        LocalDateTime localDateTime1 = LocalDateTime.of(2019, Month.SEPTEMBER, 10, 14, 46, 56);
        LocalDateTime localDateTime2 = LocalDateTime.of(localDate, localTime);
        LocalDateTime localDateTime3 = localDate.atTime(localTime);
        LocalDateTime localDateTime4 = localTime.atDate(localDate);
        // 获取LocalDate
        LocalDate localDate2 = localDateTime.toLocalDate();
        // 获取LocalTime
        LocalTime localTime2 = localDateTime.toLocalTime();
    }
}
