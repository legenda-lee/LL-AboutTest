package com.legenda.lee.studytest.aboutDate;

import java.util.Calendar;
import java.util.Date;

/**
 * @author Legenda-Lee
 * @date 2020-04-22 14:04
 * @description
 * @since 1.0.0
 */
public class Test1 {

    public static void main(String[] args) {
        Calendar calendar1 = Calendar.getInstance();
        calendar1.setTime(new Date());


        System.out.println(calendar1.get(Calendar.YEAR));
        System.out.println(calendar1.get(Calendar.MONTH) + 1);
        System.out.println(calendar1.get(Calendar.DATE));
    }

}
