package com.legenda.lee.studytest.aboutProperties;

/**
 * @author Legenda-Lee
 * @date 2020-05-18 17:18
 * @description
 * @since 1.0.0
 */
public class Test1 {
    public static void main(String[] args) {
        String sourceBasePath = PropertyUtil.getProperty("sourceBasePath");
        System.out.println(sourceBasePath);
    }
}
