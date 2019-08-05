package com.little.demo.arithmeticleet.search;

/**
 * Created by zhaozhiwen on 2019-08-05.
 * 1.二分查找针对的是一个有序的集合进行查找(或者用在插入，删除不频繁，一次排序多次查找的场景中)
 * 2.二分查找的时间复杂度是O(logn)
 * 3.二分查找需要按照下标随机访问，只适用于数组实现的数据结构(比如顺序表，不适用于链表)
 * 4.数据量太小不适合二分查找(但是数据之间的比较非常耗时时，仍然需要使用二分查找)
 * 5.数据量太大也不需要二分查找，因为数据量太大的话，数组的大小就需要一开始定义好一个固定连续的内存空间，这种就不适合二分查找。
 */
public class BinarySearch {

    /**
     * 简单二分查找，使用循环实现
     * @param a
     * @param k
     * @return
     */
    public static int testBinarySearchCircle(int a[], int k) {
        int low = 0, high = a.length - 1;
        while (low <= high) {
//            int mid = low + (high - low)/2;
            int mid = low + (high - low)>>1;//使用位移运算，比除法要快
            if(a[mid] == k){
                return mid;
            } else if(a[mid] < k){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    /**
     * 二分查找，使用递归实现
     * @param a
     * @param k
     * @return
     */
    public static int testBinarySearchRecursion(int a[], int k) {
        return testBinaryReInternal(a, 0, a.length - 1, k);
    }

    private static int testBinaryReInternal(int[] a, int low, int high, int k) {
        if (low > high) {
            return -1;
        }

        int mid = low + ((high - low) >> 1);
        if (a[mid] == k) {
            return mid;
        } else if (k < a[mid]) {
            return testBinaryReInternal(a, low, mid - 1, k);
        } else {
            return testBinaryReInternal(a, mid + 1, high, k);
        }
    }


}
