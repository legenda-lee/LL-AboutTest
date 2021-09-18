package com.legenda.lee.studytest.aboutDate;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2021-09-03 2:44 下午
 * @description:
 */
public class Test2 {

    public static void main(String[] args) {
        // // 获取当前日期
        // LocalDate localDate = LocalDate.now();
        // // 结束时间
        // LocalDateTime endTime = LocalDateTime.of(localDate.getYear(), localDate.getMonth(), localDate.getDayOfMonth(), 0, 0);
        // // 开始时间
        // LocalDateTime startTime = endTime.plusDays(-1);
        //
        // System.out.println(startTime);
        // System.out.println(endTime);

        // 获取当前日期
        LocalDate localDate = LocalDate.now();
        // 结束时间
        // LocalDateTime endTime = LocalDateTime.of(localDate.getYear(), localDate.getMonth(), localDate.getDayOfMonth(), 0, 0);
        // 开始时间
        LocalDate startTime = localDate.plusDays(-7);

        System.out.println(startTime);
        System.out.println(localDate.plusDays(1));


        System.out.println(( 1693517534 >>> 23 ) % 128);

    }
}
