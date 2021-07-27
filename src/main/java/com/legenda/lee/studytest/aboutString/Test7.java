package com.legenda.lee.studytest.aboutString;

import org.springframework.util.StringUtils;

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


        List<Major> hehe = new ArrayList<>();


        Major major4 = new Major();
        major4.setHardScore(99);
        major4.setHardScoreShow("无");

        Major major1 = new Major();
        major1.setHardScore(33);
        major1.setHardScoreShow("33");

        Major major2 = new Major();
        major2.setHardScore(44);
        major2.setHardScoreShow("44");


        Major major3 = new Major();
        major3.setHardScore(88);
        major3.setHardScoreShow("无");

        hehe.add(major4);
        hehe.add(major1);
        hehe.add(major2);
        hehe.add(major3);

        // Collections.sort(hehe);

        // System.out.println(hehe);



        System.out.println(hehe);

        for (int i = 0; i < hehe.size(); i++) {
            for (int j = 0; j < hehe.size() - i - 1; j++) {
                Major temp;
                if ((!StringUtils.isEmpty(hehe.get(j).getHardScoreShow()) &&
                        hehe.get(j).getHardScoreShow().equals("无"))
                        || (!StringUtils.isEmpty(hehe.get(j).getHardScoreShow()) &&
                        !hehe.get(j + 1).getHardScoreShow().equals("无") &&
                        hehe.get(j).getHardScore() < hehe.get(j + 1).getHardScore())) {
                    temp = hehe.get(j);
                    hehe.set(j, hehe.get(j + 1));
                    hehe.set((j+1), temp);

                    System.out.println(hehe);

                }
            }
        }

        System.out.println(hehe);



    }


}
