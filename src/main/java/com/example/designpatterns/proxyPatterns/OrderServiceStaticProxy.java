package com.example.designpatterns.proxyPatterns;

import com.example.designpatterns.proxyPatterns.db.DynamicDataSourceEntity;
import sun.misc.ProxyGenerator;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;

/**
 * @ClassName OrderServiceStaticProxy
 * @Description TODO
 * @Author zhaoxp
 * @Date 2019/8/25 14:36
 * @Version 1.0
 **/
public class OrderServiceStaticProxy implements InvocationHandler {

    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy");

    Object object;

    public Object getInstance(Object baseService){
        object = baseService;
        Class<?> clazz = baseService.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Long time = (Long) args[0].getClass().getMethod("getCreateTime").invoke(args[0]);
        int dbRouter = Integer.valueOf(sdf.format(time));
        System.out.println("静态代理类自动分配到【DB_"+ dbRouter +"】数据源去及进行处理");
        DynamicDataSourceEntity.set(dbRouter);
        Object result = method.invoke(object,args);

        DynamicDataSourceEntity.reset();

        return result;
    }
}
