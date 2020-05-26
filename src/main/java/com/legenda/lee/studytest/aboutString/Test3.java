package com.legenda.lee.studytest.aboutString;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @author Legenda-Lee
 * @date 2020-04-21 16:11
 * @description
 * @since 1.0.0
 */
public class Test3 {
    public static void main(String[] args) {
        String sb = "哈";
        System.out.println(sb.substring(0, sb.length() - 1));

        System.out.println("loan_purpose".hashCode());
        System.out.println("repayment_type".hashCode());


        String a = "330682198202150016|18137646932";
        System.out.println(a.split("\\|")[0]);
        System.out.println(a.split("\\|")[1]);


        String contextPath = "/loan-security-mng";
        String url = "/loan-security-mng/mng/result/getAnalyseLogInfo";

        String url1 = url.substring(contextPath.length());
        System.out.println(url1);

        String[] urls = new String[] {"/mng/web/saveWebConfigInfo",
                "/mng/web/queryWebConfigInfo",
                "/mng/scene/getSceneInfoPageList",
                "/mng/scene/insertProductScene",
                "/mng/result/getSecurityResultPageList",
                "/mng/result/getAnalyseLogInfo"};
        List<String> hh = Arrays.asList(urls);

        if (hh.contains(url1)) {
            System.out.println("yes");
        }




    }
}
