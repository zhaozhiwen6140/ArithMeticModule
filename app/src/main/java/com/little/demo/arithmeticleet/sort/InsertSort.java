package com.little.demo.arithmeticleet.sort;

/**
 * Created by zhaozhiwen on 2019-06-17.
 */
public class InsertSort {

    /**
     * 原理：将要排序的数组分成排序区跟未排序区(i为当前要比较的值,i从1开始时因为，默认首个元素属于有序区，j为前面已排序区的最后一个值)
     */
    public static void testInsertSort(int a[]) {
        int size = a.length;
        if (size <= 0) {
            return;
        }
        for (int i = 1; i < size; i++) {
            int value = a[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (a[j] > value) {
                    a[j + 1] = a[j];
                } else {
                    break;
                }
            }

            a[j + 1] = value;
        }
    }
}
