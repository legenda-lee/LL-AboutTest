package com.legenda.lee.studyalgorithm.aboutSort.BubbleSort;

import com.alibaba.fastjson.JSON;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2021-07-19 4:52 下午
 * @description:
 */
public class Test1 {

    public static void main(String[] args) {

        int[] nums = {1, 12, 2, 7, 9, 5, 8};

        Test1 t = new Test1();

        t.bubbleSort(nums);
        // t.insertSort(nums);


        System.out.println(JSON.toJSONString(nums));

    }
    
     // * 冒泡排序 每次将最大的排到数组末尾
     // * 时间复杂度：n2 空间复杂度：1
     //        */
    private void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
//----------------------------------------------------------------------------------
    /**
     * 插入排序 扑克牌排序
     * 时间复杂度：n2 空间复杂度：1
     */
    private void insertSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int insert = a[i];
            int j = i;
            //j>=1防止下标越界
            while (j >= 1 && a[j - 1] > insert) {
                a[j] = a[j - 1];
                j--;
            }
            a[j] = insert;
        }
    }
// //----------------------------------------------------------------------------------
    /**
     * 选择排序 每次选一个最小的放到数组最前面
     * 时间复杂度：n2 空间复杂度：1
     */
    private void selectSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = i; //最小值索引
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[min]) min = j;
            }
            int temp = array[i];//交换最小值与array[i]
            array[i] = array[min];
            array[min] = temp;
        }
    }
// //----------------------------------------------------------------------------------
    /**
     * 快速排序 取基准值 使左侧比其小右侧比其大 递归
     * 时间复杂度 nlog2n 空间复杂度 nlog2n
     */
    private void fastSort(int[] array) {
        sortJob2(array, 0, array.length - 1);
    }

    private void sortJob(int[] array, int low, int high) {
        if (low > high) return; //递归出口
        int i = low, j = high, temp, key = array[low];
        while (i < j) {
            //一次交换两个非key值
            while (i < j && array[j] > key) j--;
            while (i < j && array[i] <= key) i++;
            if (i < j) {
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        //交换Key和中间位置
        temp = array[i];
        array[i] = array[low];
        array[low] = temp;
        //递归
        sortJob(array, low, i - 1);
        sortJob(array, i + 1, high);
    }

    private void sortJob2(int[] array, int low, int high) {
        int i = low, j = high, temp, key = array[low];
        while (i < j) {
            //交换key和右边应交换的值
            while (i < j && array[j] > key) j--;
            temp = array[j];
            array[j] = array[i];
            array[i] = temp;
            //交换key和左边应交换的值
            while (i < j && array[i] < key) i++;
            temp = array[j];
            array[j] = array[i];
            array[i] = temp;
        }
        if(low<i) sortJob2(array, low, i - 1);
        if(i<high) sortJob2(array, i + 1, high);
    }
// //----------------------------------------------------------------------------------
    /**
     * 归并排序 分成有序子列（长度为1认为有序）再合并 分阶段
     * 时间复杂度： nlog2n 空间复杂度 n
     */
    private void mergeSort(int[] a, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(a, low, mid);
            mergeSort(a, mid + 1, high);
            merge(a, low, mid, high);
        }
    }

    /*  合并阶段  */
    private void merge(int[] a, int low, int mid, int high) {
        //申请一个合并后的空间
        int[] temp = new int[high - low + 1];
        // i/j: 两个待合并数组的指针 t: 合并后数组指针
        int i = low, j = mid + 1, t = 0;
        while (i <= mid && j <= high) {
            if (a[i] < a[j]) {
                temp[t++] = a[i++];
            } else {
                temp[t++] = a[j++];
            }
        }
        //肯定只会走一个while循环：若其中一个数组还有未加入合并数组的 则直接加入
        while (i <= mid) {
            temp[t++] = a[i++];
        }
        while (j <= high) {
            temp[t++] = a[j++];
        }
        //将临时数组里的数据复制到原数组 注意指针是k+low
        for (int k = 0; k < temp.length; k++) {
            a[k + low] = temp[k];
        }
    }
// //----------------------------------------------------------------------------------
    /**
     * 希尔排序
     * 时间复杂度 n2 空间复杂度 1
     */
    private void shellSort(int[] a) {
        int d =a.length;
        while (d>0){
            for (int i = d; i < a.length; i++) {
                int j = i;
                int temp = a[j];
                //应拿当前操作数进行比较
                while (j>=d && temp<a[j-d]){
                    a[j] = a[j-d];
                    j-=d;
                }
                a[j] = temp;
            }
            d/=2;
        }
    }

}
