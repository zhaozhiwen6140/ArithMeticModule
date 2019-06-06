package com.little.demo.arithmeticleet.Queue;

import android.util.Log;

/**
 * Created by zhaozhiwen on 2019/3/25.
 */
public class CircleStack {
    public static final String TAG = "CircleStack";
    public static final boolean DEBUG = true;

    private String items[];
    private int head;
    private int tail;
    private int n;//当前数组的大小

    //确定一个大小为m的数组,传入数组大小
    public CircleStack(int m) {
        items = new String[m];
        n = m;
    }

    public boolean enQueue(String item) {

        if ((tail + 1) % n == head) {
            if (DEBUG) {
                Log.d(TAG, "enQueue: Queue is full");
            }
            return false;
        }
        items[tail] = item;
        tail = (tail + 1) % n;
        return true;
    }

    public String deQueue() {
        if (head == tail) {
            if (DEBUG) {
                Log.d(TAG, "deQueue: Queue is empty");
            }
            return null;
        }
        String item = items[head];
        head = (head + 1) % n;
        return item;
    }
}
