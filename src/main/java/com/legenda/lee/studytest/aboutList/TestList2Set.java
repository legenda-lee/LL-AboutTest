package com.legenda.lee.studytest.aboutList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2020-09-24 6:01 下午
 * @description:
 */
public class TestList2Set {

    public static void main(String[] args) {
        List<String> init = new ArrayList<>();
        init.add("lee");
        init.add("legenda");
        init.add("lee");

        System.out.println(init.size());

        Set set = new HashSet(init);
        System.out.println(set.size());
        for (Object item : set) {
            System.out.println(item);
        }

        Set<Long> resourceIdSet = new HashSet();
        resourceIdSet.add(3L);
        resourceIdSet.add(4L);
        List<Long> resourceIdList = new ArrayList<>(resourceIdSet);

        System.out.println(resourceIdSet.size());
    }
}
