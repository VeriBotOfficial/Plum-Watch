package com.wakeup.common.network.entity.user;

/* loaded from: classes2.dex */
public class VipPayModel {
    private String orderNo;
    private String paySign;
    private String payType;
    private int userId;

    public int getUserId() {
        return this.userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getOrderNo() {
        return this.orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getPaySign() {
        return this.paySign;
    }

    public void setPaySign(String paySign) {
        this.paySign = paySign;
    }

    public String getPayType() {
        return this.payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }
}
