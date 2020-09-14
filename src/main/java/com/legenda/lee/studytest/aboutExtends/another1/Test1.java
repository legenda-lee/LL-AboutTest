package com.legenda.lee.studytest.aboutExtends.another1;

import cn.hutool.core.bean.BeanUtil;
import com.alibaba.fastjson.JSON;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2020-09-10 10:11 上午
 * @description:
 */
public class Test1 {

    public static void main(String[] args) {
        Set<String> drugCompositions = new HashSet<>();
        drugCompositions.add("hha");
        drugCompositions.add("hhe");
        drugCompositions.add("xxi");
        drugCompositions.add("hhei");

        DrugCompositionConflictRequest drugCompositionConflictRequest = new DrugCompositionConflictRequest();
        drugCompositionConflictRequest.setDrugCompositions(drugCompositions);

        drugCompositionConflictRequest.setEventCode("Event0001");
        drugCompositionConflictRequest.setAppName("Weixin");
        drugCompositionConflictRequest.setRequestId("3333");

        String jsonStr = JSON.toJSONString(drugCompositionConflictRequest);

        System.out.println(jsonStr);

        DrugCompositionConflictRequest a = JSON.parseObject(jsonStr, DrugCompositionConflictRequest.class);
        System.out.println(JSON.toJSONString(a));

        Object o = a;
        System.out.println(o);

        // BaseRequestParam b = JSON.parseObject(jsonStr, BaseRequestParam.class);
        // System.out.println(JSON.toJSONString(b));
        //
        // BaseRequestParam bb = a;
        // System.out.println(JSON.toJSONString(bb));
        //
        // Map<String, Object> ruleParamMap = BeanUtil.beanToMap(bb);
        // System.out.println(ruleParamMap);

        // Object o = a;
        // System.out.println(JSON.toJSONString(o));
        //
        // Map<String, String> map = new HashMap<>();
        // map.put("DrugCompositionConflictRequest", JSON.toJSONString(a));
        // Object oo = map;
        // System.out.println(JSON.toJSONString(oo));


        System.out.println("=======");
        BaseRequestParam requestParam = get();
        System.out.println(requestParam);
    }


    private static BaseRequestParam get() {
        Set<String> drugCompositions = new HashSet<>();
        drugCompositions.add("hha");
        drugCompositions.add("hhe");
        drugCompositions.add("xxi");
        drugCompositions.add("hhei");
        DrugCompositionConflictRequest drugCompositionConflictRequest = new DrugCompositionConflictRequest();
        drugCompositionConflictRequest.setDrugCompositions(drugCompositions);

        drugCompositionConflictRequest.setEventCode("Event0001");
        drugCompositionConflictRequest.setAppName("Weixin");
        drugCompositionConflictRequest.setRequestId("3333");
        return drugCompositionConflictRequest;
    }
}
