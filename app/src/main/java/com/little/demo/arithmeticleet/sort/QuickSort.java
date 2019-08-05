package com.little.demo.arithmeticleet.sort;

import java.util.Collections;
import java.util.Random;

/**
 * Created by zhaozhiwen on 2019-08-02.
 * 1.快速排序不是稳定排序
 * 2.快速排序的时间复杂度是O(nlogn)
 * 3.快排是原地排序，空间复杂度是O(1)
 */
public class QuickSort {
    public static void testQuickSort(int a[]) {
        int len = a.length;
        testQuickSortInner(a, 0, len - 1);
    }

    private static void testQuickSortInner(int[] a, int p, int r) {
        if (p >= r) {
            return;
        }

        int pivot = getPivot(a,p,r);
        testQuickSortInner(a, p, pivot - 1);
        testQuickSortInner(a, pivot + 1, r);
    }

    private static int getPivot(int[] a, int p, int r) {
        /**优化快速排序的时间复杂度的方法，就是优化选取中间点的方法
         * 1.根据当前的数据量级三数取中(即不简单的取最后一个数作为pivot，而是选择首，尾，中间的数,选取其中的中间值作为pivot),但是如果数据量特别大，
         * 那就需要五数取中或者十数取中
         * 2.在要排序的区间中随机选择一个数作为pivot
          */
        int pivot = a[r], i = 0;
        for (int j = 0; j < r; j++) {
            if(a[j] < pivot) {
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
                i++;
            }
        }

        int temp = a[r];
        a[r] = a[i];
        a[i] = temp;

        return i;
    }


    private static int bigK = 0;

    public static int getTheFirstBigK(int a[],int K) {
        bigK = K;
        int n = a.length;
        quickSort(a, 0, n - 1);

        return a[bigK];
    }

    public static void quickSort(int[] a, int p, int r) {

        if (p >= r) {
            return;
        }
        int pivot = getPivot(a, p, r);

        if (pivot + 1 < bigK) {
            quickSort(a, 0, pivot - 1);
        } else if(pivot + 1 > bigK){
            quickSort(a, pivot + 1, r);
        } else {
            return;
        }


    }
}
