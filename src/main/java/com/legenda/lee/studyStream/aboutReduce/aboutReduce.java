package com.legenda.lee.studyStream.aboutReduce;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2021-07-07 3:47 下午
 * @description:
 */
public class aboutReduce {

    public static void main(String[] args) {
        List<Long> whiteDoctorValue = new ArrayList<>();
        whiteDoctorValue.add(3L);
        whiteDoctorValue.add(3L);
        whiteDoctorValue.add(4L);
        whiteDoctorValue.add(4L);
        whiteDoctorValue.add(4L);
        whiteDoctorValue.add(6L);

        int sum = 0;
        for (Long i : whiteDoctorValue) {
            sum += i;
        }

        System.out.println(sum);


        // 求和

        Long sum2 = whiteDoctorValue.stream().reduce(0L, Long::sum);
        System.out.println(sum2);

    }
}
