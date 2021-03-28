package com.legenda.lee.studytest.aboutExtends;

import lombok.Data;


/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2020-08-28 8:53 下午
 * @description:
 */
@Data
public class BaseRuleEngineContext {

    /**
     * ParamName: 唯一请求标识ID
     * Description: 对应的是规则引擎服务中心生成的唯一请求标识ID
     */
    private String invokeId;

    /**
     * ParamName: 项目名称
     * Description: 对应的是URule配置中心的某个项目名称
     */
    private String projectName;

    /**
     * ParamName: 知识包ID
     * Description: 对应的是URule配置中心的某个项目下的知识包ID
     */
    private String knowledgePackageId;

    /**
     * ParamName: 规则流ID
     * Description: 对应的是URule配置中心的某个项目下的知识包下的规则流ID
     */
    private String flowId;

    /**
     * ParamName:
     * Description:
     */
    private BaseInput baseInput;

    /**
     * ParamName:
     * Description:
     */
    private BaseOutput baseOutput;

}
