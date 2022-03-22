package com.legenda.lee.studytest.aboutMap;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2021-06-17 11:05 上午
 * @description:
 */
public class Test3 {

    public static void main(String[] args) {
        Map<String, String> yktFeaturesMapOfIdCard = new HashMap<>();
        yktFeaturesMapOfIdCard.put("name", "Legenda-Lee");
        yktFeaturesMapOfIdCard.put("age", "0");
        yktFeaturesMapOfIdCard.put("dd", "china");

        System.out.println(yktFeaturesMapOfIdCard.get("3333"));
        System.out.println(yktFeaturesMapOfIdCard.get("dd"));

        System.out.println(yktFeaturesMapOfIdCard.put("dd", "hhhh"));
        System.out.println(yktFeaturesMapOfIdCard.put("3333", "hhhh"));
        System.out.println(yktFeaturesMapOfIdCard.get("dd"));

    }
}
