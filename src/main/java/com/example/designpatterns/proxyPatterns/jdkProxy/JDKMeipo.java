package com.example.designpatterns.proxyPatterns.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName JDKMeipo
 * @Description TODO
 * @Author zhaoxp
 * @Date 2019/8/25 15:06
 * @Version 1.0
 **/
public class JDKMeipo implements InvocationHandler {

    private Person target;
    public Object getInstance(Person person) throws Exception{
        this.target = person;
        Class<?> clazz = person.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object obj = method.invoke(this.target, args);
        after();
        return obj;
    }

    private void before(){
        System.out.println("确认需求");
    }

    private void after(){
        System.out.println("你在想peach");
    }
}
