package com.kugou.packdemo;

import com.kugou.one.One;
import com.kugou.sec.Sec;

public class NewTry {


    static void test() {

        try {
            Class clazz = Class.forName("com.kugou.one.One");
            One one = (One) clazz.newInstance();
            one.hello();

            Class clazz2 = Class.forName("com.kugou.one.One");
            Sec sec = (Sec) clazz.newInstance();
            sec.hello();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
