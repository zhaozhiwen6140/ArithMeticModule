package com.little.demo.arithmeticleet.Queue;

/**
 * Created by zhaozhiwen on 2019/3/20.
 * 用数组实现队列，遵循先进先出的策略
 */
public class ArrayQueue {

    private String items[];
    private int head = 0;
    private int tail = 0;
    private int size;

    public ArrayQueue(int size){
        items = new String[size];
    }

    //入栈存在队尾下标到头但是对头下标没有指向0的情况，这种情况下，只在队尾指针指向最后的时候，挪一次数据就可以了
    public boolean enQueue(String item){
        if(tail == size) {
            if(head == 0) {
                return false;//队列是真实的满了
            }
            //开始挪移数据
            for(int i=head;i<tail;i++) {
                items[i-head] = items[i];
            }
            tail = tail - head;
            head = 0;
        }
        items[tail] = item;
        ++tail;
        return true;
    }

    public String deQueue(){
        if(tail == head) {
            return null;//队列为空
        }

        String temp = items[head];
        ++head;
        return temp;
    }
}
