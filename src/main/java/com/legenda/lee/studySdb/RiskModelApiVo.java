package com.legenda.lee.studySdb;


import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

public interface RiskModelApiVo {


    /**
     * 按钮风控场景单笔业务实时风控模型执行接口请求参数
     *
     * @Modified: lida
     * @Date: 2023/9/5 11:50
     */
    @Data
    @Accessors(chain = true)
    @EqualsAndHashCode(callSuper = false)
    class BatchExecute implements Serializable {

        private String invokeId;

        private String requestSerialNo;

        private String tradeFlowIdentify;

        private String tradeFlowName;

        private String riskResult;

        private List<InterfaceBean> refuseRuleList;

        private List<InterfaceBean> warnRuleList;
    }

    @Data
    class InterfaceBean {

        private String interfaceDesc;

        private List<Object> hitSubSerialNoList;

        private String interfaceIdentify;

        private String interfaceName;

        private String prompt;

    }

    @Data
    @Accessors(chain = true)
    class RuleExecuteBean {

        private String interfaceName;

        private String interfaceVersion;

        private String interfaceDesc;

        private Object result;
    }


}
