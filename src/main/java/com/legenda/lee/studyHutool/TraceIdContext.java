package com.legenda.lee.studyHutool;


import lombok.Data;

@Data
public class TraceIdContext {
    /**
     * 请求风控服务唯一标识
     */
    private String invokeId;

    /**
     * 业务信息标识(不同的风控场景代表不同的业务编号)
     */
    private String interchangeableBusinessId;
}
