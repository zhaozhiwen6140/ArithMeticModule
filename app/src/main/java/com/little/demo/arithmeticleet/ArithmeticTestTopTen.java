package com.little.demo.arithmeticleet;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhaozhiwen on 2019-06-03.
 * LeetCode前十个算法
 */
public class ArithmeticTestTopTen {

    /**
     * 1.给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
     * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
     *
     * 示例：
     *
     * 给定 nums = [2, 7, 11, 15], target = 9
     * 因为 nums[0] + nums[1] = 2 + 7 = 9
     * 所以返回 [0, 1]
     *
     * 主要解决思路：
     * 1.遍历传入的数组，把数组的值作为value,target-value作为key
     * 2.匹配条件为：数组中的某个数值
     */
    public static int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            //临界值判断
            return new int[0];
        }

        Map<Integer, Integer> numberMap = new HashMap<>();
        int[] totalResult = new int[2];

        for (int i = 0; i < nums.length; i++) {
            if (numberMap.containsKey(target - nums[i])) {
                totalResult[0] = i;
                totalResult[1] = numberMap.get(target - nums[i]);
                break;
            }
            numberMap.put(nums[i], i);
        }
        return totalResult;
    }

    /**
     * 2.两数相加：给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
     *
     * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
     *
     * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
     *
     * 示例：
     *
     * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
     * 输出：7 -> 0 -> 8
     * 原因：342 + 465 = 807
     */


    public List addTwoNumbers(List l1, List l2) {

    }

}
