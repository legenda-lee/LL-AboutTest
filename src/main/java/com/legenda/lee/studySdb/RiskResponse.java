package com.legenda.lee.studySdb;


import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * 风控决策接口执行结果
 *
 * @Author: lida
 * @Date: 2023/9/13 18:02
 */
@Data
@Accessors(chain = true)
public class RiskResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    private String invokeId;

    private String requestSerialNo;

    private String tradeFlowIdentify;

    private String tradeFlowName;

    private String riskResult;

    private List<RiskModelApiVo.InterfaceBean> refuseRuleList = new ArrayList<>();

    private List<RiskModelApiVo.InterfaceBean> warnRuleList = new ArrayList<>();
}
