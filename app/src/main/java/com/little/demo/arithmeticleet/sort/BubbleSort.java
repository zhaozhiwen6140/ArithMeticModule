package com.little.demo.arithmeticleet.sort;

/**
 * Created by zhaozhiwen on 2019-06-14.
 */
public class BubbleSort {

    /**
     * bubbleSort(冒泡排序) 主要思路：for循环两次，每次走一遍排序，都能至少确定一个元素的位置，即最后的元素一定是最大的
     * 设置一个flag，如果有值替换，更改flag的状态，如果flag不变，说明完成排序，跳出循环
     * <p>
     * 此冒泡排序，时间复杂度为O(n²)
     */
    public static void testBubbleSort(int a[]) {
        int size = a.length;
        if (size == 0) {
            return;
        }

        for (int i = 0; i < size; i++) {
            boolean flag = false;
            for (int j = 0; j < size - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    flag = true;
                }
            }

            if (!flag) {
                break;
            }
        }
    }

    /**
     * 冒泡排序优化(在上面的基础上，添加边界判断，每次只针对小于边界的数据进行排序判断)
     */

    public static void testBubbleSortOptimize(int a[]) {
        int size = a.length;
        if (size == 0) {
            return;
        }

        int sortBoundary = size - 1;
        int lastExChange = 0;

        for (int i = 0; i < size; i++) {
            boolean isExChange = false;
            for (int j = 0; j < sortBoundary; j++) {
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;

                    isExChange = true;
                    lastExChange = j;
                }
            }
            sortBoundary = lastExChange;//把上次最后的交换位置作为下一次的比较边界，超出边界的部分之后不会再比较

            if(!isExChange){
                break;
            }
        }
    }

}
