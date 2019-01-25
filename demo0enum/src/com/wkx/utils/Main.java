package com.wkx.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/**
 * Created by Administrator on 2019/1/15.
 * 用于解释证明arrayList和Vector的区别（arrayList线程安全，Vector不安全）
 */
public class Main {
    class MyThread implements Runnable{
        private List<Object> list;
        private CountDownLatch countDownLatch;
        public MyThread(List<Object> list, CountDownLatch countDownLatch) {
            this.list = list;
            this.countDownLatch = countDownLatch;
        }
        public void run(){
            //每个线程向list里面增加一百个元素
            for (int i=0;i<100;i++){
                list.add(new Object());
            }
            //完成一个子线程
            countDownLatch.countDown();
        }

    }
    public static void main(String[] args){
        for (int i=0;i<10;i++){
            test();
        }
    }
    public static void test(){
        //测试arrayList
        List<Object> list = new ArrayList<>();
        int threadCount = 1000;
        CountDownLatch countDownLatch = new CountDownLatch(threadCount);

    }
}
