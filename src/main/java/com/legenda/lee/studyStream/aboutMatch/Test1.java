package com.legenda.lee.studyStream.aboutMatch;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2021-07-07 2:45 下午
 * @description:
 */
public class Test1 {

    public static void main(String[] args) {
        List<Long> whiteDoctorValue = new ArrayList<>();
        whiteDoctorValue.add(3L);
        whiteDoctorValue.add(3L);
        whiteDoctorValue.add(4L);
        whiteDoctorValue.add(4L);
        whiteDoctorValue.add(4L);
        whiteDoctorValue.add(6L);

        // 看看是不是都大于2
        boolean haha = whiteDoctorValue.stream().allMatch(i -> i > 2);
        System.out.println(JSON.toJSONString(haha));

        // 看看是不是存在大于5的
        boolean hehe = whiteDoctorValue.stream().anyMatch(i -> i > 5);

        System.out.println(JSON.toJSONString(hehe));
    }

}
