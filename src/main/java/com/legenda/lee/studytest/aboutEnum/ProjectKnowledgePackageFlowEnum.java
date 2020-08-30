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
 * @description URule中 项目-知识包-规则流 三要素枚举
 *              规则策略三要素和代码是强关联的，
 *              因为console配置平台操作人员必须根据
 *              规则引擎开发人员给出的三要素来配置，不可随意修改。
 */
@Getter
@AllArgsConstructor
public enum ProjectKnowledgePackageFlowEnum {


    /**
     * @author Legenda-Lee(lee.legenda@gmail.com)
     * @date 2020-08-28 23:39:27
     * @description 药品冲突校验 规则策略三要素
     *
     * 项目名：P0001-(药品冲突校验)
     * 知识包：K0001
     * 规则流：F0001
     */
    P0001_K0001_F0001( "P0001-(药品冲突校验)", "K0001", "F0001"),



    ;


    /**
     * 项目名称
     */
    private String projectName;

    /**
     * 知识包ID
     */
    private String knowledgePackageId;

    /**
     * 规则流ID
     */
    private String flowId;



    /**
     * @author Legenda-Lee(lee.legenda@gmail.com)
     * @date 2020-08-29 16:10:38
     * @description
     */
    public static ProjectKnowledgePackageFlowEnum getPKFEnum(String enumName) {
        ProjectKnowledgePackageFlowEnum[] enums = ProjectKnowledgePackageFlowEnum.values();
        for (ProjectKnowledgePackageFlowEnum projectKnowledgePackageFlowEnum : enums) {
            if (projectKnowledgePackageFlowEnum.name().equals(enumName)) {
                return projectKnowledgePackageFlowEnum;
            }
        }
        return null;
    }

}
