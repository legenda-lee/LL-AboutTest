package com.legenda.lee.studytest.aboutString;

import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2021-04-12 3:14 下午
 * @description:
 */
public class Test7 {

    public static void main(String[] args) {


        String aa = "佳节快乐.发多少";

        System.out.println(aa.replaceAll(".", "hhhh"));
        System.out.println(aa.replace(".", "hhhh"));

        Object bb = null;
        List<String> symptomList = (List<String>) bb;

        System.out.println(symptomList == null);


        List<String> haha = new ArrayList<>();
        haha.add("3");
        haha.add("2");
        haha.add("7");
        haha.add("1");
        haha.add("无");

        Collections.sort(haha);

        System.out.println(haha);


        List<MajorAnalysisCompareVoVersion2> hehe = new ArrayList<>();


        MajorAnalysisCompareVoVersion2 major1 = new MajorAnalysisCompareVoVersion2();
        major1.setHardScore(33);
        major1.setHardScoreShow("33");

        MajorAnalysisCompareVoVersion2 major2 = new MajorAnalysisCompareVoVersion2();
        major2.setHardScore(44);
        major2.setHardScoreShow("44");


        MajorAnalysisCompareVoVersion2 major3 = new MajorAnalysisCompareVoVersion2();
        major3.setHardScore(88);
        major3.setHardScoreShow("无");

        hehe.add(major1);
        hehe.add(major2);
        hehe.add(major3);

        Collections.sort(hehe);

        System.out.println(hehe);


    }


}
