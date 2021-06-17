package com.legenda.lee.studytest.aboutList;

import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2021-06-02 4:23 下午
 * @description: 两两组合
 */
public class Test6 {
    public static void main(String[] args) {


        for(int i = 1 ; i <= 3 ; i ++){
            for(int j = i + 1 ; j <= 3 ; j ++){
                System.out.println("I" + i + "J" +j + "   ");
            }
        }


        List<List<String>> twoDrugList = new ArrayList<>();
        List<String> drugNames = new ArrayList<>();
        drugNames.add("阿莫西林");
        drugNames.add("阿片");
        drugNames.add("鸦片");

        if (!CollectionUtils.isEmpty(drugNames) && drugNames.size() >= 2) {
            for (int i = 0; i < drugNames.size(); i++) {
                for (int j = i + 1; j < drugNames.size(); j++) {
                    List<String> twoDrug = new ArrayList<>();
                    twoDrug.add(drugNames.get(i));
                    twoDrug.add(drugNames.get(j));

                    twoDrugList.add(twoDrug);
                }
            }
        }

        System.out.println(twoDrugList.size());
    }
}
