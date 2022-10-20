package com.legenda.lee.studytest.aboutJava8;


import java.util.function.Function;

/**
 * 练习，String s  = "张三,30";
 * 1，将字符串截取得到数字年龄部分
 * 2，将上一步的年龄字符串转换成int类型数据
 * 3，将上一步的int数据加70，得到一个int结果，在控制台输出
 */
public class AboutFunction {

    public static void main(String[] args) {
        // convert("张三,30", s -> s.split(",")[1], Integer::parseInt, integer -> integer + 70);
        // convert("张三,30", s -> Integer.parseInt(s.split(",")[1]), integer -> integer + 70);
        convert("张三,30", s -> Integer.parseInt(s.split(",")[1]) + 70);

    }

    public static void convert(String s, Function<String, String> fun1, Function<String, Integer> fun2, Function<Integer, Integer> fun3) {
        Integer apply = fun1.andThen(fun2).andThen(fun3).apply(s);
        System.out.println(apply);
    }

    public static void convert(String s, Function<String, Integer> fun1, Function<Integer, Integer> fun2) {
        Integer apply = fun1.andThen(fun2).apply(s);
        System.out.println(apply);
    }

    public static void convert(String s, Function<String, Integer> fun1) {
        Integer apply = fun1.apply(s);
        System.out.println(apply);
    }

}
