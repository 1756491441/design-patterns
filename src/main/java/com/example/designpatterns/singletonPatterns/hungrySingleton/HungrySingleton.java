package com.example.designpatterns.singletonPatterns.hungrySingleton;

/**
 * @ClassName HungrySingleton
 * @Description TODO
 * @Author zhaoxp
 * @Date 2019/8/18 12:53
 * @Version 1.0
 **/
public class HungrySingleton {

    private HungrySingleton() {
    }

    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }
}
