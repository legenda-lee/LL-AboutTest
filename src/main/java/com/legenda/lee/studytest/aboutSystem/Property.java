package com.legenda.lee.studytest.aboutSystem;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2020-08-09 22:55
 * @description:
 */
public class Property {

    public static void main(String[] args) {
        String projectPath = System.getProperty("user.dir");

        System.out.println(projectPath);

        System.out.println(Runtime.getRuntime().availableProcessors());

        List<String> hh = new ArrayList<>();
        hh.add(null);
        hh.add(null);
        hh.add(null);
        System.out.println(hh.size());
    }
}
