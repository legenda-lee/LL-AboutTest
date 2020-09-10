package com.legenda.lee.studytest.aboutExtends.another1;


import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;


/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2020-08-28 8:53 下午
 * @description:
 */
@Data
public class BaseRequestParam implements Serializable {

    private static final long serialVersionUID = 1L;



    private String requestId;


    private String eventCode;


    private String appName;


    private Map<String, String> extendMap = new HashMap<>(16);

    public BaseRequestParam add(String key, String value) {
        if (key == null) {
            return this;
        }
        if (value == null) {
            value = "";
        }
        extendMap.put(key, value);
        return this;
    }


}
