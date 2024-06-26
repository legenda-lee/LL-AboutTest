package com.legenda.lee.studyHutool;

import cn.hutool.core.date.SystemClock;
import cn.hutool.core.lang.UUID;
import cn.hutool.core.util.StrUtil;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Test1 {
    public static String RISK_LOG_PARAM_TEMPLATE = "risk-{}-{}-{}";

    public static void main(String[] args) {
        //String a =  StrUtil.format(RISK_LOG_PARAM_TEMPLATE, 1111, null, "33333");
        //System.out.println(a);


        //Set<String> set = new HashSet<>();
        for (int i = 0; i < 10000000; i++) {
        //    if (!set.add(generatorStrKey())) {
        //        System.out.println("重复了");
        //    }
            String a = getSerialNumber();
            if (a.length() != 16) {
                System.out.println(a);
            }
        }

        //Long a = 4234L;
        //System.out.println(a.toString());
        //System.out.println(String.valueOf(a));
    }


    private static String generatorStrKey() {
        int orderId = UUID.randomUUID().toString().hashCode();
        int temp = Math.abs(orderId);
        String now = String.valueOf(SystemClock.now()).substring(0, 8);
        String suffix = String.format("%010d", temp);
        return now + suffix;
    }


    public static String getSerialNumber() {
        int hashCode = UUID.randomUUID().toString().hashCode();
        if (hashCode < 0) {
            hashCode = -hashCode;
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        return sdf.format(new Date()).substring(2, 8) + String.format("%010d", hashCode);
    }
}
