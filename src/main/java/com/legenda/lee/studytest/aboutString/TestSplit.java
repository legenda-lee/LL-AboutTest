package com.legenda.lee.studytest.aboutString;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2020-08-11 13:23
 * @description:
 */
public class TestSplit {

    public static void main(String[] args) {
        String originName = "2019-清华大学-招生目录.pdf";
        String suffix = originName.substring(originName.lastIndexOf(".") + 1);

        // 打印文件扩展名：pdf
        System.out.println(suffix);

        // 打印文件名：2019-清华大学-招生目录
        String prefix = originName.substring(0, originName.lastIndexOf("."));
        System.out.println(prefix);

        // 打印文件名分割元素：按-分割
        String[] splitResult = prefix.split("-");
        System.out.println(splitResult.length);
        for (String s : splitResult) {
            System.out.println(s);
        }
    }
}
