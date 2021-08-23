package com.legenda.lee.studytest.aboutList;

import cn.hutool.core.util.StrUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2021-08-10 3:39 下午
 * @description:
 */
public class Test7 {
    public static void main(String[] args) {
        List<String> keywordList = new ArrayList<>();
        // keywordList.add("哈哈");
        // keywordList.add("呵呵");

        System.out.println(formatMessage(keywordList, "【药品名称】有误", "药品名称"));
    }

    private static String formatMessage(List<String> keywordList, String messageBefore, String toReplaceWord) {
        StringBuilder sb = new StringBuilder();
        keywordList.forEach(item -> {
            sb.append(item).append(",");
        });

        String keywordListString = StrUtil.removeSuffix(sb.toString(), ",");
        String result = StrUtil.replace(messageBefore, toReplaceWord, keywordListString);
        return result;
    }
}
