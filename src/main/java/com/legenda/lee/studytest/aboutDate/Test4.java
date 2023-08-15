package com.legenda.lee.studytest.aboutDate;

import java.text.SimpleDateFormat;

public class Test4 {

    public static void main(String[] args) {
        // for (int i = 0; i < 333333; i++) {
        // System.out.println(System.currentTimeMillis());
        //
        // }

        long time = System.currentTimeMillis();
        String currentTime = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(time);

        System.out.println(currentTime);


    }
}
