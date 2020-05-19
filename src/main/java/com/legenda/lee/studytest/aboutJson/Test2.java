package com.legenda.lee.studytest.aboutJson;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

/**
 * @author Legenda-Lee
 * @date 2020-05-19 11:07
 * @description json字符串格式化友好的界面
 * @since 1.0.0
 */
public class Test2 {

    public static void main(String[] args) {
        String json = "{\"amount\": 100, \"userId\": \"123456\", \"flagCard\": \"0\", \"userName\": \"余文乐\", \"loanPeriod\": 3, \"productCode\": \"product_xyb_self\", \"loanBankCard\": \"6217001540016448005\", \"correlationId\": \"KLO202003270000001008\"}";
        String json1 = "";
        JSONObject object = JSONObject.parseObject(json1);
        String analyseLog = JSON.toJSONString(object, SerializerFeature.PrettyFormat, SerializerFeature.WriteMapNullValue,
                SerializerFeature.WriteDateUseDateFormat);
        System.out.println(analyseLog);
    }
}
