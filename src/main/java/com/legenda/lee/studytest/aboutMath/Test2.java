package com.legenda.lee.studytest.aboutMath;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2020-07-24 20:34
 * @description:
 */
public class Test2 {

    public static void main(String[] args) {

        List<Zone> zoneList = initZoneList(new String[]{"(1,4)", "(2,5)", "(8,9)"});
        Set<Integer> numbers = initNumbersSet(zoneList);

        // for (Integer number : zoneList) {
        //     System.out.println(number);
        // }

        for (Integer number : numbers) {
            System.out.println(number);
        }


    }



    public static Set<Integer> initNumbersSet(List<Zone> zoneList) {
        Set<Integer> numbers = new HashSet<>();
        if (numbers != null && numbers.size() > 0) {
            for (Zone zone : zoneList) {
                for (int i = zone.getLeft(); i <= zone.getRight(); i++) {
                    numbers.add(i);
                }
            }
        }

        return numbers;
    }

    public static List<Zone>  initZoneList(String[] zones) {
        List<Zone> zoneList = new ArrayList<>();
        if (zones != null && zones.length > 0) {
            for (String zone : zones) {
                String[] nums = zone.split(",");
                Zone zone1 = new Zone(Integer.valueOf(nums[0].substring(1, 2)),
                        Integer.valueOf(nums[1].substring(0, 1)));
                zoneList.add(zone1);
            }
        }

        return zoneList;
    }

}

class Zone {
    private int left;
    private int right;

    public int getLeft() {
        return left;
    }

    public int getRight() {
        return right;
    }

    public Zone(int left, int right) {
        this.left = left;
        this.right = right;
    }

    // public collectNumber()

}



