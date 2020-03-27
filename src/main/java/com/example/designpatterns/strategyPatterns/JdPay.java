package com.example.designpatterns.strategyPatterns;

/**
 * @ClassName JdPay
 * @Description TODO
 * @Author zhaoxp
 * @Date 2019/8/31 17:24
 * @Version 1.0
 **/
public class JdPay extends PayMent {

    private double balance = 120.0;

    @Override
    String getPayKey() {
        return "京东白条支付";
    }

    @Override
    double getBalance() {
        return balance;
    }

    @Override
    void minusBalance(double amount) {
        balance -= amount;
    }
}
