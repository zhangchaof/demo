package com.example.demo.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import java.util.HashMap;
import java.util.Map;

/**
 * 监听状态处理
 * 1 自有业务处理
 * 2 通知内部服务处理
 * @author pingding.zheng
 */
@Component
@Slf4j
public class OrderStatusListener implements ApplicationListener<OrderStatusEvent> {

    private static Map<String, String> statusMap = new HashMap();
    static {
        // val 0 待提交 4 审批中 5 审批通过 6 贷款失败 9 贷款成功
        // key
        /*
        * TO_COMMIT("0", "待提交"),
          AUDITING("1", "审批中"),
          PASS("2", "审批通过"),
          FAIL("3", "审批失败"),
          USED_SUCCESS("4", "提用成功"),
          USED_FAIL("5", "提用失败"),
          CANCEL("6", "已取消"),
          ZM_COMMIT("999", "掌门侧提交");
        */
        statusMap.put("999", "4");
        statusMap.put("0", "0");
        statusMap.put("1", "4");
        statusMap.put("2", "5");
        statusMap.put("3", "6");
        statusMap.put("4", "9");
        statusMap.put("5", "6");
        statusMap.put("6", "6");
    }



    @Override
    public void onApplicationEvent(OrderStatusEvent event) {
        Assert.notNull(event, "监听订单实体不能为空");
        Assert.notNull(event.getOrderId(), "监听订单实体订单不能为空");
        Assert.notNull(event.getCurrentStatus(), "监听订单实体订单状态不能为空");
        log.info("{}",event);
    }

}
