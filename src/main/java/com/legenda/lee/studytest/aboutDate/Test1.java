package com.legenda.lee.studytest.aboutDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author Legenda-Lee
 * @date 2020-04-22 14:04
 * @description
 * @since 1.0.0
 */
public class Test1 {

    public static void main(String[] args) throws ParseException {
        Calendar calendar1 = Calendar.getInstance();
        calendar1.setTime(new Date());


        System.out.println(calendar1.get(Calendar.YEAR));
        System.out.println(calendar1.get(Calendar.MONTH) + 1);
        System.out.println(calendar1.get(Calendar.DATE));




        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        SimpleDateFormat sdfDay = new SimpleDateFormat("yyyy-MM-dd");
        //执行次数
        int jobSize =0;

        Date sysTime = new Date();
        Date jobEndTime = sdf.parse(sdfDay.format(new Date())+" "+"8:30:00");

        System.out.println(jobEndTime);
        System.out.println(sysTime.before(jobEndTime));
    }

}
