package com.legenda.lee.studytest.aboutJson;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.util.StringUtils;

public class Test8 {

    public static void main(String[] args) {
        String content = "{\"ip\":\"122.225.193.114\",\"pro\":\"浙江省\",\"proCode\":\"330000\",\"city\":\"杭州市\",\"cityCode\":\"330100\",\"region\":\"\",\"regionCode\":\"0\",\"addr\":\"浙江省杭州市 电信\",\"regionNames\":\"\",\"err\":\"\"}";

        boolean checkResult = false;
        try {
            JSONObject contentJson = JSON.parseObject(content);
            String msg = contentJson.getString("addr");

            if (!StringUtils.isEmpty(msg) && msg.contains("杭州")) {
                checkResult = true;
            }
        } catch (Exception e) {
        }

        JSONObject resultJson = new JSONObject();
        resultJson.put("result", checkResult);

        System.out.println(resultJson.toString());
        System.out.println(resultJson.toJSONString());
    }
}
