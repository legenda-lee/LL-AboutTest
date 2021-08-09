package com.legenda.lee.studytest.aboutJava8;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2021-08-09 11:26 上午
 * @description:
 */
public class AboutWeek {
    public static void main(String[] args) {


        // 随便虚拟一个日期
        LocalDate now = LocalDate.now().plusDays(3);
        System.out.println("当前日期: " + now + " " + now.getDayOfWeek());
        // 求这个日期上一周的周一、周日
        LocalDate todayOfLastWeek = now.minusDays(7);
        LocalDate monday = todayOfLastWeek.with(TemporalAdjusters.previous(DayOfWeek.SUNDAY)).plusDays(1);
        LocalDate sunday = todayOfLastWeek.with(TemporalAdjusters.next(DayOfWeek.MONDAY)).minusDays(1);
        System.out.println("当前日期：" + now + " 上一周的周一：" + monday + " " + monday.getDayOfWeek());
        System.out.println("当前日期：" + now + " 上一周的周日：" + sunday + " " + sunday.getDayOfWeek());


    }
}
