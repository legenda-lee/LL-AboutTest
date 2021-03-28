package com.legenda.lee.studytest.aboutExtends.son;

import com.legenda.lee.studytest.aboutExtends.BaseOutput;
import lombok.Data;
import lombok.ToString;


/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2020-08-28 8:53 下午
 * @description: 药品成分冲突校验事件的规则引擎执行输出部分
 */
@Data
@ToString(callSuper = true)
public class DrugCompositionConflictOutput extends BaseOutput {

    /**
     * 冲突结果
     */
    private String isConflict;

}
