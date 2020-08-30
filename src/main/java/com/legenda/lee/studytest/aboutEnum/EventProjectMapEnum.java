/*
 * Copyright (c) 2019. Lianlian Yintong Electronic Payment Co., Ltd. All rights reserved.
 * Lianlian Yintong Electronic Payment PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.legenda.lee.studytest.aboutEnum;


import lombok.AllArgsConstructor;
import lombok.Getter;


/**
 * @author Legenda-Lee(lee.legenda@gmail.com)
 * @date 2020-08-28 20:50:43
 * @description 事件场景和URule三要素的对应关系枚举
 */
@Getter
@AllArgsConstructor
public enum EventProjectMapEnum {


    /**
     * @author Legenda-Lee(lee.legenda@gmail.com)
     * @date 2020-08-28 20:50:56
     * @description 药品冲突校验事件和对应的规则三要素
     */
    EVENT_PKP_MAP_0001("EVENT-0001", "P0001_K0001_F0001", "药品冲突校验事件编码-对应的规则策略三要素枚举NAME"),

    ;


    /**
     * 事件编码
     */
    private String eventCode;

    /**
     * 对应的规则策略三要素枚举NAME
     */
    private String pkfName;

    /**
     * 映射关系描述
     */
    private String mappingMessage;



    /**
     * @author Legenda-Lee(lee.legenda@gmail.com)
     * @date 2020-08-29 16:09:06
     * @description
     */
    public static String getEventCodeMappingPKFName(String eventCode) {
        for (EventProjectMapEnum eventProjectMapEnum : EventProjectMapEnum.values()) {
            if (eventProjectMapEnum.eventCode.equals(eventCode)) {
                return eventProjectMapEnum.getPkfName();
            }
        }
        return "";
    }



}
