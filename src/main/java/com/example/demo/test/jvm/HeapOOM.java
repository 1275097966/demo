package com.example.demo.test.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * <h1>test OutOfMemoryError</h1>
 *
 * @Author: cyh
 * @Date: 2021/7/20 21:53
 */
public class HeapOOM {

    static class OONObject {
        public static void main(String[] args) {
            List<OONObject> list = new ArrayList<OONObject>();
            long a = 0;
            while (true) {
                list.add(new OONObject());
                a++;
                System.out.println(a);
            }
        }
    }

}
