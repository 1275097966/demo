package com.example.demo.test.thread;

import java.util.concurrent.TimeUnit;

/**
 * @Author: cyh
 * @Date: 2021/7/24 13:08
 * <h1>以下代码中，线程的启动必须在其中一个任务之前，否则线程永远将得不到启动，因为前一个任务永远不会结束</h1>
 */
public class TryConcurrency {

    public static void main(String[] args) {
//        new Thread(){
//            @Override
//            public void run(){
//                enjoyMusic();
//            }
//
//        }.start();
//        browseNews();
//        enjoyMusic();

        //java8 Lambda方式
        new Thread(TryConcurrency::enjoyMusic).start();
        browseNews();

    }

    private static void browseNews() {
        for (; ; ) {
            System.out.println("Uh-huh, the good news.");
            sleep(2);
        }
    }

    private static void enjoyMusic() {
        for (; ; ) {
            System.out.println("Uh-huh, the nice music.");
            sleep(1);
        }
    }

    private static void sleep(int seconde) {
        try {
            TimeUnit.SECONDS.sleep((seconde));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
