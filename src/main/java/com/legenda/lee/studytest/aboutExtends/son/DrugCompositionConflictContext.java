package com.legenda.lee.studytest.aboutExtends.son;

import com.legenda.lee.studytest.aboutExtends.BaseRuleEngineContext;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2020-08-28 8:53 下午
 * @description: 药品成分冲突校验事件的规则引擎执行上下文
 */
@Data
@ToString(callSuper = true)
public class DrugCompositionConflictContext extends BaseRuleEngineContext {

    /**
     * 药品成分冲突校验事件的规则引擎执行输入部分
     */
    private DrugCompositionConflictInput drugCompositionConflictInput;

    /**
     * 药品成分冲突校验事件的规则引擎执行输出部分
     */
    private DrugCompositionConflictOutput drugCompositionConflictOutput;

}
