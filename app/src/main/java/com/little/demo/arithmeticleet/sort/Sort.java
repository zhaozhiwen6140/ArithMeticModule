package com.little.demo.arithmeticleet.sort;

/**
 * Created by zhaozhiwen on 2019/3/27.
 */
public class Sort {

    //bubble Sort(相邻两个元素比较，大的放后面，小的放前面,时间复杂度是O(n^2))
    public void bubbleSort(int a[]) {
        int size = a.length;
        if (size <= 1) {
            return;
        }
        //两套循环
        for (int i = 0; i < size; i++) {
            boolean isDataChanged = false;
            for (int j = 0; j < size - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int value = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = value;
                    isDataChanged = true;
                }
            }

            //如果循环一遍之后，发现前面的数据都已经排好序了，那就退出循环
            if (!isDataChanged) {
                break;
            }
        }
    }

    //Insert Sort(分为已排序区跟未排序区，把未排序区的第一个元素在已排序区中，找到合适的位置插入，时间复杂度是O(n^2)，从下标为1的元素开始，往前插入)
    public void insertSort(int a[]) {
        int size = a.length;
        if (size < 1) {
            //判断临界条件
            return;
        }

        for (int i = 1; i < size; i++) {
            int value = a[i];
            int j = i - 1;
            for (; j <= 0; j--) {
                if (a[j] > value) {
                    a[j + 1] = a[j];
                } else {
                    break;
                }
            }
            a[j + 1] = value;
        }
    }

    //SelectionSort(分为已排序区跟未排序区，在未排序区中找到最小的值，与已排序区的第一个元素交换位置)
    public void selectionSort(int a[]) {
        int size = a.length;
        if (size < 1) {
            return;
        }

        for (int i = 0; i < size - 1; i++) {
            int j = i + 1;
            int temp = a[j];
            int subscipt = j;
            for (; j < size; j++) {
                if (a[j + 1] < a[j]) {
                    temp = a[j + 1];
                    subscipt = j + 1;
                }
            }
            a[subscipt] = a[i];
            a[i] = temp;
        }
    }

    //归并排序
    public void mergeSort(){

    }

}
