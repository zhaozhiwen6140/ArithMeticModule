package com.little.demo.arithmeticleet.stack;

import android.util.Log;

import org.black.widow.applicationtest.BuildConfig;

/**
 * Created by zhaozhiwen on 2019/3/19.
 * 基于数组实现顺序列表,新创建一个数组，创建数组大小需要传入数组的
 * 栈的属性是，只能在一侧添加以及删除数据。而且特性是先进后出，后进先出
 */
public class ArrayStack {

    public static boolean DEBUG = BuildConfig.DEBUG;
    public static final String TAG = "ArrayStack";

    private String[] items;//数组
    private int count;//栈中元素个数
    private int size;//创建的数组大小

    public ArrayStack(int n) {
        size = n;
        items = new String[size];
        count = 0;
    }

    //一般操作都需要有返回状态
    public boolean push(String data) {

        if (size == count) {
            if (DEBUG) {
                Log.d(TAG, "push: current stack is full");
            }
            return false;
        }

        items[count] = data;
        ++count;
        return true;
    }

    public String pop() {
        if (count == 0) {
            if (DEBUG) {
                Log.d(TAG, "pop: current stack is empty");
            }
            return null;
        }
        String lastTemp = items[count - 1];
        --count;
        return lastTemp;
    }

}
