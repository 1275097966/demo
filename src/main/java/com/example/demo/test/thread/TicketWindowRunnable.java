package com.example.demo.test.thread;

/**
 * @Author: cyh
 * @Date: 2021/7/24 14:01
 */
public class TicketWindowRunnable implements Runnable {

    //最多接受50笔业务
    private static final int MAX = 50;

    private int index = 1;

    @Override
    public void run() {
        while (index <= MAX) {
            System.out.println(Thread.currentThread() + "的号码是：" + (index++));
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        final TicketWindowRunnable task = new TicketWindowRunnable();

        Thread windowTrade1 = new Thread(task, "一号窗口");

        Thread windowTrade2 = new Thread(task, "二号窗口");

        Thread windowTrade3 = new Thread(task, "三号窗口");

        Thread windowTrade4 = new Thread(task, "四号窗口");

        windowTrade1.start();
        windowTrade2.start();
        windowTrade3.start();
        windowTrade4.start();
    }
}
