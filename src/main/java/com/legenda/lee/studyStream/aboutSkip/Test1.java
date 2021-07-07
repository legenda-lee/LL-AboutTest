package com.legenda.lee.studyStream.aboutSkip;

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

        // 只要后面三个
        List<Long> haha = whiteDoctorValue.stream().skip(3).collect(Collectors.toList());

        System.out.println(JSON.toJSONString(haha));
        System.out.println(JSON.toJSONString(whiteDoctorValue));
    }

}
