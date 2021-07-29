package com.example.demo.test.thread;

/**
 * @Author: cyh
 * @Date: 2021/7/24 17:16
 */
public class DaemonThread {
    public static void main(String[] args) throws InterruptedException {
        //main线程开始
        Thread thread = new Thread(() ->
        {
            while (true) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        //将thread设置为守护线程
        thread.setDaemon(true);
        //启动thread线程
        thread.start();
        Thread.sleep(2_000L);
        System.out.println("Main thread finished lifecycle.");
        //main线程结束
    }

}
