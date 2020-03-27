package com.example.designpatterns.proxyPatterns.cglibProxy;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @ClassName CglibMeipo
 * @Description TODO
 * @Author zhaoxp
 * @Date 2019/8/28 20:58
 * @Version 1.0
 **/
public class CglibMeipo implements MethodInterceptor {

    public Object getInstance(Class<?> clazz){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        Object obj = methodProxy.invokeSuper(o, objects);
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
