package com.legenda.lee.studytest.aboutDate;

import java.util.Calendar;

/**
 * Description: TODO
 * <p>
 * PackageName: com.jkys.turingplatform.commonutils.util
 * <p>
 * FileName: DateUtil.java
 * <p>
 * Copyright: Copyright (c)2020. 91jkys
 *
 * @author wenxiangji@91jkys.com
 * @version 1.0, 2020-07-29
 */
public class DateUtil {


    public final static String yyMMddHH = "yyyyMMddHH";

    public static String format(Long dateTimeStamp, String formatStr){

        Calendar calendar = Calendar.getInstance();
        if ( null != dateTimeStamp){
            calendar.setTimeInMillis(dateTimeStamp);
        }

        return cn.hutool.core.date.DateUtil.format(calendar.getTime(),formatStr);

    }

    public static void main(String[] args) {
        String test = DateUtil.format(System.currentTimeMillis()-3600000, DateUtil.yyMMddHH);
        System.out.println(test);
    }


}
