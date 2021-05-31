package com.legenda.lee.studytest.aboutList;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Legenda-Lee
 * @date 2019-12-06 17:11
 * @description jdk1.8 遍历List的方法
 * @since 1.0.0
 */
public class Test1 {

    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        nameList.add("LiLei");
        nameList.add("LiMing");
        nameList.add("LiHaHa");
        nameList.add("LiHeHe");
        nameList.add("Legenda-Lee");

        // nameList.forEach(item -> {
        //     System.out.println(item);
        //     if ("Legenda-Lee".equals(item)) {
        //         System.out.println("i am in this List");
        //     }
        // });


        List<PrePrescriptionMedicineDTO> prePrescriptionMedicineDTOList = new ArrayList<>();
        PrePrescriptionMedicineDTO prePrescriptionMedicineDTO1 = new PrePrescriptionMedicineDTO();
        prePrescriptionMedicineDTO1.setDrugId(4531354074901L);
        prePrescriptionMedicineDTO1.setDrugName("头孢克肟胶囊");
        prePrescriptionMedicineDTO1.setTakeAmount(1);
        prePrescriptionMedicineDTO1.setTakeUnit("盒");
        prePrescriptionMedicineDTO1.setDrugUsage("外用");
        prePrescriptionMedicineDTO1.setPerNum("2");
        prePrescriptionMedicineDTO1.setPerUnit("粒");
        prePrescriptionMedicineDTO1.setUsageFrequencyName("2次/天");
        prePrescriptionMedicineDTO1.setUsageFrequencyCode(1);
        prePrescriptionMedicineDTO1.setDose(95);
        prePrescriptionMedicineDTO1.setSpec("0.1g*10粒*2板");

        PrePrescriptionMedicineDTO prePrescriptionMedicineDTO2 = new PrePrescriptionMedicineDTO();
        prePrescriptionMedicineDTO2.setDrugId(4531354074902L);
        prePrescriptionMedicineDTO2.setDrugName("头孢克肟胶囊1");
        prePrescriptionMedicineDTO2.setTakeAmount(1);
        prePrescriptionMedicineDTO2.setTakeUnit("盒");
        prePrescriptionMedicineDTO2.setDrugUsage("口服");
        prePrescriptionMedicineDTO2.setPerNum("2");
        prePrescriptionMedicineDTO2.setPerUnit("粒");
        prePrescriptionMedicineDTO2.setUsageFrequencyName("2次/天");
        prePrescriptionMedicineDTO2.setUsageFrequencyCode(1);
        prePrescriptionMedicineDTO2.setDose(91);
        prePrescriptionMedicineDTO2.setSpec("0.1g*10粒*2板");

        prePrescriptionMedicineDTOList.add(prePrescriptionMedicineDTO1);
        prePrescriptionMedicineDTOList.add(prePrescriptionMedicineDTO2);

        Map<String, String> drugNameAndUsageMap = prePrescriptionMedicineDTOList.stream().collect(Collectors.toMap(PrePrescriptionMedicineDTO::getDrugName, t -> t.getDrugUsage() == null ? "" : t.getDrugUsage()));


        System.out.println(JSON.toJSONString(drugNameAndUsageMap));
    }
}
