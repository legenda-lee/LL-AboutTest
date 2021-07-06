package com.legenda.lee.studyalgorithm.aboutSort.BubbleSort;

import java.util.Arrays;

public class BubbleSort_DoItMyself {

    private static void bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; i < nums.length; i++) {

            }
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    public static void main(String[] args) {
        int[] nums = {1, 12, 2, 7, 9, 5, 8};
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
