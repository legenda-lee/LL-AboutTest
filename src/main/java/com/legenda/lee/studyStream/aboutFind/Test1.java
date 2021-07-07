package com.legenda.lee.studyStream.aboutFind;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
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
        whiteDoctorValue.add(55L);
        whiteDoctorValue.add(4L);
        whiteDoctorValue.add(4L);
        whiteDoctorValue.add(6L);

        // 通过findFirst方法查找到第一个大于三的元素并打印
        Optional<Long> haha = whiteDoctorValue.stream().filter(i -> i > 3).findFirst();
        System.out.println(haha.get());

        // 通过findAny方法查找到其中一个大于三的元素并打印，因为内部进行优化的原因，当找到第一个满足大于三的元素时就结束，
        // 该方法结果和findFirst方法结果一样。提供findAny方法是为了更好的利用并行流，findFirst方法在并行上限制更多【本篇文章将不介绍并行流】
        Optional<Long> haha1 = whiteDoctorValue.stream().filter(i -> i > 3).findAny();
        System.out.println(haha1.get());


    }

}
