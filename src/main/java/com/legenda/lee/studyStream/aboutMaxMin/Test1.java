package com.legenda.lee.studyStream.aboutMaxMin;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
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
        prePrescriptionMedicineDTO2.setTakeAmount(5);
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

        Optional<Integer> min = whiteDoctorValue.stream().map(MedicineDTO::getTakeAmount).min(Integer::compareTo);
        Optional<Integer> max = whiteDoctorValue.stream().map(MedicineDTO::getTakeAmount).max(Integer::compareTo);

        System.out.println(min.get());
        System.out.println(max.get());

        System.out.println("------------");


        OptionalInt min1 = whiteDoctorValue.stream().mapToInt(MedicineDTO::getTakeAmount).min();
        OptionalInt max1 = whiteDoctorValue.stream().mapToInt(MedicineDTO::getTakeAmount).max();
        System.out.println(min1.getAsInt());
        System.out.println(max1.getAsInt());


        System.out.println("------------");
        // 求和 通过sum
        int sum = whiteDoctorValue.stream().mapToInt(MedicineDTO::getTakeAmount).sum();
        System.out.println(sum);
        // 通过reduce
        int sum2 = whiteDoctorValue.stream().map(MedicineDTO::getTakeAmount).reduce(0, Integer::sum);
        System.out.println(sum2);


    }

}
