package com.example.designpatterns.strategyPatterns;

import java.util.regex.Pattern;

/**
 * @ClassName AliPay
 * @Description TODO
 * @Author zhaoxp
 * @Date 2019/8/31 17:19
 * @Version 1.0
 **/
public class AliPay extends PayMent {

    private double balance = 300.0;

    @Override
    String getPayKey() {
        return "支付宝支付";
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
