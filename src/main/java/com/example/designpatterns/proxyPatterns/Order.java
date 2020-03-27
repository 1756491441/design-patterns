package com.example.designpatterns.proxyPatterns;

/**
 * @ClassName Order
 * @Description TODO
 * @Author zhaoxp
 * @Date 2019/8/25 14:31
 * @Version 1.0
 **/
public class Order {

    private int id;
    private String name;
    private Long createTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
}
