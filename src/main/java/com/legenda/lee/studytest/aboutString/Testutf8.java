package com.legenda.lee.studytest.aboutString;

import java.nio.charset.StandardCharsets;

public class Testutf8 {

    public static void main(String[] args) {
        String content = "{\"ip\":\"122.225.193.114\",\"pro\":\"浙江省\",\"proCode\":\"330000\",\"city\":\"杭州市\",\"cityCode\":\"330100\",\"region\":\"\",\"regionCode\":\"0\",\"addr\":\"浙江省杭州市 电信\",\"regionNames\":\"\",\"err\":\"\"}";

        byte[] contentByte = content.getBytes(StandardCharsets.UTF_8);

        System.out.println(contentByte);

        String responseResult1 = new String(contentByte, StandardCharsets.UTF_8);
        System.out.println(contentByte);
        String responseResult2 = new String(contentByte, StandardCharsets.UTF_8);
        System.out.println(contentByte);


        System.out.println(responseResult1);
        System.out.println(responseResult2);
        System.out.println(responseResult2.equals(responseResult1));
        System.out.println(responseResult1== responseResult2);
        System.out.println(responseResult1== responseResult2);



    }
}
