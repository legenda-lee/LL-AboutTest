package com.legenda.lee.studyHutool.jiemi;

import cn.hutool.core.codec.Base64;
import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.util.ObjectUtil;
import cn.hutool.crypto.SecureUtil;
import cn.hutool.crypto.symmetric.AES;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.legenda.lee.studyHutool.TraceIdContext;
import org.apache.commons.collections.list.TreeList;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

public class Jiemi {


    public static void main(String[] args) {
        String secretKey = "risk_rule!@#1234";
            // // 解密
            // AES aes = SecureUtil.aes(secretKey.getBytes());
            // byte[] decode = Base64.decode("U87qS/Oijj0lsaK0X2ejjmHwy7R5/IeqOU4q8BM8oZZC8PIcA8Vvfz1OJyVy/t/+");
            // String signStr = aes.decryptStr(decode);
            //
            // TraceIdContext traceIdContext = new TraceIdContext();
            // traceIdContext.setInvokeId("123");
            // traceIdContext.setInterchangeableBusinessId("789");
            //
            // JSONObject jsonObject = JSONObject.parseObject(JSONObject.toJSONString(traceIdContext));
            // // 解密后与自己对其加密的结果比对是否是同一个，不是则说明验签失败。
            // String jiaMiHou = sign(jsonObject, secretKey);
            // if (!signStr.equals(jiaMiHou)) {
            //     System.out.println("!!!");
            // } else {
            //     System.out.println("yes");
            // }



            String a = "1PqrRNcJL4sAG1WmYgnTlVLZj8673RPKvAp7SO87ekdC8PIcA8Vvfz1OJyVy/t/+";
                    String realSign = a.replaceAll("/", "风");
        System.out.println(realSign);



                            String realSign2 = realSign.replaceAll("\\+", "控");

                                    String realRealSign = realSign2.replaceAll("控", "\\+");

        System.out.println(realSign2);
        System.out.println(realRealSign);



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
