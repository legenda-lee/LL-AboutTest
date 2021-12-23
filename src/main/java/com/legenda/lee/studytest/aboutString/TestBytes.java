package com.legenda.lee.studytest.aboutString;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2020-10-02 10:21 上午
 * @description:
 */
public class TestBytes {

    public static void main(String[] args) {
        String name = "Legenda-Lee";
        byte[] nameByte = name.getBytes();
        for (byte b : nameByte) {
            System.out.println(b);
        }

        System.out.println(LocalDateTime.now());
        String time = "2021-12-07T15:45:01";
        System.out.println(strToLocalDate(time));

    }

    public static LocalDateTime strToLocalDate(String dateTime) {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime ldt = LocalDateTime.parse(dateTime, df);
        return ldt;
    }
}

