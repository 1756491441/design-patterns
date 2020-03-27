package com.example.designpatterns.proxyPatterns;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.Date;

/**
 * @ClassName DbRouteProxyTest
 * @Description TODO
 * @Author zhaoxp
 * @Date 2019/8/25 14:56
 * @Version 1.0
 **/
public class DbRouteProxyTest{

    public static void main(String[] args) {
        Order order =new Order();
        order.setCreateTime(new Date().getTime());

        OrderServiceStaticProxy orderServiceStaticProxy = new OrderServiceStaticProxy();
        IOrderService orderService = (IOrderService) orderServiceStaticProxy.getInstance(new OrderServiceImpl());
        orderService.createOrder(order);
    }
}
