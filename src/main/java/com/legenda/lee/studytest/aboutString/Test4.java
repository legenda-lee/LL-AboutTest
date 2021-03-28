package com.legenda.lee.studytest.aboutString;

import org.springframework.util.StringUtils;

/**
 * @author Legenda-Lee
 * @date 2020-06-10 10:56
 * @description
 * @since 1.0.0
 */
public class Test4 {
    public static void main(String[] args) {
        String a = "hh ";
        System.out.println(a.length());

        String b = a.trim();
        System.out.println(b);
        System.out.println(b.length());


        System.out.println("======");
        String add = "{http://10.1.1.211:8080=true|||http://10.1.1.212:8080=true|||http://10.1.1.213:8080=true}";
        String[] ips = add.substring(1, add.length() - 1).split("\\|\\|\\|");
        for (String ip : ips) {
            System.out.println(ip);
            String[] ipStr = ip.split("=");
            for (String s : ipStr) {
                System.out.println(s);
            }
        }

    }
}
