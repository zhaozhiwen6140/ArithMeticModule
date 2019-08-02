package com.little.demo.arithmeticleet.sort;

import android.util.Log;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhaozhiwen on 2019-07-29.
 */
public class MergeSort {

    public static final String TAG = "MergeSort";
    public static final boolean DEBUG = true;

    public static void testMergeSort(int a[]){
        int length = a.length;
        testMergeSortInner(a,0,length-1);

    }

    private static void testMergeSortInner(int[] a, int p, int r) {
        //临界条件
        if (p >= r) {
            return;
        }

        int q = p + (r - p) / 2;

        testMergeSortInner(a,p,q);
        testMergeSortInner(a,q+1,r);

        merge(a,p,q,r);
    }

    private static void merge(int[] a, int p, int q, int r) {
        int i = p, j = q + 1, k = 0;
        int A[] = new int[r - p + 1];
        while (i <= q && j <= r) {
            if (a[i] <= a[j]) {
                A[k++] = a[i++];
            } else {
                A[k++] = a[j++];
            }
        }

        //循环结束，有一边会被剩下
        int start = i;
        int end = q;
        if (j <= r) {
            start = j;
            end = r;
        }

        while (start <= end) {
            A[k++] = a[start++];
        }

        for (int n = 0; n <= r - p; n++) {
            //从头加到尾一个都不能少
            a[p + n] = A[n];
        }
    }

    public static int testSampleRecursion(int n) {

        if (n == 1) {
            return 1;
        }
        int result = testSampleRecursion(n - 1) + 1;
        if (DEBUG) {
            Log.d(TAG, "testSampleRecursion: result=" + result);
        }
        return result;
    }


    private static Map<Integer,Integer> hashMap = new HashMap<>();

    /**
     * 递归实现斐波那契数列(表现为每个数=前两个数的和),注意：递归实现可能出现多次计算的结果，因此可以创建一个集合类，用于存放已计算的结果。
     * @param n
     * @return
     */
    public static int Fibonacci(int n) {
        if (n == 1) {
            return 1;
        }

        if (n == 2) {
            return 2;
        }

        if(hashMap.containsKey(n)){
            return hashMap.get(n);
        }

        int result = Fibonacci(n-1) + Fibonacci(n - 2);

        if (DEBUG) {
            Log.d(TAG, "Fibonacci: result=" + result );
        }

        hashMap.put(n,result);
        return result;
    }

}
