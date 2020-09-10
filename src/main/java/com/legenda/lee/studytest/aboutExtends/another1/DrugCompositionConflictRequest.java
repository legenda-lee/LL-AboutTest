package com.legenda.lee.studytest.aboutExtends.another1;

import lombok.Data;

import java.util.Set;


/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2020-08-28 8:53 下午
 * @description: 药品成分冲突校验事件的参数类
 *
 */
@Data
public class DrugCompositionConflictRequest extends BaseRequestParam {


    private Set<String> drugCompositions;

}
