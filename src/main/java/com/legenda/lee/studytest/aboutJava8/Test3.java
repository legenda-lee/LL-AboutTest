package com.legenda.lee.studytest.aboutJava8;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2021-08-02 11:17 上午
 * @description:
 */
public class Test3 {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();

        // 结束时间
        LocalDateTime endTime = LocalDateTime.of(localDate.getYear(), localDate.getMonth(), localDate.getDayOfMonth(), 11, 30);

        // 开始时间
        LocalDateTime startTime = endTime.plusDays(-2);

        System.out.println(endTime);
        System.out.println(startTime);


    }
}
