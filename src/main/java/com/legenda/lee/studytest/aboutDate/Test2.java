package com.legenda.lee.studytest.aboutDate;

import java.util.Calendar;
import java.util.Date;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2021-10-14 2:10 下午
 * @description:
 */
public class Test2 {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        //calendar的日期设为今天
        calendar.setTime(new Date());
        //前daySize天0点开始
        calendar.set(Calendar.HOUR_OF_DAY, -24*2+0*1);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        //时间戳到秒级
        long startTime = calendar.getTimeInMillis()/1000;
        Calendar calendarEnd = Calendar.getInstance();
        calendarEnd.setTime(new Date());
        calendarEnd.set(Calendar.HOUR_OF_DAY, -24*2+(0+1)*1-1);
        calendarEnd.set(Calendar.MINUTE, 59);
        calendarEnd.set(Calendar.SECOND, 59);
        //时间戳到秒级
        long endTime = calendarEnd.getTimeInMillis()/1000;


        System.out.println(startTime);
        System.out.println(endTime);


    }
}
