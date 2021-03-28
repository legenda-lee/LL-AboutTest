package com.legenda.lee.studytest.aboutJava8;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2020-09-21 9:09 下午
 * @description:
 */
public class Test1 {

    public static void main(String[] args) {
        // 获取当前日期
        // LocalDate localDate = LocalDate.now();
        LocalDate localDate = LocalDate.of(2019, 11, 12);

        // 获取月
        int month = localDate.get(ChronoField.MONTH_OF_YEAR);
        String monthStr = "";
        if (month < 10) {
            monthStr = monthStr.concat("0").concat(String.valueOf(month));
        } else {
            monthStr = monthStr.concat(String.valueOf(month));
        }

        // 获取日
        int day = localDate.get(ChronoField.DAY_OF_MONTH);
        String dayStr = "";
        if (day < 10) {
            dayStr = dayStr.concat("0").concat(String.valueOf(day));
        } else {
            dayStr = dayStr.concat(String.valueOf(day));
        }

        System.out.println(monthStr.concat(dayStr));
    }
}
