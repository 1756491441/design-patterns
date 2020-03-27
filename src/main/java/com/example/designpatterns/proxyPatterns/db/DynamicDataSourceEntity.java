package com.example.designpatterns.proxyPatterns.db;

/**
 * @ClassName DynamicDataSourceEntity
 * @Description 动态切换数据源
 * @Author zhaoxp
 * @Date 2019/8/25 14:41
 * @Version 1.0
 **/
public class DynamicDataSourceEntity{

    private final static String DEFAULT_SOURCE = null;
    private final static ThreadLocal<String> local = new ThreadLocal<String>();

    public static String get(){
        return local.get();
    }

    //DB_2018
    //DB_2019
    public static void set(String source){
        local.set(source);
    }

    public static void set(int year){
        local.set("DB_"+year);
    }

    public static void reset(){
        local.set(DEFAULT_SOURCE);
    }

}
