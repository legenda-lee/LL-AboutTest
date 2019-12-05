package com.legenda.lee.studytest.aboutMap;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Legenda-Lee
 * @date 2019-12-05 13:41
 * @description 两个map，需要合并，遇到有相同的key时，取对应的value值比较大的那个。
 * @since 1.0.0
 */
public class Test1 {
    public static void main(String[] args) {

        Map<String, String> yktFeaturesMapOfIdCard = new HashMap<>();
        yktFeaturesMapOfIdCard.put("name", "Legenda-Lee");
        yktFeaturesMapOfIdCard.put("age", "100");
        yktFeaturesMapOfIdCard.put("phone", "110");

        Map<String, String> yktFeaturesMapOfPhone = new HashMap<>();
        yktFeaturesMapOfPhone.put("age", "1000");
        yktFeaturesMapOfPhone.put("sex", "male");
        yktFeaturesMapOfPhone.put("address", "China");

        // 结果合并
        Map<String, String> yktFeaturesMap = new HashMap<>();
        for (Map.Entry<String, String> IdCardEntry : yktFeaturesMapOfIdCard.entrySet()) {
            for (Map.Entry<String, String> phoneEntry : yktFeaturesMapOfPhone.entrySet()) {
                if (IdCardEntry.getKey().equals(phoneEntry.getKey())) {
                    if (Integer.valueOf(IdCardEntry.getValue()) > Integer.valueOf(phoneEntry.getValue())) {
                        yktFeaturesMap.put(IdCardEntry.getKey(), IdCardEntry.getValue());
                    } else {
                        yktFeaturesMap.put(phoneEntry.getKey(), phoneEntry.getValue());
                    }
                } else {
                    yktFeaturesMap.put(IdCardEntry.getKey(), IdCardEntry.getValue());
                }
            }
        }

        for (Map.Entry<String, String> phoneEntry : yktFeaturesMapOfPhone.entrySet()) {
            for (Map.Entry<String, String> IdCardEntry : yktFeaturesMapOfIdCard.entrySet()) {
                if (phoneEntry.getKey().equals(IdCardEntry.getKey())) {
                    continue;
                } else {
                    yktFeaturesMap.put(phoneEntry.getKey(), phoneEntry.getValue());
                }
            }
        }

        System.out.println(yktFeaturesMap);
    }

}
