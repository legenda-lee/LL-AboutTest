package com.legenda.lee.studySdb;


import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
@Data
public class BaseResponse<T> {
    /**
     * 状态码
     * 0成功，1失败
     */
    private int code;

    /**
     * 描述信息
     * 成功，或具体错误信息
     */
    private String msg;
    /**
     * 业务数据
     */
    protected T data;


}
