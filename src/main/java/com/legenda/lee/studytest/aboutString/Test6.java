package com.legenda.lee.studytest.aboutString;

import com.alibaba.fastjson.JSON;
import org.springframework.util.StringUtils;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2021-04-12 3:14 下午
 * @description:
 */
public class Test6 {

    public static void main(String[] args) {
        // String multiSelect13 = "333";
        //
        // multiSelect13 = multiSelect13.substring(0, multiSelect13.length() - 1);
        //
        // System.out.println(multiSelect13);
        //
        //
        // String targetPromotionIds = "[34324432]";
        // List<Long> targetPromotionIdList = new ArrayList<>();
        // if (!StringUtils.isEmpty(targetPromotionIds)) {
        //     targetPromotionIdList = JSON.parseArray(targetPromotionIds, Long.class);
        // }
        //
        // System.out.println(JSON.toJSONString(targetPromotionIdList));
        //


        String aa = "432.3";

        System.out.println(Float.valueOf(aa) > 4.3);

        Double x= 3.23d;
        System.out.println(Math.ceil(x));
        System.out.println(Double.valueOf(Math.ceil(x)).intValue());

        Integer AAAA = 3;
        Integer bbbb = 3;
        System.out.println(AAAA.equals(bbbb));

        //获取格式化对象
        NumberFormat nt = NumberFormat.getPercentInstance();
        //设置百分数精确度2即保留两位小数
        nt.setMinimumFractionDigits(1);

        System.out.println(nt.format(x.doubleValue()));

        Double xxx= 123.29d;
        DecimalFormat df = new DecimalFormat("0.0");
        System.out.println(df.format(xxx));

        Double yy = 0d;
        System.out.println(yy == 0.0d);
        // System.out.println(Double.valueOf(df.format(43322.86567856/0d)));

        double aaa = 54 / 23d;
        System.out.println(aaa);

        System.out.println(Double.MIN_VALUE);
        System.out.println(Objects.equals( Double.MIN_VALUE, Double.MIN_VALUE));

    }


}
