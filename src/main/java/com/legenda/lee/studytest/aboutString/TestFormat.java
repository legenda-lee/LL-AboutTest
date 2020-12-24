package com.legenda.lee.studytest.aboutString;

import cn.hutool.core.util.StrUtil;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2020-12-24 10:22 上午
 * @description:
 */
public class TestFormat {
    public static void main(String[] args) {
        char[] chars = new char[]{'，', '。', '/', '、', ' ', ';', '；'};

        String illness0 = "活血祛瘀，养阴益气，定悸除烦。用于心悸，怔仲，心烦失眠。";
        String illness1 = "消化道肿瘤，胃癌、直肠癌、胰腺癌、肝癌，乳腺癌";
        String illness2 = "滋阴补肾，益气生津。适用于Ⅱ型糖尿病气阴两虚，肾气不足证，可改善口渴喜饮，多食易饥，倦怠乏力，腰膝酸软，烦热失眠等症状。 ";
        String illness3 = "燥湿清热。用于湿热下注，白带，阴囊湿痒。";
        String illness4 = "纳蒙嘎宫昂。 3.阶：蒙给宁宫。 4.中医：清热解毒，利咽止痛。用于急喉痹（急性咽炎）、急乳蛾(急性扁桃体炎)所致的咽喉肿痛。";
        String illness5 = "苗医：迫喔劫漳凯，泱安挡孟。旭嘎洼嘎宏。陡：纳、拉蒙宁宫。阶：蒙给宁宫，干宫检，罗项。中医：疏风散热。消肿止痛，清利咽喉。用于急性咽炎。慢性咽炎急性发作．咽痛．咽粘膜红肿。咽干。口臭等症。";


        // 1、首先去除收尾空格
        String illness = illness5.trim();
        // 2、将诊断字符串中的指定字符都替换成英文逗号
        illness = StrUtil.replaceChars(illness, chars, ",");
        // 3、替换后对可能出现的连续的英文逗号缩减为一个
        illness = StrUtil.replace(illness, ",,,,", ",");
        illness = StrUtil.replace(illness, ",,,", ",");
        illness = StrUtil.replace(illness, ",,", ",");

        System.out.println(illness);
    }
}
