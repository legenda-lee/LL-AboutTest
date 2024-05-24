package com.legenda.lee.studyHutool.jiami;

import cn.hutool.core.codec.Base64;
import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.net.URLEncoder;
import cn.hutool.core.util.ObjectUtil;
import cn.hutool.crypto.SecureUtil;
import cn.hutool.crypto.symmetric.AES;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.legenda.lee.studyHutool.TraceIdContext;
import io.netty.util.CharsetUtil;
import org.apache.commons.collections.list.TreeList;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

public class Jiami {

    public static void main(String[] args) {
        sendMsg("哈哈哈", "123", "7899");
    }

    public static void sendMsg(String message, String invokeId, String interchangeableBusinessId) {
            String secretKey = "risk_rule!@#1234";
        // 加签
        AES aes = SecureUtil.aes(secretKey.getBytes());
        TraceIdContext traceIdContext = new TraceIdContext();
        traceIdContext.setInvokeId(invokeId);
        traceIdContext.setInterchangeableBusinessId(interchangeableBusinessId);
        JSONObject jsonObject = JSONObject.parseObject(JSONObject.toJSONString(traceIdContext));
        byte[] encrypt = aes.encrypt(sign(jsonObject, secretKey));
        String encode = Base64.encode(encrypt);
        String sign = URLEncoder.createDefault().encode(encode, CharsetUtil.UTF_8);

        System.out.println(sign);

    }




    private static String sign(JSONObject jsonObject, String salt) {
        try {
            Map objMap = sortTreeMap(jsonObject.getInnerMap());
            return SecureUtil.signParamsMd5(objMap, salt);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static TreeMap sortTreeMap(Map map) {
        if (null == map) {
            return null;
        }

        // 移除特殊字段
        map.remove("extend");
        map.remove("extension");
        map.remove("sql");
        map.remove("operationExpression");
        map.remove("updateTime");
        map.remove("releaseTime");
        map.remove("submitTime");
        map.remove("ruleDesc");
        map.remove("script");
        map.remove("matchMsg");
        map.remove("unMatchMsg");

        Iterator iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            Object key = iterator.next();
            Object v = map.get(key);
            if (v instanceof LocalDateTime || v instanceof LocalDate
                || v instanceof LocalTime || v instanceof Date) {
                iterator.remove();
            }
            if (v instanceof Number) {
                iterator.remove();
            }
        }

        TreeMap<String, Object> treeMap = new TreeMap();
        if (CollectionUtil.isNotEmpty(map)) {
            treeMap.putAll(map);
        }

        for (Map.Entry<String, Object> entry : treeMap.entrySet()) {
            if (ObjectUtil.isNull(entry.getValue())) {
                continue;
            }
            if (entry.getValue() instanceof JSONObject) {
                Map objMap = ((JSONObject) entry.getValue()).getInnerMap();
                TreeMap tree = sortTreeMap(objMap);
                if (ObjectUtil.isNotNull(tree)) {
                    treeMap.put(entry.getKey(), tree);
                }
            }
            if (entry.getValue() instanceof JSONArray) {
                TreeList treeMap2 = new TreeList();
                for (Object obj : (JSONArray) entry.getValue()) {
                    if (ObjectUtil.isNull(obj)) {
                        continue;
                    }
                    if (obj instanceof JSONObject || obj instanceof JSONArray) {
                        JSONObject jsonObject = JSONObject.parseObject(JSONObject.toJSONString(obj));
                        Map objMap = jsonObject.getInnerMap();
                        TreeMap tree = sortTreeMap(objMap);
                        if (ObjectUtil.isNotNull(tree)) {
                            treeMap2.add(tree);
                        }
                    } else {
                        treeMap2.add(obj);
                    }
                }
                treeMap.put(entry.getKey(), treeMap2);
            }
        }

        return treeMap;
    }
}
