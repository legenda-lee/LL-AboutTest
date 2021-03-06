package com.legenda.lee.studyStream.aboutJoin;

import com.alibaba.fastjson.JSON;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2021-07-07 2:55 下午
 * @description:
 */
public class Test1 {

    public static void main(String[] args) {
        List<MedicineDTO> whiteDoctorValue = new ArrayList<>();



        MedicineDTO prePrescriptionMedicineDTO1 = new MedicineDTO();
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

        MedicineDTO prePrescriptionMedicineDTO2 = new MedicineDTO();
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

        whiteDoctorValue.add(prePrescriptionMedicineDTO1);
        whiteDoctorValue.add(prePrescriptionMedicineDTO2);


        // 通过joining拼接流中的元素
        String result = whiteDoctorValue.stream().map(MedicineDTO::getDrugName).collect(Collectors.joining(", "));
        System.out.println(JSON.toJSONString(result));


        // 只拼接有值的，通过joining拼接流中的元素
        String result1 = whiteDoctorValue.stream().filter(i -> !StringUtils.isEmpty(i.getDrugName())).map(MedicineDTO::getDrugName).collect(Collectors.joining(", "));
        System.out.println(JSON.toJSONString(result1));



    }

}
