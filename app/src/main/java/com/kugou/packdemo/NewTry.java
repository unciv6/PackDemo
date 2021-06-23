package com.kugou.packdemo;

import com.peak.third.Common;

public class NewTry {


    static void test() {
        try {
            Class clazz = Class.forName("com.kugou.one.One");
            Common one = (Common) clazz.newInstance();
            one.hello();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Class clazz2 = Class.forName("com.kugou.sec.Sec");
            Common sec = (Common) clazz2.newInstance();
            sec.hello();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
