package com.legenda.lee.studytest.aboutDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class Test3 {

    public static void main(String[] args) {
        // 获取当前日期
        LocalDate localDate = LocalDate.now();
        // 结束时间
        LocalDateTime endTime = LocalDateTime.of(localDate.getYear(), localDate.getMonth(), localDate.getDayOfMonth(), 0, 0);
        // 开始时间
        LocalDateTime startTime = endTime.plusDays(-1);

        System.out.println(localDate);
        System.out.println(endTime);
        System.out.println(startTime);

        System.out.println(Objects.equals("100.00%","100.00%"));

        System.out.println("100.00%".length());
    }
}
