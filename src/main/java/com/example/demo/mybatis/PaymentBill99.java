package com.example.demo.mybatis;

import java.math.BigDecimal;
import java.util.Date;

public class PaymentBill99 {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_payment_bill99.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_payment_bill99.merchant_acct_id
     *
     * @mbg.generated
     */
    private Long merchantAcctId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_payment_bill99.pay_serial_no
     *
     * @mbg.generated
     */
    private String paySerialNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_payment_bill99.amount
     *
     * @mbg.generated
     */
    private BigDecimal amount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_payment_bill99.pay_channel
     *
     * @mbg.generated
     */
    private String payChannel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_payment_bill99.pay_type
     *
     * @mbg.generated
     */
    private String payType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_payment_bill99.bank_code
     *
     * @mbg.generated
     */
    private String bankCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_payment_bill99.redo_flag
     *
     * @mbg.generated
     */
    private Integer redoFlag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_payment_bill99.submit_type
     *
     * @mbg.generated
     */
    private String submitType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_payment_bill99.pay_time_out
     *
     * @mbg.generated
     */
    private Integer payTimeOut;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_payment_bill99.out_order_no
     *
     * @mbg.generated
     */
    private String outOrderNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_payment_bill99.status
     *
     * @mbg.generated
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_payment_bill99.mq_event
     *
     * @mbg.generated
     */
    private String mqEvent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_payment_bill99.pay_time
     *
     * @mbg.generated
     */
    private Date payTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_payment_bill99.result_code
     *
     * @mbg.generated
     */
    private String resultCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_payment_bill99.pay_url
     *
     * @mbg.generated
     */
    private String payUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_payment_bill99.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_payment_bill99.update_time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_payment_bill99.aggregate_pay
     *
     * @mbg.generated
     */
    private String aggregatePay;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_payment_bill99.redirect_url
     *
     * @mbg.generated
     */
    private String redirectUrl;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_payment_bill99.id
     *
     * @return the value of t_payment_bill99.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_payment_bill99.id
     *
     * @param id the value for t_payment_bill99.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_payment_bill99.merchant_acct_id
     *
     * @return the value of t_payment_bill99.merchant_acct_id
     *
     * @mbg.generated
     */
    public Long getMerchantAcctId() {
        return merchantAcctId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_payment_bill99.merchant_acct_id
     *
     * @param merchantAcctId the value for t_payment_bill99.merchant_acct_id
     *
     * @mbg.generated
     */
    public void setMerchantAcctId(Long merchantAcctId) {
        this.merchantAcctId = merchantAcctId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_payment_bill99.pay_serial_no
     *
     * @return the value of t_payment_bill99.pay_serial_no
     *
     * @mbg.generated
     */
    public String getPaySerialNo() {
        return paySerialNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_payment_bill99.pay_serial_no
     *
     * @param paySerialNo the value for t_payment_bill99.pay_serial_no
     *
     * @mbg.generated
     */
    public void setPaySerialNo(String paySerialNo) {
        this.paySerialNo = paySerialNo == null ? null : paySerialNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_payment_bill99.amount
     *
     * @return the value of t_payment_bill99.amount
     *
     * @mbg.generated
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_payment_bill99.amount
     *
     * @param amount the value for t_payment_bill99.amount
     *
     * @mbg.generated
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_payment_bill99.pay_channel
     *
     * @return the value of t_payment_bill99.pay_channel
     *
     * @mbg.generated
     */
    public String getPayChannel() {
        return payChannel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_payment_bill99.pay_channel
     *
     * @param payChannel the value for t_payment_bill99.pay_channel
     *
     * @mbg.generated
     */
    public void setPayChannel(String payChannel) {
        this.payChannel = payChannel == null ? null : payChannel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_payment_bill99.pay_type
     *
     * @return the value of t_payment_bill99.pay_type
     *
     * @mbg.generated
     */
    public String getPayType() {
        return payType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_payment_bill99.pay_type
     *
     * @param payType the value for t_payment_bill99.pay_type
     *
     * @mbg.generated
     */
    public void setPayType(String payType) {
        this.payType = payType == null ? null : payType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_payment_bill99.bank_code
     *
     * @return the value of t_payment_bill99.bank_code
     *
     * @mbg.generated
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_payment_bill99.bank_code
     *
     * @param bankCode the value for t_payment_bill99.bank_code
     *
     * @mbg.generated
     */
    public void setBankCode(String bankCode) {
        this.bankCode = bankCode == null ? null : bankCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_payment_bill99.redo_flag
     *
     * @return the value of t_payment_bill99.redo_flag
     *
     * @mbg.generated
     */
    public Integer getRedoFlag() {
        return redoFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_payment_bill99.redo_flag
     *
     * @param redoFlag the value for t_payment_bill99.redo_flag
     *
     * @mbg.generated
     */
    public void setRedoFlag(Integer redoFlag) {
        this.redoFlag = redoFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_payment_bill99.submit_type
     *
     * @return the value of t_payment_bill99.submit_type
     *
     * @mbg.generated
     */
    public String getSubmitType() {
        return submitType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_payment_bill99.submit_type
     *
     * @param submitType the value for t_payment_bill99.submit_type
     *
     * @mbg.generated
     */
    public void setSubmitType(String submitType) {
        this.submitType = submitType == null ? null : submitType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_payment_bill99.pay_time_out
     *
     * @return the value of t_payment_bill99.pay_time_out
     *
     * @mbg.generated
     */
    public Integer getPayTimeOut() {
        return payTimeOut;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_payment_bill99.pay_time_out
     *
     * @param payTimeOut the value for t_payment_bill99.pay_time_out
     *
     * @mbg.generated
     */
    public void setPayTimeOut(Integer payTimeOut) {
        this.payTimeOut = payTimeOut;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_payment_bill99.out_order_no
     *
     * @return the value of t_payment_bill99.out_order_no
     *
     * @mbg.generated
     */
    public String getOutOrderNo() {
        return outOrderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_payment_bill99.out_order_no
     *
     * @param outOrderNo the value for t_payment_bill99.out_order_no
     *
     * @mbg.generated
     */
    public void setOutOrderNo(String outOrderNo) {
        this.outOrderNo = outOrderNo == null ? null : outOrderNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_payment_bill99.status
     *
     * @return the value of t_payment_bill99.status
     *
     * @mbg.generated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_payment_bill99.status
     *
     * @param status the value for t_payment_bill99.status
     *
     * @mbg.generated
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_payment_bill99.mq_event
     *
     * @return the value of t_payment_bill99.mq_event
     *
     * @mbg.generated
     */
    public String getMqEvent() {
        return mqEvent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_payment_bill99.mq_event
     *
     * @param mqEvent the value for t_payment_bill99.mq_event
     *
     * @mbg.generated
     */
    public void setMqEvent(String mqEvent) {
        this.mqEvent = mqEvent == null ? null : mqEvent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_payment_bill99.pay_time
     *
     * @return the value of t_payment_bill99.pay_time
     *
     * @mbg.generated
     */
    public Date getPayTime() {
        return payTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_payment_bill99.pay_time
     *
     * @param payTime the value for t_payment_bill99.pay_time
     *
     * @mbg.generated
     */
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_payment_bill99.result_code
     *
     * @return the value of t_payment_bill99.result_code
     *
     * @mbg.generated
     */
    public String getResultCode() {
        return resultCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_payment_bill99.result_code
     *
     * @param resultCode the value for t_payment_bill99.result_code
     *
     * @mbg.generated
     */
    public void setResultCode(String resultCode) {
        this.resultCode = resultCode == null ? null : resultCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_payment_bill99.pay_url
     *
     * @return the value of t_payment_bill99.pay_url
     *
     * @mbg.generated
     */
    public String getPayUrl() {
        return payUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_payment_bill99.pay_url
     *
     * @param payUrl the value for t_payment_bill99.pay_url
     *
     * @mbg.generated
     */
    public void setPayUrl(String payUrl) {
        this.payUrl = payUrl == null ? null : payUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_payment_bill99.create_time
     *
     * @return the value of t_payment_bill99.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_payment_bill99.create_time
     *
     * @param createTime the value for t_payment_bill99.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_payment_bill99.update_time
     *
     * @return the value of t_payment_bill99.update_time
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_payment_bill99.update_time
     *
     * @param updateTime the value for t_payment_bill99.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_payment_bill99.aggregate_pay
     *
     * @return the value of t_payment_bill99.aggregate_pay
     *
     * @mbg.generated
     */
    public String getAggregatePay() {
        return aggregatePay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_payment_bill99.aggregate_pay
     *
     * @param aggregatePay the value for t_payment_bill99.aggregate_pay
     *
     * @mbg.generated
     */
    public void setAggregatePay(String aggregatePay) {
        this.aggregatePay = aggregatePay == null ? null : aggregatePay.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_payment_bill99.redirect_url
     *
     * @return the value of t_payment_bill99.redirect_url
     *
     * @mbg.generated
     */
    public String getRedirectUrl() {
        return redirectUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_payment_bill99.redirect_url
     *
     * @param redirectUrl the value for t_payment_bill99.redirect_url
     *
     * @mbg.generated
     */
    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl == null ? null : redirectUrl.trim();
    }
}