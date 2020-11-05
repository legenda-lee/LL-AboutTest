package com.legenda.lee.studytest.aboutJson;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2020-11-03 3:17 下午
 * @description:
 */
public class Test7 {
    public static void main(String[] args) {
        List<Integer> nameList = new ArrayList<>();
        nameList.add(4);
        nameList.add(1);
        nameList.add(3);
        nameList.add(7);

        String str = JSON.toJSONString(nameList);
        System.out.println(str);

        String haha = "[\"LiMing\"]";
        // List<String> list = Arrays.asList(haha.split(",")).stream().map(s -> (s.substring(1,s.length()-1 ).trim())).collect(Collectors.toList());
        // System.out.println(list.size());
        //
        // for (String s : list) {
        //     System.out.println(s);
        // }

        List<String> list = JSON.parseArray(haha, String.class);
        System.out.println(list.size());

        for (String s : list) {
            System.out.println(s);
        }

    }
}
