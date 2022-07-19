package com.legenda.lee.studytest.aboutEnum;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2020-11-03 2:27 下午
 * @description:
 */
public class Test2 {

    public static void main(String[] args) {
        // EventSceneEnum eventSceneEnum = EventSceneEnum.valueOf("rew");
        // System.out.println(eventSceneEnum);
        PrescriptionResultTypeEnum resultTypeEnum = PrescriptionResultTypeEnum.getEnum(2);
        System.out.println(resultTypeEnum.name());

        List<PrescriptionResultTypeEnum> list = new ArrayList<>();
        list.add(PrescriptionResultTypeEnum.REFUSE);
        list.add(PrescriptionResultTypeEnum.WARNING);

        System.out.println(list.contains(PrescriptionResultTypeEnum.PASS));
    }
}
