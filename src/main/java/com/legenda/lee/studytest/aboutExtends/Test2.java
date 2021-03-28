package com.legenda.lee.studytest.aboutExtends;

import com.legenda.lee.studytest.aboutExtends.son.DrugCompositionConflictContext;
import org.springframework.beans.BeanUtils;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2020-09-05 6:23 下午
 * @description:
 */
public class Test2 {

    public static void main(String[] args) {
        BaseRuleEngineContext baseRuleEngineContext = new DrugCompositionConflictContext();
        baseRuleEngineContext.setFlowId("e3e");

        DrugCompositionConflictContext drugCompositionConflictContext = new DrugCompositionConflictContext();
        BeanUtils.copyProperties(baseRuleEngineContext, drugCompositionConflictContext);

        System.out.println(drugCompositionConflictContext.getFlowId());
    }
}
