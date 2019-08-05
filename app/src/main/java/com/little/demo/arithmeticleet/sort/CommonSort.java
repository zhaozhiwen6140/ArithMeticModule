package com.little.demo.arithmeticleet.sort;

/**
 * Created by zhaozhiwen on 2019-08-05.
 * 通用的排序方式即：
 * 1.当数量比较少的时候，可以使用不用递归的插入排序(比如元素个数<=4时)。
 * 2.当数据元素比较少(>4)的时候，可以优先使用归并排序，因为归并排序的时间复杂度不受排序元素的影响，时间复杂度比较稳定
 * 3.当排序元素增加时，改为使用快排，因为随着数据的增加归并排序所占用的内存也会增加。同时对快排的寻找pivot的操作进行优化
 */
public class CommonSort {
}
