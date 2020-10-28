package com.legenda.lee.studytest.aboutList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2020-10-28 1:51 下午
 * @description:
 */
public class Test3 {

    public static void main(String[] args) {
        List<Long> whiteDoctorValue = new ArrayList<>();
        whiteDoctorValue.add(3L);
        whiteDoctorValue.add(3L);
        whiteDoctorValue.add(4L);

        Set<Long> set = new HashSet<>(whiteDoctorValue);
        System.out.println(set.size());


    }
}
