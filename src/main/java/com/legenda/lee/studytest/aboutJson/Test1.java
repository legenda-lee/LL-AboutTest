package com.legenda.lee.studytest.aboutJson;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.Map;
import java.util.Set;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2020-02-13 17:49
 * @description:
 */
public class Test1 {
    public static void main(String[] args) {
        //新建JSONObject对象
        JSONObject object1 = new JSONObject();

        //1.在JSONObject对象中放入键值对
        object1.put("name", "张三");
        object1.put("name1", "张三1");
        object1.put("name2", "张三2");

        //2.根据key获取value
        String name = (String) object1.get("name");
        System.out.println(name);

        //3.获取JSONObject中的键值对个数
        int size = object1.size();
        System.out.println(size);

        //4.判断是否为空
        boolean result = object1.isEmpty();
        System.out.println(result);

        //5.是否包含对应的key值，包含返回true，不包含返回false
        boolean isContainsKeyResult = object1.containsKey("name");
        System.out.println(isContainsKeyResult);

        //6.是否包含对应的value值，包含返回true，不包含返回false
        boolean isContainsValueResult = object1.containsValue("王五");
        System.out.println(isContainsValueResult);

        //7.JSONObjct对象中的value是一个JSONObject对象，即根据key获取对应的JSONObject对象；
        JSONObject object2 = new JSONObject();
        //将jsonobject对象作为value进行设置
        object2.put("student1", object1);
        JSONObject student =object2.getJSONObject("student1");
        System.out.println(student);

        //8.如果JSONObject对象中的value是一个JSONObject数组，既根据key获取对应的JSONObject数组；
        JSONObject objectArray = new JSONObject();
        //创建JSONArray数组
        JSONArray jsonArray = new JSONArray();
        //在JSONArray数组设值:jsonArray.add(int index, Object value);
        jsonArray.add(0, "this is a jsonArray value");
        jsonArray.add(1, "another jsonArray value");
        objectArray.put("testArray", jsonArray);
        //获取JSONObject对象中的JSONArray数组
        JSONArray jsonArray2 = objectArray.getJSONArray("testArray");
        System.out.println(jsonArray2);

        //9.remove.根据key移除JSONObject对象中的某个键值对
        object1.remove("name");
        System.out.println(object1);

        //10.取得JSONObject对象中key的集合
        Set<String> keySet= object1.keySet();
        for (String key : keySet) {
            System.out.print("   "+key);
        }
        System.out.println();

        //11.取得JSONObject对象中的键和值的映射关系
        Set<Map.Entry<String, Object>> entrySet = object1.entrySet();
        for (Map.Entry<String, Object> entry : entrySet) {
            System.out.println(entry);
        }

        //12.转换为json字符串
        String str1 = object1.toJSONString();
        System.out.println(str1);
        String str2 =object1.toString();
        System.out.println(str2);


        //13.json字符串转即送对象
        JSONObject object3 = JSONObject.parseObject(str1);
        System.out.println(object3.get("name"));
        System.out.println(object3.get("name1"));
        System.out.println(object3.get("name2"));


        //14.json字符串转即送对象
        JSONObject object4 = JSONObject.parseObject("{\"from\":\"zh\",\"to\":\"en\",\"trans_result\":[{\"src\":\"\\u5475\\u5475\",\"dst\":\"Ha-ha\"}]}\n");
        System.out.println(object4.get("from"));
        System.out.println(object4.get("to"));
        System.out.println(object4.get("trans_result"));
        JSONArray objects = JSON.parseArray(object4.get("trans_result").toString());
        for(int i=0;i<objects.size();i++){
            //通过数组下标取到object，使用强转转为JSONObject，之后进行操作
            JSONObject object = (JSONObject) objects.get(i);
            System.out.println(object.getString("dst"));
        }






    }
}
