package com.legenda.lee.studytest.aboutInteger;

/**
 * @author Legenda-Lee
 * @date 2020-04-24 03:10
 * @description
 * @since 1.0.0
 */
public class Test2 {
    public static void main(String[] args) {
        Integer a = 7;
        int b = 3;
        System.out.println(a % b);


        String url = "jdbc:mysql://192.168.10.101:3306/szzd_risk?useUnicode=true&characterEncoding=utf8&autoReconnect=true&allowMultiQueries=true&serverTimezone=Asia/Shanghai&useSSL=false";
        String[] slipt = url.split("/");
        String[] slipt1 = url.split("/", 4);
        System.out.println("a");
    }
}
