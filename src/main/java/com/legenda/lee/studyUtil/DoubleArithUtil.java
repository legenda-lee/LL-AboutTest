package com.legenda.lee.studyUtil;

import java.math.BigDecimal;

public class DoubleArithUtil {


    /**
     * 提供精确的乘法运算。
     * @param v1 被乘数
     * @param v2 乘数
     * @return 两个参数的积
     */
    public static double mul(double v1,double v2) {
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.multiply(b2).doubleValue();
    }

    public static double mul3(double v1,double v2,double v3) {
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        BigDecimal b3 = new BigDecimal(Double.toString(v3));
        return b1.multiply(b2).multiply(b3).doubleValue();
    }



    public static void main(String[] args) {
        System.out.println(mul(0.06d, 0.5d));
        System.out.println(mul3(0.06d, 0.5d, 0.2d));
    }


}
