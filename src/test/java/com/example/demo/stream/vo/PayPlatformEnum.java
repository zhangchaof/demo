package com.example.demo.stream.vo;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * 支付产品枚举类
 * Created by Katherina on 2018/9/17
 */
public enum PayPlatformEnum {

    WECHAT(100, "微信支付"),
    ALIPAY(200, "支付宝"),
    HA(800, "幸福分期"),
    ALIPAYANT(900, "蚂蚁金服"),
    QUICK(700, "快钱"),
    MUCFC(600, "招联分期"),
    HMD(7001,"交行分期"),
    VIVO(1006,"VIVO支付"),
    BOING(300,"云支付"),
    BAIDU(40011,"百度学费"),
    HMS(400,"华为支付"),
    ;

    private Integer code;
    private String name;

    public Integer getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    PayPlatformEnum(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public static PayPlatformEnum getEnumByCode(String code) {
        List<PayPlatformEnum> payPlatformEnums = Arrays.asList(PayPlatformEnum.values());

        Optional<PayPlatformEnum> any = payPlatformEnums.stream().filter(vo -> Objects.equals(vo.name(), code)).findAny();

        return any.orElse(null);
    }

    public static void main(String[] args) {
        PayPlatformEnum wechat = getEnumByCode("WECHAT");
        System.out.println(wechat);
    }
}
