package com.legenda.lee.studytest.aboutString;

/**
 * @author Legenda-Lee
 * @date 2019-12-10 17:38
 * @description
 * @since 1.0.0
 */
public class Test1 {
    public static void main(String[] args) {
        // 冬天敲键盘手冷的解决方法
        // while (true) {
        //     System.out.println("hello world");
        // }

        // String a = "Legenda-";
        // String b = a.concat("Lee");
        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(b.length());
        //
        //
        // String aaa = String.valueOf(null).concat("/").concat(String.valueOf(32));
        // System.out.println(aaa);
        double result = 3.67;
        Integer aa = (int) result;
        System.out.println(aa);


        String bb = "261.3999999999999";
        System.out.println(Double.parseDouble(bb));
        System.out.println(Double.parseDouble(bb) < 1000.0);
        System.out.println(Double.parseDouble(bb) < 1.0);


        String name = "2021-华南师范大学 -录取名单";
        System.out.println(name.substring(5, name.indexOf("-录取名单")));

        System.out.println(name.contains(" "));
    }
}
