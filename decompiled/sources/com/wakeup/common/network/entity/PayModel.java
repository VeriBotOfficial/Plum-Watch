package com.wakeup.common.network.entity;

import com.wakeup.common.network.entity.device.DialModel;

/* loaded from: classes2.dex */
public class PayModel {
    public static final String PAYTYPE_DIAL = "DIAL";
    public static final String PAYTYPE_Guardian = "GUARDIAN";
    public static final String PAYTYPE_VIP = "VIP";
    private static PayModel instance;
    public DialModel dialModel;
    public String orderNo;
    private String payType;

    public static synchronized PayModel getInstance() {
        PayModel payModel;
        synchronized (PayModel.class) {
            if (instance == null) {
                instance = new PayModel();
            }
            payModel = instance;
        }
        return payModel;
    }

    public void setDialPay(String payType, DialModel dialModel) {
        this.payType = payType;
        this.dialModel = dialModel;
        this.orderNo = null;
    }

    public DialModel getDialModel() {
        return this.dialModel;
    }

    public void setDialModel(DialModel dialModel) {
        this.dialModel = dialModel;
    }

    public String getPayType() {
        return this.payType;
    }

    public String getOrderNo() {
        return this.orderNo;
    }

    public int getPayDialId() {
        DialModel dialModel = this.dialModel;
        if (dialModel != null) {
            return dialModel.getId();
        }
        return 0;
    }
}
