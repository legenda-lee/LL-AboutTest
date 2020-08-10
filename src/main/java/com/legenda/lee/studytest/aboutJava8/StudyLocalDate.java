package com.legenda.lee.studytest.aboutJava8;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2020-08-10 22:16
 * @description:
 */
public class StudyLocalDate {
    public static void main(String[] args) {

        // 　LocalDate是日期处理类，具体API如下：
        // 获取当前日期
        LocalDate localDate = LocalDate.now();
        // 设置日期
        // LocalDate localDate = LocalDate.of(2019, 9, 10);
        // 获取年
        int year = localDate.getYear();     //结果：2019
        System.out.println(year);
        int year1 = localDate.get(ChronoField.YEAR); //结果：2019
        System.out.println(year1);
        // 获取月
        Month month = localDate.getMonth();   // 结果：SEPTEMBER
        int month1 = localDate.get(ChronoField.MONTH_OF_YEAR); //结果：9
        System.out.println(month1);
        // 获取日
        int day = localDate.getDayOfMonth();   //结果：10
        System.out.println(day);
        int day1 = localDate.get(ChronoField.DAY_OF_MONTH); // 结果：10
        System.out.println(day1);
        // 获取星期
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();   //结果：TUESDAY
        int dayOfWeek1 = localDate.get(ChronoField.DAY_OF_WEEK); //结果：2
        System.out.println(dayOfWeek);
        System.out.println(dayOfWeek1);

    }
}
