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
 * @description 规则引擎对外提供的项目事件场景服务编码枚举
 */
@Getter
@AllArgsConstructor
public enum EventSceneEnum {


    /**
     * @author Legenda-Lee(lee.legenda@gmail.com)
     * @date 2020-08-28 20:50:56
     * @description
     */
    EVENT_0001("EVENT-0001", "药品成分冲突校验事件"),



    ;


    /**
     * 事件编码
     */
    private String code;

    /**
     * 事件名称
     */
    private String desc;

}
