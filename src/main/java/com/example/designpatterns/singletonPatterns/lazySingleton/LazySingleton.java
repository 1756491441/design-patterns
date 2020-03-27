package com.example.designpatterns.singletonPatterns.lazySingleton;

/**
 * @ClassName LazySingleton
 * @Description TODO
 * @Author zhaoxp
 * @Date 2019/8/18 12:56
 * @Version 1.0
 **/
public class LazySingleton {

    private LazySingleton(){

    }

    private static LazySingleton lazySingleton = null;

    public static LazySingleton getInstance() {
        if(lazySingleton == null) {
            //此处存在线程安全问题，如果线程一进入，还未创建对象
            //线程2开始判断，此时会创建两个对象
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
