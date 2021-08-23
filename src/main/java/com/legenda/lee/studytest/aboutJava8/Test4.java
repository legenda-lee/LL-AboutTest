package com.legenda.lee.studytest.aboutJava8;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2021-08-16 2:34 下午
 * @description:
 */
public class Test4 {

    public static void main(String[] args) {
        // 获取当前日期
        LocalDate localDate = LocalDate.now();
        // 结束时间
        LocalDateTime endTime = LocalDateTime.of(localDate.getYear(), localDate.getMonth(), localDate.getDayOfMonth(), 11, 30);
        // 开始时间
        LocalDateTime startTime = endTime.plusDays(-1);


        System.out.println(startTime);
        System.out.println(endTime);




    }
}
