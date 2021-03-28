package com.legenda.lee.studytest.aboutList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2020-10-30 11:08 上午
 * @description:
 */
public class TestCollectiont2Set {

    public static void main(String[] args) {
        Collection<String> doctors = new ArrayList<>();
        doctors.add("lee");
        doctors.add("hhha");
        doctors.add("lee");

        Set<String> set = new HashSet<>(doctors);

        System.out.println(set.size());
        for (String s : set) {
            System.out.println(s);
        }

        System.out.println("------------");

        // Set<String> matchingSet = SetUtils.difference(matchedDoctors, new HashSet<>(doctorSet));

    }
}
