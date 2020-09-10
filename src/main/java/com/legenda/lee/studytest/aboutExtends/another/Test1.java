package com.legenda.lee.studytest.aboutExtends.another;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2020-09-08 6:01 下午
 * @description:
 */
public class Test1 {

    public static void main(String[] args) {
        Lida lida = new Lida();
        lida.setName("Lee");
        lida.setSex(2);

        System.out.println(lida);
        Person person = (Person)lida;
        System.out.println(person);
        System.out.println(person.getSex());

    }
}
