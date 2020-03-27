package com.example.designpatterns.proxyPatterns.cglibProxy;

import org.springframework.cglib.core.DebuggingClassWriter;

/**
 * @ClassName TestCglib
 * @Description TODO
 * @Author zhaoxp
 * @Date 2019/8/28 21:08
 * @Version 1.0
 **/
public class TestCglib {

    public static void main(String[] args) {
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,"E://cglibClasses");

        Customer customer = (Customer)new CglibMeipo().getInstance(Customer.class);
        System.out.println(customer);
        customer.findlove();
    }

}
