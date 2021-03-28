package com.legenda.lee.studytest.aboutExtends.son;

import com.legenda.lee.studytest.aboutExtends.BaseInput;
import lombok.Data;
import lombok.ToString;


/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2020-08-28 8:53 下午
 * @description: 药品成分冲突校验事件的规则引擎执行输入部分
 */
@Data
@ToString(callSuper = true)
public class DrugCompositionConflictInput extends BaseInput {

    /**
     * 处方所含药品成分集合
     */
    private String name;

}
