package com.legenda.lee.studytest.aboutEnum;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;


/**
 * @author Legenda-Lee(lee.legenda@gmail.com)
 * @date 2020-10-28 17:46:17
 * @description
 */
@Getter
@AllArgsConstructor
public enum PrescriptionResultTypeEnum {

    REFUSE(1, "拒绝", 1),

    WARNING(2, "人工", 2),

    PASS(3, "通过", 3),

    ALGO_REFUSE(4, "算法拒绝", 4);


    private int code;
    private String description;
    private int weight;

    public static Map<Integer, PrescriptionResultTypeEnum> nameMap = new HashMap<>();

    static {
        for (PrescriptionResultTypeEnum resultType : PrescriptionResultTypeEnum.values()) {
            nameMap.put(resultType.getWeight(), resultType);
        }
    }

    public static PrescriptionResultTypeEnum getEnum(Integer weight) {
        return nameMap.get(weight);
    }


}
