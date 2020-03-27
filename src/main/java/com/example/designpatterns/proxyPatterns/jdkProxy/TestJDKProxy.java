package com.example.designpatterns.proxyPatterns.jdkProxy;

import sun.misc.ProxyGenerator;

import java.io.File;
import java.io.FileOutputStream;

/**
 * @ClassName TestJDKProxy
 * @Description TODO
 * @Author zhaoxp
 * @Date 2019/8/25 15:14
 * @Version 1.0
 **/
public class TestJDKProxy {

    public static void main(String[] args) {
        JDKMeipo meipo = new JDKMeipo();
        try {
            Person proxy = (Person)meipo.getInstance(new Girl());
            proxy.findlove();

            byte [] bytes = ProxyGenerator.generateProxyClass("$proxy0", new Class[]{Person.class});
            FileOutputStream fos = new FileOutputStream(new File("E://$Proxy.class"));
            fos.write(bytes);
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
