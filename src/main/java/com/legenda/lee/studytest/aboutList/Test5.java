package com.legenda.lee.studytest.aboutList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2020-11-24 9:13 下午
 * @description:
 */
public class Test5 {

    public static void main(String[] args) {


        List<OneSelectValue> doseDoubleList = new ArrayList<>();

        OneSelectValue oneSelectValue1 = new OneSelectValue();
        oneSelectValue1.setAnswer("什么情况");

        OneSelectValue oneSelectValue2 = new OneSelectValue();
        oneSelectValue2.setAnswer("无");

        doseDoubleList.add(oneSelectValue1);
        doseDoubleList.add(oneSelectValue2);


        OneSelectValue oneSelectValue3 = new OneSelectValue();
        oneSelectValue3.setAnswer("什么情况");

        System.out.println(doseDoubleList.contains(oneSelectValue3));

    }
}
