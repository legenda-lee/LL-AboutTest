package com.legenda.lee.studytest.aboutString;

import com.legenda.lee.studyStream.aboutGroupingBy.MedicineDTO;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2022-08-10 4:08 下午
 * @description:
 */
public class TestSub2 {

    public static void main(String[] args) {
        // String schoolCode = "104032081200108".substring(0, 5);
        // System.out.println(schoolCode);
        // System.out.println(schoolCode.equals("10403"));
        //
        // MedicineDTO medicineDTO = new MedicineDTO();
        //
        // Integer a = medicineDTO.getUsageFrequencyCode() + 3;
        // System.out.println(medicineDTO.getUsageFrequencyCode() + 3);
        //
        // System.out.println("哈哈哈哈");

        String aa = "北京大学.png";
        String schoolName = aa.substring(0, aa.lastIndexOf("."));
        System.out.println(schoolName);


        String luQuFenShuBianHuaQuShiMessage = String.format("[%s]年考研大概率为竞争小年。", "2024");
        System.out.println(luQuFenShuBianHuaQuShiMessage);


    }
}
