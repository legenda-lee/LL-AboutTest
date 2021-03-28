package com.legenda.lee.studytest.aboutJson;

import java.text.DecimalFormat;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2020-09-11 3:49 下午
 * @description:
 */
public class Test5 {

    public static void main(String[] args) {
        String aa = "{\"drugInfoCtxRequestList\":[{\"approvalNumber\":\"app\",\"id\":1,\"name\":\"name\",\"spec\":\"spec\"}],\"eventCode\":\"EVENT-0002\",\"flowId\":\"F0001\",\"invokeId\":\"74389690155008\",\"knowledgePackageId\":\"K0001\",\"projectName\":\"P0002-药品数据匹配事件\"}";

        DecimalFormat decimalFormat = new DecimalFormat("000");
        System.out.println(decimalFormat.format(6));

    }
}
