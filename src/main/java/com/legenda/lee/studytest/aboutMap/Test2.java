package com.legenda.lee.studytest.aboutMap;

import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Legenda-Lee
 * @date 2019-12-05 17:25
 * @description jdk8中map的遍历方式，顺便用这种方式实现了Test1的功能。
 * @since 1.0.0
 */
public class Test2 {
    public static void main(String[] args) {

        Map<String, String> yktFeaturesMapOfIdCard = new HashMap<>();
        yktFeaturesMapOfIdCard.put("name", "Legenda-Lee");
        yktFeaturesMapOfIdCard.put("age", "7");
        yktFeaturesMapOfIdCard.put("dd", "china");

        yktFeaturesMapOfIdCard.forEach((k, v) -> {
            System.out.println(k + " : " + v);
        });

        System.out.println("======================");

        Map<String, String> yktFeaturesMapOfPhone = new HashMap<>();
        yktFeaturesMapOfPhone.put("age", "1");
        yktFeaturesMapOfPhone.put("sex", "male");
        yktFeaturesMapOfPhone.put("address", "china");

        yktFeaturesMapOfPhone.forEach((k, v) -> {
            if (!StringUtils.isEmpty(yktFeaturesMapOfIdCard.get(k))) {
                if (Integer.valueOf(yktFeaturesMapOfIdCard.get(k)) < Integer.valueOf(v)) {
                    yktFeaturesMapOfIdCard.put(k, v);
                }
            } else {
                yktFeaturesMapOfIdCard.put(k, v);
            }
        });

        System.out.println(yktFeaturesMapOfIdCard);
    }
}
