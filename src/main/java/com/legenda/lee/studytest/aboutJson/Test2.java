package com.legenda.lee.studytest.aboutJson;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.List;


/**
 * @author Legenda-Lee(lee.legenda@gmail.com)
 * @date 2021-03-08 18:29:17
 * @description 小疯子
 */
public class Test2 {

    public static void main(String[] args) {

        String json = "{\n" +
                "    \"code\": 200,\n" +
                "    \"msg\": {\n" +
                "        \"tagList\": [\n" +
                "            {\n" +
                "                \"currentSuggestPrice\": 10.41,\n" +
                "                \"exception\": false,\n" +
                "                \"exceptionReason\": null,\n" +
                "                \"platform\": 1,\n" +
                "                \"suggestPriceList\": [\n" +
                "                    {\n" +
                "                        \"reason\": \"竞争激烈，预估至少20.00元可竞得该位次，请酌情出价\",\n" +
                "                        \"bidText\": \"高于￥20.00\\/次\",\n" +
                "                        \"name\": \"第1位\",\n" +
                "                        \"value\": \"20.00\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"reason\": \"竞争激烈，预估至少20.00元可竞得该位次，请酌情出价\",\n" +
                "                        \"bidText\": \"高于￥20.00\\/次\",\n" +
                "                        \"name\": \"第3位\",\n" +
                "                        \"value\": \"20.00\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"reason\": null,\n" +
                "                        \"bidText\": \"￥10.41\\/次\",\n" +
                "                        \"name\": \"8位之后\",\n" +
                "                        \"value\": \"10.41\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"targetList\": [\n" +
                "                    \n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"currentSuggestPrice\": 13.9,\n" +
                "                \"exception\": false,\n" +
                "                \"exceptionReason\": null,\n" +
                "                \"platform\": 2,\n" +
                "                \"suggestPriceList\": [\n" +
                "                    {\n" +
                "                        \"reason\": null,\n" +
                "                        \"bidText\": \"￥41.48\\/次\",\n" +
                "                        \"name\": \"第1位\",\n" +
                "                        \"value\": \"41.48\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"reason\": null,\n" +
                "                        \"bidText\": \"￥14.19\\/次\",\n" +
                "                        \"name\": \"第3位\",\n" +
                "                        \"value\": \"14.19\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"reason\": null,\n" +
                "                        \"bidText\": \"￥13.90\\/次\",\n" +
                "                        \"name\": \"8位之后\",\n" +
                "                        \"value\": \"13.90\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"targetList\": [\n" +
                "                    \n" +
                "                ]\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    \"shopId\": 131740989\n" +
                "}";



        // 把这个字符串转成一个json对象
        JSONObject object = JSONObject.parseObject(json);

        // 最外层有一个key是 msg，拿到这个key对应的东西。
        JSONObject msg = object.getJSONObject("msg");

        // msg里面有一个key是tagList，tagList对象的内容是个集合，拿到这个集合。
        JSONArray tagList = msg.getJSONArray("tagList");


        // 遍历之前先定义一个集合来收集你想要的name和对应的value，收集起来的格式我给你设置一下是：name+冒号+value
        List<String> xiaofengzi = new ArrayList<>();

        // 遍历这个集合
        for(int i=0; i<tagList.size(); i++) {
            // 集合里面又有一个集合，key叫suggestPriceList。
            JSONArray suggestPriceList = tagList.getJSONObject(i).getJSONArray("suggestPriceList");

            // suggestPriceList 这个集合里面又有东西，多个name和对应的value，继续遍历这个集合。
            for(int j=0; j<suggestPriceList.size(); j++) {
                String name = (String) suggestPriceList.getJSONObject(j).get("name");
                String value = (String) suggestPriceList.getJSONObject(j).get("value");
                // 拿到每一个后收集给你
                xiaofengzi.add(name + ":" + value);
            }
        }

        // 打印一下看看收集到的所有的name和value是什么
        System.out.println(JSON.toJSONString(xiaofengzi));

    }
}
