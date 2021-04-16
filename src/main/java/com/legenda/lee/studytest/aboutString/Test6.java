package com.legenda.lee.studytest.aboutString;

import com.alibaba.fastjson.JSON;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2021-04-12 3:14 下午
 * @description:
 */
public class Test6 {

    public static void main(String[] args) {
        // String multiSelect13 = "333";
        //
        // multiSelect13 = multiSelect13.substring(0, multiSelect13.length() - 1);
        //
        // System.out.println(multiSelect13);
        //
        //
        // String targetPromotionIds = "[34324432]";
        // List<Long> targetPromotionIdList = new ArrayList<>();
        // if (!StringUtils.isEmpty(targetPromotionIds)) {
        //     targetPromotionIdList = JSON.parseArray(targetPromotionIds, Long.class);
        // }
        //
        // System.out.println(JSON.toJSONString(targetPromotionIdList));
        //


        String aa = "432.3";

        System.out.println(Float.valueOf(aa) > 4.3);

    }


}
