package com.little.demo.arithmeticleet.sort;

/**
 * Created by zhaozhiwen on 2019-06-17.
 */
public class SelectionSort {

    /**
     * 选择排序主要思路：每次都拿未排序区的首个元素跟其他元素进行比较，找出最小的跟未排序区的首个元素进行替换。
     */

    public static void testSelectionSort(int a[]) {
        int size = a.length;
        if (size <= 0) {
            return;
        }
        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
        }
    }
}
