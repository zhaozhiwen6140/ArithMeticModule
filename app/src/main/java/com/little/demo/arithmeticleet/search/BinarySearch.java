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
     *
     * @param a
     * @param k
     * @return
     */
    public static int testBinarySearchCircle(int a[], int k) {
        int low = 0, high = a.length - 1;
        while (low <= high) {
//            int mid = low + (high - low)/2;
            int mid = low + (high - low) >> 1;//使用位移运算，比除法要快
            if (a[mid] == k) {
                return mid;
            } else if (a[mid] < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    /**
     * 二分查找，使用递归实现
     *
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

    /**
     * 查找第一个值=给定值的元素(有可能会存在数组中多个值相等的情况)
     */
    public static int getFirstSearchKey(int a[], int K) {
        int len = a.length;
        int low = 0, high = len - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] < K) {
                low = mid + 1;
            } else if (a[mid] > K) {
                high = mid - 1;
            } else {
                //判断如果当前Key是第一个或者当前Key的前面值不是传入的，则返回当前值
                if (mid == 0 || a[mid - 1] != K) {
                    return mid;
                } else {
                    //否则缩短high，继续向前找
                    high = mid - 1;
                }
            }
        }

        return -1;

    }

    /**
     * 查找最后一个值=给定值的元素(有可能会存在数组中多个值相等的情况)
     */
    public static int getLastSearchKey(int a[], int K) {
        int len = a.length;
        int low = 0, high = len - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] < K) {
                low = mid + 1;
            } else if (a[mid] > K) {
                high = mid - 1;
            } else {
                //判断如果当前Key是第一个或者当前Key的前面值不是传入的，则返回当前值
                if (mid == len - 1 || a[mid + 1] != K) {
                    return mid;
                } else {
                    //否则缩短high，继续向后找
                    low = mid + 1;
                }
            }
        }

        return -1;

    }

    /**
     * 查找第一个值>=给定值的元素(有可能会存在数组中多个值相等的情况)
     */
    public static int getLastGreaterThanSearchKey(int a[], int K) {
        int len = a.length;
        int low = 0, high = len - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] >= K) {
                if (a[mid] == 0 || a[mid - 1] < K) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else {
                low = mid + 1;
            }
        }

        return -1;

    }

    /**
     * 查找第一个值<=给定值的元素(有可能会存在数组中多个值相等的情况)
     */
    public static int getLastLessThanSearchKey(int a[], int K) {
        int len = a.length;
        int low = 0, high = len - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] <= K) {
                if (a[mid] == 0 || a[mid + 1] > K) {
                    return mid;
                } else {
                    low = mid + 1;
                }
            } else {
                high = mid - 1;
            }
        }

        return -1;

    }


}
