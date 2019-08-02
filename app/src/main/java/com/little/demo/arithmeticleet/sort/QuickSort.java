package com.little.demo.arithmeticleet.sort;

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
        int pivote = a[r], i = 0;
        for (int j = 0; j < r; j++) {
            if(a[j] < pivote) {
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
}
