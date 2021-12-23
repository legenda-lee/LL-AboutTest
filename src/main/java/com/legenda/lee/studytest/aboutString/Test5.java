package com.legenda.lee.studytest.aboutString;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2020-10-15 4:56 下午
 * @description:
 */
public class Test5 {


    public static void main(String[] args) {
        String demo = "true1";
        if (Boolean.parseBoolean(demo)) {
            System.out.println("hello");
        }

        String filename = "2019-吉林大学-招生目录.pdf";
        System.out.println(filename.substring(0, filename.length() - 4));
        System.out.println(filename.substring(0, filename.length() - 4).replaceAll("-", ""));

        System.out.println(filename.contains("招生目录.."));
        System.out.println(filename.contains("2019-吉林大学-招生目录.pdf"));

        Double x = 4.55;
        System.out.println(x.intValue());
        System.out.println(x.doubleValue());

        System.out.println(x > 4.6);


        Integer a =4234;
        Double aa  = Double.valueOf(a.doubleValue());
        System.out.println(aa);

        int xx = 4;
        int yy = 8;
        System.out.println(xx/yy);
        System.out.println(Double.valueOf(xx)/Double.valueOf(yy));
    }
}
