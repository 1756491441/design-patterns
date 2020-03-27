package com.example.designpatterns.strategyPatterns;

/**
 * @ClassName PayMent
 * @Description TODO
 * @Author zhaoxp
 * @Date 2019/8/31 17:09
 * @Version 1.0
 **/
public abstract class PayMent {

    //获取支付方式
    abstract String getPayKey();

    //获取余额
    abstract double getBalance();

    //更新余额
    abstract void minusBalance(double amount);

    //支付
    public void pay(String name, double amount){
        if(amount > getBalance()){
            System.out.println("余额不足，请更换支付方式");
            return;
        }
        System.out.println("支付成功，支付方式为"+getPayKey()+",支付账户为"+name
                +"支付金额为"+amount);
        //扣减余额
        minusBalance(amount);
    }


}
