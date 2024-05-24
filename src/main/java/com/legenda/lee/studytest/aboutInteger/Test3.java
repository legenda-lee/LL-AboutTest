package com.legenda.lee.studytest.aboutInteger;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2020-11-04 11:18 下午
 * @description:
 */
public class Test3 {

    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(7);


        Object b = min1(list);
        Double ddd = (Double) b;
        System.out.println(b.getClass());
        System.out.println(ddd.intValue());
        System.out.println(size(list));
    }




    public static Number min1(List<Object> list){
        if(list.size()==0){
            // throw new RuleException("Number list can not be null when compute min value from list.");
        }
        double min=Double.MAX_VALUE;
        for(Object obj:list){
            BigDecimal v=new BigDecimal(String.valueOf(obj));
            min=Math.min(min, v.doubleValue());
        }
        return min;
    }


    public static int size(List<Object> list){
        return list.size();
    }

}
