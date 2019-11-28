package com.example.demo.stream.vo;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.ToString;

/**
 * @Author: zcf
 * @Date: 2019/7/12 11:40
 */
@ToString
public class Cat {

    public Cat() {
        System.out.println("\"Const cat\" = " + "Const cat");
    }

    @JSONField(name = "na")
    private String name;

    private String last;

    private String last2;

    @JSONField(name = "la")
    public String getLast2() {
        return last2;
    }

    public void setLast2(String last2) {
        this.last2 = last2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast() {
        return last;
    }

    @JSONField(name = "la")
    public void setLast(String last) {
        this.last = last;
    }



}
