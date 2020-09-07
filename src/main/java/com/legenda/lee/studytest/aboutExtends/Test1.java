package com.legenda.lee.studytest.aboutExtends;

import cn.hutool.core.bean.BeanUtil;
import com.legenda.lee.studytest.aboutExtends.son.DrugCompositionConflictContext;
import com.legenda.lee.studytest.aboutExtends.son.DrugCompositionConflictInput;
import com.legenda.lee.studytest.aboutExtends.son.DrugCompositionConflictOutput;
import org.springframework.beans.BeanUtils;
import org.springframework.util.CollectionUtils;

import java.util.Map;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2020-09-05 4:57 下午
 * @description:
 */
public class Test1 {

    public static void main(String[] args) {

        // 转换参数-输入输出
        DrugCompositionConflictInput drugCompositionConflictInput = new DrugCompositionConflictInput();
        drugCompositionConflictInput.setName("Lee");

        DrugCompositionConflictOutput drugCompositionConflictOutput = new DrugCompositionConflictOutput();
        drugCompositionConflictOutput.setIsConflict("是");

        // 药品成分冲突校验事件的参数类（EVENT-0001）
        DrugCompositionConflictContext drugCompositionConflictContext = new DrugCompositionConflictContext();
        drugCompositionConflictContext.setInvokeId("324343243244324");
        drugCompositionConflictContext.setDrugCompositionConflictInput(drugCompositionConflictInput);
        drugCompositionConflictContext.setDrugCompositionConflictOutput(drugCompositionConflictOutput);

        System.out.println(drugCompositionConflictContext);

        BaseRuleEngineContext ruleEngineContext1 = (BaseRuleEngineContext)drugCompositionConflictContext;
        System.out.println(ruleEngineContext1);
        if (ruleEngineContext1 instanceof DrugCompositionConflictContext) {
            System.out.println("是子类");

        }
        if (ruleEngineContext1.getClass().isInstance(DrugCompositionConflictContext.class) ) {
            System.out.println("是子类");

        }


        // Map<String, Object> result = BeanUtil.beanToMap(drugCompositionConflictContext);
        // System.out.println(result);
        Map<String, Object> result1 = BeanUtil.beanToMap(ruleEngineContext1);
        System.out.println(result1);
        //
        // DrugCompositionConflictInput drugCompositionConflictInput1 = (DrugCompositionConflictInput)result1.get("drugCompositionConflictInput");
        // System.out.println(drugCompositionConflictInput1.getName());

        BaseRuleEngineContext baseRuleEngineContext2 = new DrugCompositionConflictContext();
        System.out.println(baseRuleEngineContext2.getClass().getName());

        if (baseRuleEngineContext2 instanceof BaseRuleEngineContext) {
            System.out.println("is father");
        }
        if (baseRuleEngineContext2 instanceof DrugCompositionConflictContext) {
            System.out.println("is son");
        }

    }
}
