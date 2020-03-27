package com.example.designpatterns.strategyPatterns;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @ClassName PayStrategy
 * @Description TODO
 * @Author zhaoxp
 * @Date 2019/8/31 17:26
 * @Version 1.0
 **/
public class PayStrategy {

    public static String ALI_PAY = "AliPay";
    public static String JD_PAY = "JdPay";
    public static String WECHAT_PAY = "WechatPay";
    public static String DEFAULT_PAY = ALI_PAY;

    public static Map<String,PayMent> payMap = new ConcurrentHashMap<>();

    static{
        payMap.put(ALI_PAY, new AliPay());
        payMap.put(JD_PAY, new JdPay());
        payMap.put(WECHAT_PAY, new WechatPay());
    }

    public PayMent getPayKey(String payKey){
        if(payKey != null) {
            return payMap.get(payKey);
        }
        return payMap.get(DEFAULT_PAY);
    }

    public PayMent getPayKey(){
        return payMap.get(DEFAULT_PAY);
    }

}
