package com.legenda.lee.studytest.aboutJava8;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2022-12-02 下午1:50
 * @description:
 */
public class StudyLocalDay2 {

    public static void main(String[] args) {
        // 获取当前日期
        LocalDate localDate = LocalDate.now();
        // 结束时间
        LocalDateTime endTime = LocalDateTime.of(localDate.getYear(), localDate.getMonth(), localDate.getDayOfMonth(), 0, 0);
        // 开始时间
        LocalDateTime startTime = endTime.plusDays(-1);


        System.out.println(startTime);
        System.out.println(endTime);
    }
}
