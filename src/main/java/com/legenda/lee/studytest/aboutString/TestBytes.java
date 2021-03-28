package com.legenda.lee.studytest.aboutString;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2020-10-02 10:21 上午
 * @description:
 */
public class TestBytes {

    public static void main(String[] args) {
        String name = "Legenda-Lee";
        byte[] nameByte = name.getBytes();
        for (byte b : nameByte) {
            System.out.println(b);
        }
    }
}

