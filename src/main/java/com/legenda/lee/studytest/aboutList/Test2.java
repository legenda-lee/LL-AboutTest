package com.legenda.lee.studytest.aboutList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2020-07-23 15:30
 * @description:
 */
public class Test2 {

    public static void main(String[] args) {
        List<Integer> nameList = new ArrayList<>();
        nameList.add(2);
        nameList.add(3);
        nameList.add(4);
        nameList.add(5);
        nameList.add(6);

        List<Integer> newNameList = nameList.stream().filter((x) -> x > 3).collect(Collectors.toList());
        newNameList.forEach(integer -> {
            System.out.println(integer);
        });
    }
}
