package com.example.demo.listener;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

/**
 * 交行处理订单状态监听
 *
 * @author pingding.zheng
 */
@Setter
@Getter
public class OrderStatusEvent extends ApplicationEvent {
    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public OrderStatusEvent(Object source) {
        super(source);
    }

    public OrderStatusEvent(String orderId, String status, String tranTime, String reason) {
        this("OrderStatusEvent");
        this.orderId = orderId;
        this.currentStatus = status;
        this.tranTime = tranTime;
        this.failReason = reason;
    }

    /* 订单编号 */
    private String orderId;

    /* 当前订单状态*/
    private String currentStatus;

    /* 处理时间 */
    private String tranTime;

    /* 失败原因 */
    private String failReason;

}
