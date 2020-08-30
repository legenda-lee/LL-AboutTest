package com.legenda.lee.studytest.aboutEnum;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2020-08-28 11:23 下午
 * @description:
 */
public class Test1 {

    public static void main(String[] args) {
        System.out.println(ProjectKnowledgePackageFlowEnum.P0001_K0001_F0001.name());
        System.out.println(ProjectKnowledgePackageFlowEnum.getPKFEnum("P0001_K0001_F0001").getProjectName());
        System.out.println(ProjectKnowledgePackageFlowEnum.getPKFEnum("P0001_K0001_F0001").getKnowledgePackageId());
        System.out.println(ProjectKnowledgePackageFlowEnum.getPKFEnum("P0001_K0001_F0001").getFlowId());


        System.out.println(EventProjectMapEnum.getEventCodeMappingPKFName("EVENT-0001"));

        System.out.println("----");

        System.out.println(ProjectKnowledgePackageFlowEnum.valueOf("P0001_K0001_F0001").getProjectName());
        System.out.println(ProjectKnowledgePackageFlowEnum.valueOf("P0001_K0001_F0001").getKnowledgePackageId());
        System.out.println(ProjectKnowledgePackageFlowEnum.valueOf("P0001_K0001_F0001").getFlowId());


        System.out.println("====");
        System.out.println(ProjectKnowledgePackageFlowEnum.valueOf("P0001_K0001_F0002"));
    }
}
