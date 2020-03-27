package com.example.designpatterns.strategyPatterns;

/**
 * @ClassName WechatPay
 * @Description TODO
 * @Author zhaoxp
 * @Date 2019/8/31 17:22
 * @Version 1.0
 **/
public class WechatPay extends PayMent {

    private double balance = 150.0;

    @Override
    String getPayKey() {
        return "微信支付";
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
