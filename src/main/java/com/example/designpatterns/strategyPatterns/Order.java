package com.example.designpatterns.strategyPatterns;

/**
 * @ClassName Order
 * @Description TODO
 * @Author zhaoxp
 * @Date 2019/8/31 17:36
 * @Version 1.0
 **/
public class Order {

    private String uid;
    private String goodName;
    private String accountName;
    private double amount;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void pay(){
        PayStrategy payStrategy = new PayStrategy();
        PayMent payMent = payStrategy.getPayKey(PayStrategy.ALI_PAY);
        payMent.pay(this.getAccountName(), this.getAmount());
    }

}
