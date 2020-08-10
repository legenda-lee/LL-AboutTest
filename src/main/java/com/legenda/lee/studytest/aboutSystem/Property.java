package com.legenda.lee.studytest.aboutSystem;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2020-08-09 22:55
 * @description:
 */
public class Property {

    public static void main(String[] args) {
        String projectPath = System.getProperty("user.dir");

        System.out.println(projectPath);
    }
}
