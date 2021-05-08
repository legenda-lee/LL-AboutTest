package com.legenda.lee.studytest.aboutSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2021-05-07 6:04 下午
 * @description:
 */
public class TestGetFirst {

    public static void main(String[] args) {
        Set<String> set = new HashSet();
        set.add("set1");
        set.add("开始");
        set.add("金融");
        System.out.println(set);
        if(!set.isEmpty()){
            System.out.println(set.iterator().next());//迭代取第一个
            System.out.println(set.toArray()[0]);//变为数组取第一个
        }
        List list=new ArrayList(set);
        System.out.println(list.get(0));//变为list取第一个
    }
}
