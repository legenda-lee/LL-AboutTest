package com.legenda.lee.studytest.aboutList;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2021-07-28 5:33 下午
 * @description:
 */
public class TestMiloso {

    public static void main(String[] args) {
        // 收集查到了的即没逃逸的药品
        List<String> selectedDrugNameList = new ArrayList<>();
        // 收集查到了但性别不匹配的药品
        List<String> errorDrugNameList = new ArrayList<>();

        selectedDrugNameList.add("aaaa");
        selectedDrugNameList.add("bbbb");
        selectedDrugNameList.add("cccc");

        errorDrugNameList.add("cccc");
        errorDrugNameList.add("dddd");

        selectedDrugNameList.removeAll(errorDrugNameList);

        System.out.println(JSON.toJSONString(selectedDrugNameList));

    }
}
