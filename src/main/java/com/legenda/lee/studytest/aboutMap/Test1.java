package com.legenda.lee.studytest.aboutMap;

import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

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
        yktFeaturesMapOfIdCard.put("age", "0");
        yktFeaturesMapOfIdCard.put("dd", "china");

        Map<String, String> yktFeaturesMapOfPhone = new HashMap<>();
        yktFeaturesMapOfPhone.put("age", "1");
        yktFeaturesMapOfPhone.put("sex", "male");
        yktFeaturesMapOfPhone.put("address", "china");


        Map<String, String> yktFeaturesMap = new HashMap<>();

        if (!CollectionUtils.isEmpty(yktFeaturesMapOfPhone)) {
            for (Map.Entry<String, String> phoneEntry : yktFeaturesMapOfPhone.entrySet()) {
                if (!StringUtils.isEmpty(yktFeaturesMapOfIdCard.get(phoneEntry.getKey()))) {
                    if (Integer.valueOf(yktFeaturesMapOfIdCard.get(phoneEntry.getKey())) < Integer.valueOf(phoneEntry.getValue())) {
                        yktFeaturesMapOfIdCard.put(phoneEntry.getKey(), phoneEntry.getValue());
                    }
                } else {
                    yktFeaturesMapOfIdCard.put(phoneEntry.getKey(), phoneEntry.getValue());
                }
            }
        }

        yktFeaturesMap.putAll(yktFeaturesMapOfIdCard);

        System.out.println(yktFeaturesMap);

        yktFeaturesMapOfIdCard = null;

        System.out.println(yktFeaturesMap);
    }

}
